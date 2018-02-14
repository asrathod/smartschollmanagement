package com.smartschool.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartschool.bean.AchievementsInformationBean;
import com.smartschool.bean.ExtraCurricularInformationBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.AchievementsInformationService;
import com.smartschool.service.ExtraCurricularInformationService;
import com.smartschool.service.StudentService;
import com.smartschool.util.FileUploadUtiliy;
import com.smartschool.util.SessionUtil;

@Controller
@RequestMapping("/extraCurricular")
public class ExtraCurricularInfoController {
	
	private static final String REDIRECT_LIST_EXTRA_CURRICULAR_INFO = "redirect:listExtraCurricularInfo";
	private static final String REDIRECT_LIST_ACHIEVMENTS_INFO = "redirect:listAchievementsInfo";

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ExtraCurricularInformationService extraCurricularInformationService;
	
	@Autowired
	private AchievementsInformationService achievementsInformationService;
	
	@RequestMapping(value="createExtraCurricularPage", method=RequestMethod.GET)
	public String createExtraCurricularPage(HttpServletRequest request, Model model){
		
		model.addAttribute("extraCurricularInformationBean", new ExtraCurricularInformationBean());
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_EXTRA_CURRICULAR_INFO;
	}
	
	@RequestMapping(value="editExtraCurricular", method = RequestMethod.GET)
	public String editExtraCurricular(@RequestParam("extraCurrInfoId") long extraCurrInfoId, HttpServletRequest request, Model model){
		model.addAttribute("extraCurricularInformationBean", extraCurricularInformationService.getExtraCurricularInformationById(extraCurrInfoId));
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
		return ViewConstants.SHOW_CREATE_EXTRA_CURRICULAR_INFO;
	}
	
	@RequestMapping(value = "saveExtraCurricularInfo", method = RequestMethod.POST)
	public String savePersonalInfo(@ModelAttribute("extraCurricularInformationBean") ExtraCurricularInformationBean extraCurricularInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		extraCurricularInformationBean.setRecUpdatedById(createdBy);
		extraCurricularInformationBean.setRecUpdatedDate(new Date());
		try {
			if(extraCurricularInformationBean.getExtraCurrInfoId() == 0){
				extraCurricularInformationBean.setRecCreatedById(createdBy);
				extraCurricularInformationBean.setRecCreatedDate(new Date());
				
				
				extraCurricularInformationService.createExtraCurricularInformation(extraCurricularInformationBean);
				redirectAttributes.addFlashAttribute("message", "Extra Curricular Information created successfully!");
			}else {
				extraCurricularInformationService.updateExtraCurricularInformation(extraCurricularInformationBean);
				redirectAttributes.addFlashAttribute("message", "Curricular Information updated successfully !");
				}	
			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Curricular Information.");
		}
		
		return REDIRECT_LIST_EXTRA_CURRICULAR_INFO;
	}
	
	@RequestMapping(value = "listExtraCurricularInfo", method = RequestMethod.GET)
	public String getAllAcademicInformation(Model model){
		model.addAttribute("extraCurricularInformationBeanList", extraCurricularInformationService.getAllExtraCurricularInformation());
		return ViewConstants.SHOW_EXTRA_CURRICULAR_INFO_LIST;
	}
	
	@RequestMapping("deleteExtraCurricular")
	public ModelAndView deleteExtraCurricular(@RequestParam("id") long extraCurrInfoId, RedirectAttributes redirectAttributes) {		
		try{
			extraCurricularInformationService.deleteExtraCurricularInformation(extraCurrInfoId);
			redirectAttributes.addFlashAttribute("message", "ExtraCurricular deleted successfully !");
		}catch(Exception ex){
			ex.printStackTrace();
			redirectAttributes.addFlashAttribute("error", "Failed to delete ExtraCurricular." );
		}
		
		return new ModelAndView("redirect:listExtraCurricularInfo");
	}
	
	@RequestMapping(value="createAchievementsPage", method=RequestMethod.GET)
	public String createAchievementsInfoPage( HttpServletRequest request, Model model){
		
		model.addAttribute("achievementsInformationBean", new AchievementsInformationBean());
		
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
			
		return ViewConstants.SHOW_CREATE_ACHIEVMENTS_INFO;
	}
	

	@RequestMapping(value = "saveAchievementsInfo", method = RequestMethod.POST)
	public String saveAchievementsInfo(@ModelAttribute("achievementsInformationBean") AchievementsInformationBean achievementsInformationBean, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes){
	
		long createdBy = SessionUtil.getUserId(request);
		achievementsInformationBean.setRecUpdatedById(createdBy);
		achievementsInformationBean.setRecUpdatedDate(new Date());
		try {
			if(achievementsInformationBean.getAchievInfoId() == 0){
				
			//	AchievementsInformationBean achievementId = achievementsInformationService.getAchievementsInformationById(achievementsInformationBean.getAchievInfoId());
				
				achievementsInformationBean.setRecCreatedById(createdBy);
				achievementsInformationBean.setRecCreatedDate(new Date());
				
				
				achievementsInformationService.createAchievementsInformation(achievementsInformationBean);
				redirectAttributes.addFlashAttribute("message", "Achievements Information created successfully!");
			}else {
				achievementsInformationService.updateAchievementsInformation(achievementsInformationBean);
				redirectAttributes.addFlashAttribute("message", "Achievements Information updated successfully !");
				}	
			
			if(!achievementsInformationBean.getFile().getOriginalFilename().equals("")){
				FileUploadUtiliy.uploadFile(request, achievementsInformationBean.getFile(), achievementsInformationBean.getCode());
			}
			
			}catch(Exception ex) {
			redirectAttributes.addFlashAttribute("error", "Exception occured while creating the Achievements Information.");
		}
		
		return REDIRECT_LIST_ACHIEVMENTS_INFO;
	}
	
	@RequestMapping(value = "listAchievementsInfo", method = RequestMethod.GET)
//	@ResponseBody
	public String getAllAchievementsInformation(Model model){
		model.addAttribute("achievementsInformationBeanList", achievementsInformationService.getAllAchievementsInformation());
		return ViewConstants.SHOW_ACHIEVMENTS_INFO_LIST;
	}
	
	@RequestMapping(value="editAchievements", method = RequestMethod.GET)
	public String editAchievements(@RequestParam("id") long achievInfoId, HttpServletRequest request, Model model){
		model.addAttribute("achievementsInformationBean", achievementsInformationService.getAchievementsInformationById(achievInfoId));
		model.addAttribute("studenBeansList", studentService.getAllStudentInfo());
		return ViewConstants.SHOW_CREATE_ACHIEVMENTS_INFO;
	}
	
	@RequestMapping("deleteAchievements")
	public ModelAndView deleteSalaryStructure(@RequestParam("id") long achievInfoId, RedirectAttributes redirectAttributes) {		
		try{
			achievementsInformationService.deleteAchievementsInformation(achievInfoId);
			redirectAttributes.addFlashAttribute("message", "Achievements deleted successfully !");
		}catch(Exception ex){
			ex.printStackTrace();
			redirectAttributes.addFlashAttribute("error", "Failed to delete Achievements." );
		}
		
		return new ModelAndView("redirect:listAchievementsInfo");
	}
}
