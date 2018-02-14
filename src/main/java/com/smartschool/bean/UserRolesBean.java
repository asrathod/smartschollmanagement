package com.smartschool.bean;

import java.util.HashSet;
import java.util.Set;

public class UserRolesBean {
	private long roleId;
	private String roleName;
	private Set<UserInformationBean> userInformationBeans = new HashSet<UserInformationBean>(0);
	
	//Constructor
	public UserRolesBean() {
		super();
	}

	public UserRolesBean(long roleId) {
		super();
		this.roleId = roleId;
	}

	//Getters And Setters
	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserInformationBean> getUserInformationBeans() {
		return userInformationBeans;
	}

	public void setUserInformationBeans(Set<UserInformationBean> userInformationBeans) {
		this.userInformationBeans = userInformationBeans;
	}

}
