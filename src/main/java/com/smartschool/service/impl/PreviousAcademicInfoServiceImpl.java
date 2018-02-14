package com.smartschool.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartschool.bean.PreviousAcademicInfoBean;
import com.smartschool.dao.PreviousAcademicInfoDao;
import com.smartschool.service.PreviousAcademicInfoService;

@Service
@Transactional
public class PreviousAcademicInfoServiceImpl implements PreviousAcademicInfoService {

	@Autowired
	PreviousAcademicInfoDao previousAcademicInfoDao;
	
	@Override
	public long createPreviousAcademicInfo(PreviousAcademicInfoBean previousAcademicInfoBean) {
		
		return previousAcademicInfoDao.createPreviousAcademicInfo(previousAcademicInfoBean);
	}

	@Override
	public PreviousAcademicInfoBean getPreviousAcademicInfoBeanById(long previousAcaInfoId) {
		// TODO Auto-generated method stub
		return previousAcademicInfoDao.getPreviousAcademicInfoBeanById(previousAcaInfoId);
	}

	@Override
	public PreviousAcademicInfoBean updatePreviousAcademicInfoBean(PreviousAcademicInfoBean previousAcademicInfoBean) {
		// TODO Auto-generated method stub
		return previousAcademicInfoDao.updatePreviousAcademicInfoBean(previousAcademicInfoBean);
	}

	@Override
	public List<PreviousAcademicInfoBean> getAllPreviousAcademicInfoBean() {
		// TODO Auto-generated method stub
		return previousAcademicInfoDao.getAllPreviousAcademicInfoBean();
	}

}
