package com.smartschool.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartschool.bean.PersonalInformationBean;
import com.smartschool.dao.PersonalInformationDao;
import com.smartschool.service.PersonalInformationService;

@Service
@Transactional
public class PersonalInformationServiceImpl implements PersonalInformationService {

	@Autowired
	PersonalInformationDao personalInformationDao;
	
	@Override
	public long createPersonalInformation(PersonalInformationBean personalInformationBean) {
		
		return personalInformationDao.createPersonalInformation(personalInformationBean);
	}

	@Override
	public PersonalInformationBean getPersonalInformationById(long personalInfoId) {
		
		return personalInformationDao.getPersonalInformationById(personalInfoId);
	}

	@Override
	public List<PersonalInformationBean> getAllPersonalInformation() {
		
		return personalInformationDao.getAllPersonalInformation();
	}

	@Override
	public PersonalInformationBean updatePersonalInformation(PersonalInformationBean personalInformationBean) {
		
		return personalInformationDao.updatePersonalInformation(personalInformationBean);
	}

	@Override
	public void deletePersonalInformation(long personalInfoId) {
		personalInformationDao.deletePersonalInformation(personalInfoId);
		
	}

}
