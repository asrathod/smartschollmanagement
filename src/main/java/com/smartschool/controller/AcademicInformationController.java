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

import com.smartschool.bean.AcademicInformationBean;
import com.smartschool.bean.PreviousAcademicInfoBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.AcademicInformationService;
import com.smartschool.service.PreviousAcademicInfoService;
import com.smartschool.service.StudentService;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/academic")
public class AcademicInformationController {
	
	private static final String REDIRECT_LIST_ACADEMIC_INFO = "redirect:listAcademicInfo";
	private static final String REDIRECT_LIST_PREVIOUS_ACADEMIC_INFO = "redirect:listPreviousAcademic";
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private AcademicInformationService academicInformationService;
	
	@Autowired
	private PreviousAcademicInfoService previousAcademicInfoService;
	
	@RequestMapping(value="createAcademicInfoPage", method=RequestMethod.GET)
	public String createAcademicInformationPage(HttpServletRequest request, Model model){
		
		model.addAttribute("academicInformationBean", new AcademicInformationBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_ACADEMIC_INFO;
	}
	
	@RequestMapping(value = "saveAcademic", method = RequestMethod.POST)
	public String savePersonalInfo(@ModelAttribute("academicInformationBean") AcademicInformationBean academicInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		academicInformationBean.setRecUpdatedById(createdBy);
		academicInformationBean.setRecUpdatedDate(new Date());
		try {
			if(academicInformationBean.getAcademicInfoId() == 0){
				academicInformationBean.setRecCreatedById(createdBy);
				academicInformationBean.setRecCreatedDate(new Date());
				
				
				academicInformationService.createAcademicInfo(academicInformationBean);
				redirectAttributes.addFlashAttribute("message", "Academic Information created successfully!");
			}else {
				academicInformationService.updateAcademicInformationBean(academicInformationBean);
				redirectAttributes.addFlashAttribute("message", "Academic Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Academic Information.");
		}
		
		return REDIRECT_LIST_ACADEMIC_INFO;
	}
	
	@RequestMapping(value = "listAcademicInfo", method = RequestMethod.GET)
	public String getAllAcademicInformation(Model model){
		model.addAttribute("academicInformationBeanList", academicInformationService.getAllAcademicInformationBean());
		return ViewConstants.SHOW_ACADEMIC_INFO_LIST;
	}
	
	
	@RequestMapping(value="createPreviousAcademicInfoPage", method=RequestMethod.GET)
	public String createPreviousAcademicInformationPage(HttpServletRequest request, Model model){
		
		model.addAttribute("previousAcademicInfoBean", new PreviousAcademicInfoBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_PREVIOUS_ACADEMIC_INFO;
	}
	
	@RequestMapping(value = "savePreviousAcademic", method = RequestMethod.POST)
	public String savePreviousAcademicInfo(@ModelAttribute("previousAcademicInfoBean") PreviousAcademicInfoBean previousAcademicInfoBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		previousAcademicInfoBean.setRecUpdatedById(createdBy);
		previousAcademicInfoBean.setRecUpdatedDate(new Date());
		try {
			if(previousAcademicInfoBean.getPreviousAcaInfoId() == 0){
				previousAcademicInfoBean.setRecCreatedById(createdBy);
				previousAcademicInfoBean.setRecCreatedDate(new Date());
				
				
				previousAcademicInfoService.createPreviousAcademicInfo(previousAcademicInfoBean);
				redirectAttributes.addFlashAttribute("message", "Previous Academic Information created successfully!");
			}else {
				previousAcademicInfoService.updatePreviousAcademicInfoBean(previousAcademicInfoBean);
				redirectAttributes.addFlashAttribute("message", "Previous Academic Information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Previous Academic Information.");
		}
		
		return REDIRECT_LIST_PREVIOUS_ACADEMIC_INFO;
	}
	
	@RequestMapping(value = "listPreviousAcademic", method = RequestMethod.GET)
	public String getAllPreviousAcademicInformation(Model model){
		model.addAttribute("previousAcademicInformationBeanList", previousAcademicInfoService.getAllPreviousAcademicInfoBean());
		return ViewConstants.SHOW_PREVIOUS_ACADEMIC_INFO_LIST;
	}
}
