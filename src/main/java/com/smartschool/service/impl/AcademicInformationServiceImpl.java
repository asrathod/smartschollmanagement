package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.AcademicInformationBean;
import com.smartschool.dao.AcademicInformationDao;
import com.smartschool.service.AcademicInformationService;

@Service
@Transactional
public class AcademicInformationServiceImpl implements AcademicInformationService {
	
	@Autowired
	private AcademicInformationDao academicInformationDao;

	@Override
	public long createAcademicInfo(AcademicInformationBean academicInformationBean) {
		
		return academicInformationDao.createAcademicInfo(academicInformationBean);
	}

	@Override
	public AcademicInformationBean getAcademicInformationBeanById(long academicInfoId) {
		
		return academicInformationDao.getAcademicInformationBeanById(academicInfoId);
	}

	@Override
	public List<AcademicInformationBean> getAllAcademicInformationBean() {
		
		return academicInformationDao.getAllAcademicInformationBean();
	}

	@Override
	public AcademicInformationBean updateAcademicInformationBean(AcademicInformationBean AcademicInformationBean) {
		
		return academicInformationDao.updateAcademicInformationBean(AcademicInformationBean);
	}

	@Override
	public void deleteAcademicInformationBean(long academicInfoId) {
		academicInformationDao.deleteAcademicInformationBean(academicInfoId);
		
	}

	
}
