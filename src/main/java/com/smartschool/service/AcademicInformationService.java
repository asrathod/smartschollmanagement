package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.AcademicInformationBean;

public interface AcademicInformationService {
	
	public long createAcademicInfo(AcademicInformationBean academicInformationBean);
	public AcademicInformationBean getAcademicInformationBeanById(long academicInfoId);
	public List<AcademicInformationBean> getAllAcademicInformationBean();
	public AcademicInformationBean updateAcademicInformationBean(AcademicInformationBean AcademicInformationBean);
	public void deleteAcademicInformationBean(long academicInfoId);
}
