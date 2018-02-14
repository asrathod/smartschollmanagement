package com.smartschool.dao;

import java.util.List;
import com.smartschool.bean.PersonalInformationBean;

public interface PersonalInformationDao {
		
	public long createPersonalInformation(PersonalInformationBean personalInformationBean);
	public PersonalInformationBean getPersonalInformationById(long personalInfoId);
	public List<PersonalInformationBean> getAllPersonalInformation();
	public PersonalInformationBean updatePersonalInformation(PersonalInformationBean personalInformationBean);
	public void deletePersonalInformation(long personalInfoId);
}
