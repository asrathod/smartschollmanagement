package com.smartschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartschool.bean.UserInformationBean;
import com.smartschool.common.ViewConstants;
import com.smartschool.service.StudentService;
import com.smartschool.service.UserInformationService;
import com.smartschool.util.PasswordUtility;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @author Anand_Rathod
 *
 */
@Controller
@RequestMapping("/login/")
public class LoginController {

	private static final String REDIRECT_LOGIN_PAGE = "redirect:/login/loginPage";
	private static final String REDIRECT_HOME_PAGE = "redirect:/login/home";

	@Autowired
	private UserInformationService userInformationService;
	
	@Autowired
	private StudentService studentService;
	
	/*@Autowired
	private NotificationService notificationService;*/

	@RequestMapping(value="loginPage")
	public String loginPage(Model model ) {
		model.addAttribute("userInformationBean", new UserInformationBean());
		return ViewConstants.SHOW_LOGIN_PAGE;
	}
	
	@RequestMapping(value="home")
	public String homePage(Model model ) {
	//	model.addAttribute("userBean", new UserBean());
		return ViewConstants.PAYROLL_HOME_PAGE;
	}

	@RequestMapping(value ="/checkUserCredential", method=RequestMethod.POST)
	public String checkUserCredential(@ModelAttribute("userInformationBean") UserInformationBean userInformationBean, HttpServletRequest request, RedirectAttributes redirectAttributes) {

		if(userInformationBean != null) {
			String userEid = userInformationBean.getUserEid();
			String password = userInformationBean.getUserPassword();
			if( StringUtils.isNotBlank(userEid) && StringUtils.isNotBlank(password)){
				UserInformationBean userInformationBeanByEid = null;
				try{ 
					userInformationBeanByEid = userInformationService.getUserInformatioByEid(userEid);		
					if(userInformationBeanByEid == null){
						redirectAttributes.addFlashAttribute("error", "Invalid Employee ID");
						return REDIRECT_LOGIN_PAGE;
					}else{

						String encryptedPassword =  new String(userInformationBeanByEid.getUserPassword());
						String passwordSalt =  new String(userInformationBeanByEid.getPasswordSalt());
						String securedPassword = null;
						securedPassword =PasswordUtility.getSecurePassword(password, passwordSalt);

						if(StringUtils.equals(encryptedPassword, securedPassword)){
							HttpSession session = request.getSession();
							session.setAttribute("userInformationBean", userInformationBeanByEid);
							session.setAttribute("userId", userInformationBeanByEid.getUserId());
							session.setAttribute("userEid", userInformationBeanByEid.getUserEid());
							session.setAttribute("firstName", userInformationBeanByEid.getFirstName());
							session.setAttribute("midileName", userInformationBeanByEid.getMidileName());
							session.setAttribute("lastName", userInformationBeanByEid.getLastName());
					//		session.setAttribute("locationId", userInformationBeanByEid.getLocationId());
					//		session.setAttribute("locationName", userBeanByEid.getLocationName());
							session.setAttribute("userEmail", userInformationBeanByEid.getUserEmail());
							session.setAttribute("roleId", userInformationBeanByEid.getRoleId());
					//		session.setAttribute("managerId", userBeanByEid.getManagerId());
					//		session.setAttribute("stdentId", userInformationBeanByEid.);
							return REDIRECT_HOME_PAGE;

						}else{
							redirectAttributes.addFlashAttribute("error", "Incorrect Password");
							return REDIRECT_LOGIN_PAGE;
						}

					}

				} catch(RuntimeException ex) {
					redirectAttributes.addFlashAttribute("error", ex.getMessage());
					return REDIRECT_LOGIN_PAGE;
				}

			}	
		}
		redirectAttributes.addFlashAttribute("error", "Invalid Employee ID /Password");
		return REDIRECT_LOGIN_PAGE;
	}
	
	@RequestMapping(value="forgotPassword", method=RequestMethod.GET)
	public String forgotPasswordPage(){
		return ViewConstants.SHOW_FORGOT_PASSWORD_PAGE;
	}
	
	@RequestMapping(value="recoverPassword", method={ RequestMethod.GET, RequestMethod.POST })
	public String recoverPassword(HttpServletRequest request, RedirectAttributes redirectAttributes){
		String userEid = request.getParameter("EID");
		if(StringUtils.isNotBlank(userEid)){
			try {
				UserInformationBean userInformationBean = userInformationService.getUserInformatioByEid(userEid);									
				if(userInformationBean == null ){
					redirectAttributes.addFlashAttribute("error", "Invalid EID");
					return "redirect:forgotPassword";
				}else{
					String pass = PasswordUtility.generateRandomString();
					String saltPassword = PasswordUtility.getSalt();
					String securedPassword = PasswordUtility.getSecurePassword(pass, saltPassword);
					
					userInformationBean.setUserPassword(securedPassword);
					userInformationBean.setPasswordSalt(saltPassword);
					userInformationBean.setRecUpdatedById(1);
					userInformationBean.setRecUpdatedDate(new Date());
					
					userInformationService.updateUserInformation(userInformationBean);
					
					String username = userInformationBean.getFirstName();
					if(userInformationBean.getLastName() != null && !userInformationBean.getLastName().isEmpty()){
						username = userInformationBean.getFirstName()+" "+userInformationBean.getLastName();
					}
					
					
			//		forgotPasswordNotification(userInformationBean,PayrollEmailContent.PASSWORD_RESET_SUBJECT,PayrollEmailContent.getForgotPasswordBody(username, userInformationBean.getUserEid(), pass));
					redirectAttributes.addFlashAttribute("message", "New Password has been sent via Email");
				}
			} catch(RuntimeException ex) {
				ex.printStackTrace();
				redirectAttributes.addFlashAttribute("error", "Sorry Some Technical Error Occured. Try again....");
				return "redirect:forgotPassword";
			}
			
		}
		return REDIRECT_LOGIN_PAGE;
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String ensysLogout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute("userId");
		session.removeAttribute("userInformationBean");
		session.removeAttribute("userId");
		session.removeAttribute("userEid");
		session.removeAttribute("firstName");
		session.removeAttribute("midileName");
		session.removeAttribute("lastName");
	//	session.removeAttribute("locationId");
	//	session.removeAttribute("locationName");
		session.removeAttribute("userEmail");
		session.removeAttribute("userRoleId");
	//	session.removeAttribute("managerId");
	//	session.removeAttribute("stdentId");
		session.invalidate();		
		return REDIRECT_LOGIN_PAGE;
	}
	
	/*private void forgotPasswordNotification(UserInformationBean toUserBean, String subject, String body){
		PayrollNotificationUtil payrollNotificationUtil = new PayrollNotificationUtil();
		NotificationBean notificationBean = payrollNotificationUtil.getNotificationBean(toUserBean,null,toUserBean.getUserId(), subject, body);
		notificationService.createNotification(notificationBean);
	}*/
	
}
