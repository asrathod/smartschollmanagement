package com.smartschool.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartschool.bean.AcademicInformationBean;
import com.smartschool.bean.ExperienceInformationBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.ExperienceInformationService;
import com.smartschool.service.UserInformationService;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/experience")
public class ExperienceInformationController {
	
	private static final String REDIRECT_LIST_USER_EXP_INFO = "redirect:listExperienceInfo";
	
	@Autowired
	private UserInformationService userInformationService;
	
	@Autowired
	private ExperienceInformationService experienceInformationService;
	
	@InitBinder
	public void bindingPreparation(WebDataBinder binder) {
	  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	  CustomDateEditor orderDateEditor = new CustomDateEditor(dateFormat, true);
	  binder.registerCustomEditor(Date.class, orderDateEditor);
	}
	
	@RequestMapping(value="createExperienceInfoPage", method=RequestMethod.GET)
	public String createExperienceInformationPage(HttpServletRequest request, Model model){
		
		model.addAttribute("experienceInfoBean", new ExperienceInformationBean());
		model.addAttribute("userBeansList", userInformationService.getAllUserInformation());
			
		return ViewConstants.SHOW_CREATE_USER_EXP_INFO;
	}
	
	@RequestMapping(value = "saveExperience", method = RequestMethod.POST)
	public String savePersonalInfo(@ModelAttribute("experienceInfoBean") ExperienceInformationBean experienceInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		experienceInformationBean.setRecUpdatedById(createdBy);
		experienceInformationBean.setRecUpdatedDate(new Date());
		try {
			if(experienceInformationBean.getExpInfoId() == 0){
				experienceInformationBean.setRecCreatedById(createdBy);
				experienceInformationBean.setRecCreatedDate(new Date());
				
				
				experienceInformationService.createExperienceInformation(experienceInformationBean);
				redirectAttributes.addFlashAttribute("message", "Experience Information created successfully!");
			}else {
				experienceInformationService.updateExperienceInformation(experienceInformationBean);
				redirectAttributes.addFlashAttribute("message", "Experience Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Experience Information.");
		}
		
		return REDIRECT_LIST_USER_EXP_INFO;
	}
	
	@RequestMapping(value = "listExperienceInfo", method = RequestMethod.GET)
	public String getAllAcademicInformation(Model model){
		model.addAttribute("experienceInformationBeanList", experienceInformationService.getAllExperienceInformation());
		return ViewConstants.SHOW_USER_EXP_INFO_LIST;
	}
	
	@RequestMapping(value="editExperienceInfo", method = RequestMethod.GET)
	public String editExperienceInformation(@RequestParam("expInfoId") long expInfoId, HttpServletRequest request, Model model){
		model.addAttribute("experienceInfoBean", experienceInformationService.getExperienceInformationById(expInfoId));
		model.addAttribute("userBeansList", userInformationService.getAllUserInformation());
		return ViewConstants.SHOW_CREATE_USER_EXP_INFO;
	}
	
	@RequestMapping("deleteExperienceInfo")
	public ModelAndView deletePersonalInfo(@RequestParam long expInfoId, RedirectAttributes redirectAttributes) {		
		
		try{
			experienceInformationService.deleteExperienceInformationBean(expInfoId);
			redirectAttributes.addFlashAttribute("message", "Experience Info deleted successfully !");
		}catch(Exception ex){
			ex.printStackTrace();
			redirectAttributes.addFlashAttribute("error", "Failed to delete Experience Info." );
		}
		
		return new ModelAndView("redirect:listExperienceInfo");
	}
}
