package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.UserInformationBean;
import com.smartschool.dao.UserInformationDao;
import com.smartschool.entity.UserInformation;
import com.smartschool.entity.UserRoles;
import com.smartschool.util.HibernateUtil;

@Repository
public class UserInformationImpl implements UserInformationDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createUserInformation(UserInformationBean userInformationBean) {
		UserInformation userInformation = convertUserInformationBeanToEntity(userInformationBean);
		
			long userInformationId = (long) hibernateUtil.create(userInformation);
			return userInformationId; 
	}

	@Override
	public UserInformationBean getUserInformationById(long userId) {
		UserInformation userInformation = hibernateUtil.fetchById(userId, UserInformation.class);
		return convertUserInformationEntityToBean(userInformation);
	}
	
	@Override
	public UserInformationBean getUserInformatioByEid(String userEid) {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM UserInformation as ui WHERE ui.userEid = :userEid");
		query.setParameter("userEid", userEid);
		UserInformation userInformation =  (UserInformation) query.uniqueResult();
		if(userInformation == null){
			return null;
		}else{
			return convertUserInformationEntityToBean(userInformation); 
		}
	}
	
	@Override
	public UserInformationBean updateUserInformation(UserInformationBean userInformationBean) {
		UserInformation userInformation = convertUserInformationBeanToEntity(userInformationBean);
		userInformation = hibernateUtil.update(userInformation);
		return convertUserInformationEntityToBean(userInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserInformationBean> getAllUserInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM UserInformation");
		return getUserInfo(query.list());
	}

	private List<UserInformationBean> getUserInfo(List<UserInformation> UserInformations) {
		List<UserInformationBean> userInformationBeans = new ArrayList<UserInformationBean>();
		for(UserInformation userInformation : UserInformations){
			UserInformationBean userInformationBean = convertUserInformationEntityToBean(userInformation);
			userInformationBeans.add(userInformationBean);
		}
		return userInformationBeans;
	}

	//Convert User Information Bean To Entity
	private UserInformation convertUserInformationBeanToEntity(UserInformationBean userInformationBean) {
		UserInformation userInformation = new UserInformation();
		userInformation.setUserId(userInformationBean.getUserId());
		userInformation.setUserEid(userInformationBean.getUserEid());
		userInformation.setFirstName(userInformationBean.getFirstName());
		userInformation.setMidileName(userInformationBean.getMidileName());
		userInformation.setLastName(userInformationBean.getLastName());
		userInformation.setUserEmail(userInformationBean.getUserEmail());
		userInformation.setGender(userInformationBean.getGender());
		userInformation.setDateOfBirth(userInformationBean.getDateOfBirth());
		userInformation.setBloodGroup(userInformationBean.getBloodGroup());
		userInformation.setIdMark1(userInformationBean.getIdMark1());
		userInformation.setAdharNo(userInformationBean.getAdharNo());
		userInformation.setUserPassword(userInformationBean.getUserPassword());
		userInformation.setPasswordSalt(userInformationBean.getPasswordSalt());
		userInformation.setUserRoles(new UserRoles(userInformationBean.getRoleId()));
		userInformation.setRecCreatedDate(userInformationBean.getRecCreatedDate());
		userInformation.setRecCreatedById(new UserInformation(userInformationBean.getRecCreatedById()));
		userInformation.setRecUpdatedDate(userInformationBean.getRecUpdatedDate());
		userInformation.setRecUpdatedById(new UserInformation(userInformationBean.getRecUpdatedById()));
		userInformation.setActiveFlag(userInformationBean.isActiveFlag());
//		userInformation.setStudents(new Student(userInformationBean.getStudentId()));
		
		return userInformation ;
	}
	
	// Convert User Information Entity To Bean
	private UserInformationBean convertUserInformationEntityToBean(UserInformation userInformation) {
		UserInformationBean UserInformationBean = new UserInformationBean();
		UserInformationBean.setUserId(userInformation.getUserId());
		UserInformationBean.setUserEid(userInformation.getUserEid());
		UserInformationBean.setFirstName(userInformation.getFirstName());
		UserInformationBean.setMidileName(userInformation.getFirstName());
		UserInformationBean.setLastName(userInformation.getLastName());
		UserInformationBean.setUserEmail(userInformation.getUserEmail());
		UserInformationBean.setGender(userInformation.getGender());
		UserInformationBean.setDateOfBirth(userInformation.getDateOfBirth());
		UserInformationBean.setBloodGroup(userInformation.getBloodGroup());
		UserInformationBean.setIdMark1(userInformation.getIdMark1());
		UserInformationBean.setAdharNo(userInformation.getAdharNo());
		UserInformationBean.setUserPassword(userInformation.getUserPassword());
		UserInformationBean.setPasswordSalt(userInformation.getPasswordSalt());
		
		UserRoles userRoles = userInformation.getUserRoles();
		UserInformationBean.setRoleId(userRoles.getRoleId());
		UserInformationBean.setRoleName(userRoles.getRoleName());
//		UserInformationBean.setRoleId(userInformation.getUserRoles().getRoleId());
		
		UserInformationBean.setRecCreatedDate(userInformation.getRecCreatedDate());
		UserInformationBean.setRecCreatedById(userInformation.getRecCreatedById().getUserId());
		UserInformationBean.setRecUpdatedDate(userInformation.getRecUpdatedDate());
		UserInformationBean.setRecUpdatedById(userInformation.getRecUpdatedById().getUserId());
		UserInformationBean.setActiveFlag(userInformation.isActiveFlag());
		
		return UserInformationBean;
	}

}
