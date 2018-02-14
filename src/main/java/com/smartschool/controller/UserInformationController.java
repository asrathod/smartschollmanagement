package com.smartschool.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartschool.bean.UserAddressBean;
import com.smartschool.bean.UserInformationBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.UserAddressService;
import com.smartschool.service.UserInformationService;
import com.smartschool.service.UserRolesService;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/user")
public class UserInformationController {
	
	private static final String REDIRECT_LIST_USERI_NFO = "redirect:listUserInformation";
	private static final String REDIRECT_LIST_USER_ADD = "redirect:listAddress";
	
	@Autowired
	private UserInformationService UserInformationService;
	
	@Autowired
	private UserRolesService userRolesService;
	
	@Autowired
	private UserAddressService userAddressService;
	
	@RequestMapping(value="createUserInfoPage", method=RequestMethod.GET)
	public String createUserInformationPage(HttpServletRequest request, Model model){
		
			model.addAttribute("userInformationBean", new UserInformationBean());
			model.addAttribute("roleBeansList", userRolesService.getAllUserRoles());
			
		return ViewConstants.SHOW_CREATE_USERI_NFO;
	}
	
	@RequestMapping(value = "saveUserInformation", method = RequestMethod.POST)
	public String saveUserInformation(@ModelAttribute("userInformationBean") UserInformationBean userInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
		long createdBy = SessionUtil.getUserId(request);
		userInformationBean.setRecUpdatedById(createdBy);
		userInformationBean.setRecUpdatedDate(new Date());
		try {
			if(userInformationBean.getUserId() == 0){
				userInformationBean.setRecCreatedById(createdBy);
				userInformationBean.setRecCreatedDate(new Date());
				
				UserInformationService.createUserInformation(userInformationBean);
				redirectAttributes.addFlashAttribute("message", "User information created successfully!");
			}else {
				UserInformationService.updateUserInformation(userInformationBean);
				redirectAttributes.addFlashAttribute("message", "User information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the User information.");
		}
		
		return REDIRECT_LIST_USERI_NFO;
	}
	
	@RequestMapping(value = "listUserInformation", method = RequestMethod.GET)
	public String getAllUserInformation(Model model){
		model.addAttribute("userInformationBeanList", UserInformationService.getAllUserInformation());
		return ViewConstants.SHOW_USER_INFO_LIST;
	}
	
	// user address controller
	@RequestMapping(value="createAddressPage", method=RequestMethod.GET)
	public String createAddressPage(HttpServletRequest request, Model model){
		
			model.addAttribute("userAddressBean", new UserAddressBean());
			model.addAttribute("UserInformationBeansList", UserInformationService.getAllUserInformation());
			
		return ViewConstants.SHOW_CREATE_USER_ADD_NFO;
	}
	
	@RequestMapping(value = "saveAddress", method = RequestMethod.POST)
	public String saveAddress(@ModelAttribute("userAddressBean") UserAddressBean userAddressBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
		long createdBy = SessionUtil.getUserId(request);
		userAddressBean.setRecUpdatedById(createdBy);
		userAddressBean.setRecUpdatedDate(new Date());
		try {
			if(userAddressBean.getAddressId() == 0){
				userAddressBean.setRecCreatedById(createdBy);
				userAddressBean.setRecCreatedDate(new Date());
				
				userAddressService.createAddressInfo(userAddressBean);
				redirectAttributes.addFlashAttribute("message", "User Address Information created successfully!");
			}else {
				userAddressService.updateAddress(userAddressBean);
				redirectAttributes.addFlashAttribute("message", "User Address Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the User Address Information.");
		}
		
		return REDIRECT_LIST_USER_ADD;
	}
	
	@RequestMapping(value = "listAddress", method = RequestMethod.GET)
	public String listAddress(Model model){
		model.addAttribute("userAddressBeanList", userAddressService.getAllAddresses());
		return ViewConstants.SHOW_USER_ADD_LIST;
	}
}
