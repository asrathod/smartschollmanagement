package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.ExperienceInformationBean;
import com.smartschool.dao.ExperienceInformationDao;
import com.smartschool.service.ExperienceInformationService;

@Service
@Transactional
public class ExperienceInformationServiceImpl implements ExperienceInformationService {

	@Autowired
	private ExperienceInformationDao experienceInformationDao;
	
	@Override
	public long createExperienceInformation(ExperienceInformationBean experienceInformationBean) {
		
		return experienceInformationDao.createExperienceInformation(experienceInformationBean);
	}

	@Override
	public ExperienceInformationBean getExperienceInformationById(long expInfoId) {
		
		return experienceInformationDao.getExperienceInformationById(expInfoId);
	}

	@Override
	public List<ExperienceInformationBean> getAllExperienceInformation() {
		
		return experienceInformationDao.getAllExperienceInformation();
	}

	@Override
	public ExperienceInformationBean updateExperienceInformation(ExperienceInformationBean experienceInformationBean) {
		
		return experienceInformationDao.updateExperienceInformation(experienceInformationBean);
	}

	@Override
	public void deleteExperienceInformationBean(long expInfoId) {
		experienceInformationDao.deleteExperienceInformationBean(expInfoId);

	}

}
