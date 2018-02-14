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

import com.smartschool.bean.ContactInfoBean;
import com.smartschool.bean.ParentsInformationBean;
import com.smartschool.bean.PersonalInformationBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.ContactInfoService;
import com.smartschool.service.ParentsInformationService;
import com.smartschool.service.PersonalInformationService;
import com.smartschool.service.StudentService;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/personal")
public class PersonalInformationController {
	
	private static final String REDIRECT_LIST_PERSONAL_INFO = "redirect:listPersonalInformation";
	private static final String REDIRECT_LIST_CONTACT_INFO = "redirect:listContactInfo";

	@Autowired
	private PersonalInformationService personalInformationService;
	
	@Autowired
	private ContactInfoService contactInfoService;
	
	@Autowired
	private ParentsInformationService parentsInformationService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="createPersonalInfoPage", method=RequestMethod.GET)
	public String createPersonalInformationPage(HttpServletRequest request, Model model){
		
		model.addAttribute("personalInformationBean", new PersonalInformationBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_PERSONALINFO;
	}
	
	@RequestMapping(value = "savePersonalInformation", method = RequestMethod.POST)
	public String savePersonalInfo(@ModelAttribute("personalInformationBean") PersonalInformationBean personalInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	//	long studentId = 0;
		long createdBy = SessionUtil.getUserId(request);
	//	personalInformationBean.setStudentId(studentId);
	//	StudentBean studentBean = studentService.getStudentById(studentId);
		personalInformationBean.setRecUpdatedById(createdBy);
		personalInformationBean.setRecUpdatedDate(new Date());
		try {
			if(personalInformationBean.getPersonalInfoId() == 0){
				personalInformationBean.setRecCreatedById(createdBy);
				personalInformationBean.setRecCreatedDate(new Date());
				
				
				personalInformationService.createPersonalInformation(personalInformationBean);
				redirectAttributes.addFlashAttribute("message", "Personal Information created successfully!");
			}else {
				personalInformationService.updatePersonalInformation(personalInformationBean);
				redirectAttributes.addFlashAttribute("message", "Personal Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Personal information.");
		}
		
		return REDIRECT_LIST_PERSONAL_INFO;
	}
	
	@RequestMapping(value = "listPersonalInformation", method = RequestMethod.GET)
	public String getAllPersonalInformation(Model model){
		model.addAttribute("personalInformationList", personalInformationService.getAllPersonalInformation());
		return ViewConstants.SHOW_PERSONALINFO_LIST;
	}
	
	@RequestMapping(value="createContactInfoPage", method=RequestMethod.GET)
	public String createContactInfoPage(HttpServletRequest request, Model model){
		
		model.addAttribute("contactInfoBean", new ContactInfoBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_CONTACT_INFO;
	}
	
	@RequestMapping(value = "saveContactInfo", method = RequestMethod.POST)
	public String saveContactInfo(@ModelAttribute("contactInfoBean") ContactInfoBean contactInfoBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		contactInfoBean.setRecUpdatedById(createdBy);
		contactInfoBean.setRecUpdatedDate(new Date());
		try {
			if(contactInfoBean.getContactInfoId() == 0){
				contactInfoBean.setRecCreatedById(createdBy);
				contactInfoBean.setRecCreatedDate(new Date());
				
				
				contactInfoService.createContactInfo(contactInfoBean);
				redirectAttributes.addFlashAttribute("message", "v Information created successfully!");
			}else {
				contactInfoService.updateContactInformation(contactInfoBean);
				redirectAttributes.addFlashAttribute("message", "Contact Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Contact information.");
		}
		
		return REDIRECT_LIST_CONTACT_INFO;
	}
	
	@RequestMapping(value = "listContactInfo", method = RequestMethod.GET)
	public String getAllContactInformation(Model model){
		model.addAttribute("contactInformationList", contactInfoService.getAllContactInformation());
		return ViewConstants.SHOW_CONTACT_INFO_LIST;
	}
	
	@RequestMapping(value="createParentsInfoPage", method=RequestMethod.GET)
	public String createParentsInfoPage(HttpServletRequest request, Model model){
		
		model.addAttribute("parentsInformationBean", new ParentsInformationBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_PARENTS_INFO;
	}
	
	@RequestMapping(value = "saveParentsInfo", method = RequestMethod.POST)
	public String saveParentsInfo(@ModelAttribute("parentsInformationBean") ParentsInformationBean parentsInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		parentsInformationBean.setRecUpdatedById(createdBy);
		parentsInformationBean.setRecUpdatedDate(new Date());
		try {
			if(parentsInformationBean.getParentsInfoId() == 0){
				parentsInformationBean.setRecCreatedById(createdBy);
				parentsInformationBean.setRecCreatedDate(new Date());
				
				
				parentsInformationService.createParentsInfo(parentsInformationBean);
				redirectAttributes.addFlashAttribute("message", "Parents Information created successfully!");
			}else {
				parentsInformationService.updateParentsInformation(parentsInformationBean);
				redirectAttributes.addFlashAttribute("message", "Parents Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Parents information.");
		}
		
		return REDIRECT_LIST_CONTACT_INFO;
	}
	
	@RequestMapping(value = "listParentsInfo", method = RequestMethod.GET)
	public String getAllParentsInformation(Model model){
		model.addAttribute("parentsInformationBeanList", parentsInformationService.getAllParentsInformation());
		return ViewConstants.SHOW_PARENTS_INFO_LIST;
	}
	
}
