package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.PreviousAcademicInfoBean;

public interface PreviousAcademicInfoService {
	public long createPreviousAcademicInfo(PreviousAcademicInfoBean previousAcademicInfoBean);
	public PreviousAcademicInfoBean getPreviousAcademicInfoBeanById(long previousAcaInfoId);
	public PreviousAcademicInfoBean updatePreviousAcademicInfoBean(PreviousAcademicInfoBean previousAcademicInfoBean);
	public List<PreviousAcademicInfoBean> getAllPreviousAcademicInfoBean();
	
}
