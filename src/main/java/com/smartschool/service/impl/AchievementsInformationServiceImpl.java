package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.AchievementsInformationBean;
import com.smartschool.dao.AchievementsInformationDao;
import com.smartschool.service.AchievementsInformationService;

@Service
@Transactional
public class AchievementsInformationServiceImpl implements AchievementsInformationService {

	@Autowired
	private AchievementsInformationDao achievementsInformationDao;
	
	@Override
	public long createAchievementsInformation(AchievementsInformationBean achievementsInformationBean) {
		
		return achievementsInformationDao.createAchievementsInformation(achievementsInformationBean);
	}

	@Override
	public AchievementsInformationBean getAchievementsInformationById(long achievInfoId) {
		
		return achievementsInformationDao.getAchievementsInformationById(achievInfoId);
	}

	@Override
	public List<AchievementsInformationBean> getAllAchievementsInformation() {
		
		return achievementsInformationDao.getAllAchievementsInformation();
	}

	@Override
	public AchievementsInformationBean updateAchievementsInformation(
			AchievementsInformationBean achievementsInformationBean) {
		
		return achievementsInformationDao.updateAchievementsInformation(achievementsInformationBean);
	}

	@Override
	public void deleteAchievementsInformation(long achievInfoId) {
		achievementsInformationDao.deleteAchievementsInformation(achievInfoId);

	}

}
