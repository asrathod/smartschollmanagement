package com.smartschool.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartschool.bean.UserInformationBean;
import com.smartschool.dao.UserInformationDao;
import com.smartschool.service.UserInformationService;

@Service
@Transactional
public class UserInformationServiceImpl implements UserInformationService {

	@Autowired
	private UserInformationDao userInformationDao;
	
	@Override
	public long createUserInformation(UserInformationBean userInformationBean) {
		
		return userInformationDao.createUserInformation(userInformationBean);
	}

	@Override
	public UserInformationBean getUserInformationById(long userId) {
		
		return userInformationDao.getUserInformationById(userId);
	}

	@Override
	public List<UserInformationBean> getAllUserInformation() {
		
		return userInformationDao.getAllUserInformation();
	}

	@Override
	public UserInformationBean updateUserInformation(UserInformationBean userInformationBean) {
		
		return userInformationDao.updateUserInformation(userInformationBean);
	}

	@Override
	public UserInformationBean getUserInformatioByEid(String userEid) {
		
		return userInformationDao.getUserInformatioByEid(userEid);
	}

}
