package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.AchievementsInformationBean;

public interface AchievementsInformationDao {
	
	public long createAchievementsInformation(AchievementsInformationBean achievementsInformationBean);
	public AchievementsInformationBean getAchievementsInformationById(long achievInfoId);
	public List<AchievementsInformationBean> getAllAchievementsInformation();
	public AchievementsInformationBean updateAchievementsInformation(AchievementsInformationBean achievementsInformationBean);
	public void deleteAchievementsInformation(long achievInfoId);
	
}
