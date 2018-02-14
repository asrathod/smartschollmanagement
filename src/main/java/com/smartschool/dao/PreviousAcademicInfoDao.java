package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.PreviousAcademicInfoBean;

public interface PreviousAcademicInfoDao {
	
	public long createPreviousAcademicInfo(PreviousAcademicInfoBean previousAcademicInfoBean);
	public PreviousAcademicInfoBean getPreviousAcademicInfoBeanById(long previousAcaInfoId);
	public PreviousAcademicInfoBean updatePreviousAcademicInfoBean(PreviousAcademicInfoBean previousAcademicInfoBean);
	public List<PreviousAcademicInfoBean> getAllPreviousAcademicInfoBean();
	
}
