package com.smartschool.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartschool.bean.UserRolesBean;
import com.smartschool.dao.UserRolesDao;
import com.smartschool.service.UserRolesService;

@Service
@Transactional
public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	private UserRolesDao userRolesDao;
	
	@Override
	public UserRolesBean getUserRoles(long roleId) {
		// TODO Auto-generated method stub
		return userRolesDao.getUserRoles(roleId);
	}

	@Override
	public List<UserRolesBean> getAllUserRoles() {
		// TODO Auto-generated method stub
		return userRolesDao.getAllUserRoles();
	}

}
