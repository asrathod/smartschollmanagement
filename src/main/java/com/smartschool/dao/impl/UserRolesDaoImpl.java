package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.UserRolesBean;
import com.smartschool.dao.UserRolesDao;
import com.smartschool.entity.UserRoles;
import com.smartschool.util.HibernateUtil;

@Repository
public class UserRolesDaoImpl implements UserRolesDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public UserRolesBean getUserRoles(long roleId) {
		UserRoles userRoles = hibernateUtil.fetchById(roleId, UserRoles.class);
		
		return convertEntityToBean(userRoles);
	}

	@Override
	public List<UserRolesBean> getAllUserRoles() {
		List<UserRoles> userRoles = hibernateUtil.fetchAll(UserRoles.class);
		List<UserRolesBean> userRolesBeans = getUserRoleInfo(userRoles);
		return userRolesBeans ;
	}

	private List<UserRolesBean> getUserRoleInfo(List<UserRoles> userRoles) {
		List<UserRolesBean> userRolesBeans = new ArrayList<UserRolesBean>();
		for(UserRoles userRolesInfo : userRoles){
			UserRolesBean userRolesBean = convertEntityToBean(userRolesInfo);
			userRolesBeans.add(userRolesBean);
		}
		return userRolesBeans ;
	}
	
	// Convert Entity To Bean
	private UserRolesBean convertEntityToBean(UserRoles userRoles) {
		UserRolesBean userRolesBean = new UserRolesBean();
		userRolesBean.setRoleId(userRoles.getRoleId());
		userRolesBean.setRoleName(userRoles.getRoleName());
		return userRolesBean ;
	}


}
