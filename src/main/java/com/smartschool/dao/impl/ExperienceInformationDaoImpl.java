package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.ExperienceInformationBean;
import com.smartschool.dao.ExperienceInformationDao;
import com.smartschool.entity.ExperienceInformation;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class ExperienceInformationDaoImpl implements ExperienceInformationDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createExperienceInformation(ExperienceInformationBean experienceInformationBean) {
		ExperienceInformation experienceInformation = converBeanToEntity(experienceInformationBean);
		long expId = (long) hibernateUtil.create(experienceInformation);
		return expId ;
	}

	@Override
	public ExperienceInformationBean getExperienceInformationById(long expInfoId) {
		ExperienceInformation experienceInformation = hibernateUtil.fetchById(expInfoId, ExperienceInformation.class);
		return convertEntityToBean(experienceInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ExperienceInformationBean> getAllExperienceInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM ExperienceInformation");
		return getExperienceInformation(query.list());
	}

	private List<ExperienceInformationBean> getExperienceInformation(List<ExperienceInformation> ExperienceInformationLists) {
		List<ExperienceInformationBean> experienceInformationBeans = new ArrayList<ExperienceInformationBean>();
		for(ExperienceInformation experienceInformation : ExperienceInformationLists){
			ExperienceInformationBean experienceInformationBean = convertEntityToBean(experienceInformation);
			experienceInformationBeans.add(experienceInformationBean);
		}
		return experienceInformationBeans ;
	}

	@Override
	public ExperienceInformationBean updateExperienceInformation(ExperienceInformationBean experienceInformationBean) {
		ExperienceInformation experienceInformation = converBeanToEntity(experienceInformationBean);
		experienceInformation = hibernateUtil.update(experienceInformation);
		return convertEntityToBean(experienceInformation);
	}

	@Override
	public void deleteExperienceInformationBean(long expInfoId) {
		ExperienceInformation experienceInformation = new ExperienceInformation();
		experienceInformation.setExpInfoId(expInfoId);
		hibernateUtil.delete(experienceInformation);
	}
	
	//converBeanToEntity
	private ExperienceInformation converBeanToEntity(ExperienceInformationBean experienceInformationBean) {
		ExperienceInformation experienceInformation = new ExperienceInformation();
		experienceInformation.setExpInfoId(experienceInformationBean.getExpInfoId());
		experienceInformation.setUser(new UserInformation(experienceInformationBean.getUserId()));
		experienceInformation.setYearOfExp(experienceInformationBean.getYearOfExp());
		experienceInformation.setExpDetails1(experienceInformationBean.getExpDetails1());
		experienceInformation.setExpDetails2(experienceInformationBean.getExpDetails2());
		experienceInformation.setSkillsDetails1(experienceInformationBean.getSkillsDetails1());
		experienceInformation.setSkillsDetails2(experienceInformationBean.getExpDetails2());
		experienceInformation.setSkillsDetails3(experienceInformationBean.getSkillsDetails3());
		experienceInformation.setCurrentSalary(experienceInformationBean.getCurrentSalary());
		experienceInformation.setPreviousSalary(experienceInformationBean.getPreviousSalary());
		experienceInformation.setDateOfJoining(experienceInformationBean.getDateOfJoining());
		experienceInformation.setRecCreatedDate(experienceInformationBean.getRecCreatedDate());
		experienceInformation.setRecCreatedById(new UserInformation(experienceInformationBean.getUserId()));
		experienceInformation.setRecUpdatedDate(experienceInformationBean.getRecUpdatedDate());
		experienceInformation.setRecUpdatedById(new UserInformation(experienceInformationBean.getUserId()));
		experienceInformation.setActiveFlag(experienceInformationBean.isActiveFlag());
		
		return experienceInformation ;
	}
	
	//convertEntityToBean
	private ExperienceInformationBean convertEntityToBean(ExperienceInformation experienceInformation) {
		ExperienceInformationBean experienceInformationBean = new ExperienceInformationBean();
		experienceInformationBean.setExpInfoId(experienceInformation.getExpInfoId());
		experienceInformationBean.setUserId(experienceInformation.getUser().getUserId());
		experienceInformationBean.setUserEid(experienceInformation.getUser().getUserEid());
		
		UserInformation userInformation = experienceInformation.getUser();
		if(userInformation.getLastName() != null && userInformation.getLastName().isEmpty()){
			experienceInformationBean.setUserName(userInformation.getFirstName()+ " " +userInformation.getMidileName()+ " " +userInformation.getLastName());
		}else{
			experienceInformationBean.setUserName(userInformation.getFirstName());
		}

		experienceInformationBean.setYearOfExp(experienceInformation.getYearOfExp());
		experienceInformationBean.setExpDetails1(experienceInformation.getExpDetails1());
		experienceInformationBean.setExpDetails2(experienceInformation.getExpDetails2());
		experienceInformationBean.setSkillsDetails1(experienceInformation.getExpDetails1());
		experienceInformationBean.setSkillsDetails2(experienceInformation.getExpDetails2());
		experienceInformationBean.setSkillsDetails3(experienceInformation.getSkillsDetails3());
		experienceInformationBean.setCurrentSalary(experienceInformation.getCurrentSalary());
		experienceInformationBean.setPreviousSalary(experienceInformation.getPreviousSalary());
		experienceInformationBean.setDateOfJoining(experienceInformation.getDateOfJoining());
		experienceInformationBean.setRecCreatedDate(experienceInformation.getRecCreatedDate());
		experienceInformationBean.setRecCreatedById(experienceInformation.getRecCreatedById().getUserId());
		experienceInformationBean.setRecUpdatedDate(experienceInformation.getRecUpdatedDate());
		experienceInformationBean.setRecUpdatedById(experienceInformation.getRecUpdatedById().getUserId());
		experienceInformationBean.setActiveFlag(experienceInformation.isActiveFlag());
		
		return experienceInformationBean ;
	}


}
