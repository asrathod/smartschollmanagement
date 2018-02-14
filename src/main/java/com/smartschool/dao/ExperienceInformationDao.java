package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.ExperienceInformationBean;

public interface ExperienceInformationDao {

	public long createExperienceInformation(ExperienceInformationBean experienceInformationBean);
	public ExperienceInformationBean getExperienceInformationById(long expInfoId);
	public List<ExperienceInformationBean> getAllExperienceInformation();
	public ExperienceInformationBean updateExperienceInformation(ExperienceInformationBean experienceInformationBean);
	public void deleteExperienceInformationBean(long expInfoId);
}
