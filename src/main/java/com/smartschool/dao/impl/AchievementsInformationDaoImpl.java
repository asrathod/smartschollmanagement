package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.AchievementsInformationBean;
import com.smartschool.dao.AchievementsInformationDao;
import com.smartschool.entity.AchievementsInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class AchievementsInformationDaoImpl implements AchievementsInformationDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createAchievementsInformation(AchievementsInformationBean achievementsInformationBean) {
		AchievementsInformation achievementsInformation = convertBeanToEntity(achievementsInformationBean);
		long achievementsInfo = (long) hibernateUtil.create(achievementsInformation);
		return achievementsInfo;
	}

	@Override
	public AchievementsInformationBean getAchievementsInformationById(long achievInfoId) {
		AchievementsInformation achievementsInformation = hibernateUtil.fetchById(achievInfoId, AchievementsInformation.class);
		return convertEntityToBean(achievementsInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AchievementsInformationBean> getAllAchievementsInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM AchievementsInformation");
		return getAchievementsInformation(query.list());
	}

	private List<AchievementsInformationBean> getAchievementsInformation(List<AchievementsInformation> achievementsInformationLists) {
		List<AchievementsInformationBean> achievementsInformationBeans = new ArrayList<AchievementsInformationBean>();
		for(AchievementsInformation achievementsInformation : achievementsInformationLists){
			AchievementsInformationBean achievementsInformationBean = convertEntityToBean(achievementsInformation);
			achievementsInformationBeans.add(achievementsInformationBean);
		}
		return achievementsInformationBeans ;
	}

	@Override
	public AchievementsInformationBean updateAchievementsInformation(
			AchievementsInformationBean achievementsInformationBean) {
		AchievementsInformation achievementsInformation = convertBeanToEntity(achievementsInformationBean);
		achievementsInformation = hibernateUtil.update(achievementsInformation);
		return convertEntityToBean(achievementsInformation);
	}

	@Override
	public void deleteAchievementsInformation(long achievInfoId) {
		AchievementsInformation achievementsInformation = new AchievementsInformation();
		achievementsInformation.setAchievInfoId(achievInfoId);
		hibernateUtil.delete(achievementsInformation);
	}

	//convertBeantoEntity
	private AchievementsInformation convertBeanToEntity(AchievementsInformationBean achievementsInformationBean) {
		AchievementsInformation achievementsInformation = new AchievementsInformation();
		achievementsInformation.setAchievInfoId(achievementsInformationBean.getAchievInfoId());
		achievementsInformation.setStudent(new Student(achievementsInformationBean.getStudentId()));
		achievementsInformation.setAchievement1(achievementsInformationBean.getAchievement1());
		achievementsInformation.setAchievement2(achievementsInformationBean.getAchievement2());
		achievementsInformation.setAchievement3(achievementsInformationBean.getAchievement3());
		achievementsInformation.setCode(achievementsInformationBean.getCode());
		achievementsInformation.setFile(achievementsInformationBean.getFile());
		achievementsInformation.setRecCreatedDate(achievementsInformationBean.getRecCreatedDate());
		achievementsInformation.setRecCreatedById(new UserInformation(achievementsInformationBean.getRecCreatedById()));
		achievementsInformation.setRecUpdatedDate(achievementsInformationBean.getRecUpdatedDate());
		achievementsInformation.setRecUpdatedById(new UserInformation(achievementsInformationBean.getRecUpdatedById()));
		achievementsInformation.setActiveFlag(achievementsInformationBean.isActiveFlag());
		
		return achievementsInformation ;
	}
	
	//convertEntityToBean
	private AchievementsInformationBean convertEntityToBean(AchievementsInformation achievementsInformation) {
		AchievementsInformationBean achievementsInformationBean = new AchievementsInformationBean();
		achievementsInformationBean.setAchievInfoId(achievementsInformation.getAchievInfoId());
		achievementsInformationBean.setStudentId(achievementsInformation.getStudent().getStudentId());
		achievementsInformationBean.setAchievement1(achievementsInformation.getAchievement1());
		achievementsInformationBean.setAchievement2(achievementsInformation.getAchievement2());
		achievementsInformationBean.setAchievement3(achievementsInformation.getAchievement3());
		achievementsInformationBean.setCode(achievementsInformation.getCode());
		achievementsInformationBean.setFile(achievementsInformation.getFile());
		achievementsInformationBean.setRecCreatedDate(achievementsInformation.getRecCreatedDate());
		achievementsInformationBean.setRecCreatedById(achievementsInformation.getRecCreatedById().getUserId());
		achievementsInformationBean.setRecUpdatedDate(achievementsInformation.getRecUpdatedDate());
		achievementsInformationBean.setRecUpdatedById(achievementsInformation.getRecUpdatedById().getUserId());
		achievementsInformationBean.setActiveFlag(achievementsInformation.isActiveFlag());
		
		return achievementsInformationBean ;
	}
}
