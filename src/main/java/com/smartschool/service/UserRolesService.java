package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.UserRolesBean;

public interface UserRolesService {
	
	public UserRolesBean getUserRoles(long roleId);
	public List<UserRolesBean> getAllUserRoles();

}
