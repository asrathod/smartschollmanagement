package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.UserInformationBean;

public interface UserInformationDao {

	public long createUserInformation(UserInformationBean userInformationBean);
	public UserInformationBean getUserInformationById(long userId);
	public UserInformationBean getUserInformatioByEid(String userEid);
	public List<UserInformationBean> getAllUserInformation();
	public UserInformationBean updateUserInformation(UserInformationBean userInformationBean);
}
