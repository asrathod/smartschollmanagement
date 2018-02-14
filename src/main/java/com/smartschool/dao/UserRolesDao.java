package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.UserRolesBean;


public interface UserRolesDao {
	
	public UserRolesBean getUserRoles(long roleId);
	public List<UserRolesBean> getAllUserRoles();
}
