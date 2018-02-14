package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.AcademicInformationBean;

public interface AcademicInformationDao {
	
	public long createAcademicInfo(AcademicInformationBean academicInformationBean);
	public AcademicInformationBean getAcademicInformationBeanById(long academicInfoId);
	public List<AcademicInformationBean> getAllAcademicInformationBean();
	public AcademicInformationBean updateAcademicInformationBean(AcademicInformationBean AcademicInformationBean);
	public void deleteAcademicInformationBean(long academicInfoId);
}
