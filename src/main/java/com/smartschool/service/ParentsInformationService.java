package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.ParentsInformationBean;

public interface ParentsInformationService {
	
	public long createParentsInfo(ParentsInformationBean parentsInformationBean);
	public ParentsInformationBean getParentsInformationById(long parentsInfoId);
	public List<ParentsInformationBean> getAllParentsInformation();
	public ParentsInformationBean updateParentsInformation(ParentsInformationBean parentsInformationBean);
	public void deleteParentsInformation(long parentsInfoId);
}
