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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartschool.bean.StudentBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.StudentService;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/student")
public class StudentController {

	private static final String REDIRECT_LIST_STUDENTINFO = "redirect:listStudentInformation";
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="createStudentInfoPage", method=RequestMethod.GET)
	public String createStudentPage(HttpServletRequest request, Model model){
		
			model.addAttribute("studentBean", new StudentBean());
			
		return ViewConstants.SHOW_CREATE_STUDENTINFO;
	}
	
	@RequestMapping(value = "saveStudent", method = RequestMethod.POST)
	public String saveBankDetails(@ModelAttribute("studentBean") StudentBean studentBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
		long createdBy = SessionUtil.getUserId(request);
		studentBean.setRecUpdatedById(createdBy);
		studentBean.setRecUpdatedDate(new Date());
		try {
			if(studentBean.getStudentId() == 0){
				studentBean.setRecCreatedById(createdBy);
				studentBean.setRecCreatedDate(new Date());
				
				studentService.createStudentInfo(studentBean);
				redirectAttributes.addFlashAttribute("message", "Student information created successfully!");
			}else {
				studentService.updateStudentInfo(studentBean);
				redirectAttributes.addFlashAttribute("message", "Student information updated successfully !");
				}			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Student information.");
		}
		
		return REDIRECT_LIST_STUDENTINFO;
	}
	
	@RequestMapping(value = "listStudentInformation", method = RequestMethod.GET)
	public String getAllStudentInformation(Model model){
		model.addAttribute("studentInformationList", studentService.getAllStudentInfo());
		return ViewConstants.SHOW_STUDENTINFO_LIST;
	}
	
	@RequestMapping(value="editStudentInformation", method = RequestMethod.GET)
	public String editStudentInformation(@RequestParam("studentId") long studentId, HttpServletRequest request, Model model){
		model.addAttribute("studentBean", studentService.getStudentById(studentId));
		return ViewConstants.SHOW_CREATE_STUDENTINFO;
	}
}
