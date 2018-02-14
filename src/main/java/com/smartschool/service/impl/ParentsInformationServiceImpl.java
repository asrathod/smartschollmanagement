package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.ParentsInformationBean;
import com.smartschool.dao.ParentsInformationDao;
import com.smartschool.service.ParentsInformationService;

@Service
@Transactional
public class ParentsInformationServiceImpl implements ParentsInformationService {
	
	@Autowired
	private ParentsInformationDao parentsInformationDao;
	
	@Override
	public long createParentsInfo(ParentsInformationBean parentsInformationBean) {
		
		return parentsInformationDao.createParentsInfo(parentsInformationBean);
	}

	@Override
	public ParentsInformationBean getParentsInformationById(long parentsInfoId) {
		
		return parentsInformationDao.getParentsInformationById(parentsInfoId);
	}

	@Override
	public List<ParentsInformationBean> getAllParentsInformation() {
		
		return parentsInformationDao.getAllParentsInformation();
	}

	@Override
	public ParentsInformationBean updateParentsInformation(ParentsInformationBean parentsInformationBean) {
		
		return parentsInformationDao.updateParentsInformation(parentsInformationBean);
	}

	@Override
	public void deleteParentsInformation(long parentsInfoId) {
		parentsInformationDao.deleteParentsInformation(parentsInfoId);

	}

}
