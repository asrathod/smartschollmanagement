package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.PreviousAcademicInfoBean;
import com.smartschool.dao.PreviousAcademicInfoDao;
import com.smartschool.entity.PreviousAcademicInfo;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class PreviousAcademicInfoDaoImpl implements PreviousAcademicInfoDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createPreviousAcademicInfo(PreviousAcademicInfoBean previousAcademicInfoBean) {
		PreviousAcademicInfo previousAcademicInfo = convertBeanToEntity(previousAcademicInfoBean);
		
		long PreAcademicInfoId = (long) hibernateUtil.create(previousAcademicInfo);
		
		return PreAcademicInfoId;
	}
	
	@Override
	public PreviousAcademicInfoBean getPreviousAcademicInfoBeanById(long previousAcaInfoId) {
		PreviousAcademicInfo previousAcademicInfo = hibernateUtil.fetchById(previousAcaInfoId, PreviousAcademicInfo.class);
		return convertEntityToBean(previousAcademicInfo);
	}

	@Override
	public PreviousAcademicInfoBean updatePreviousAcademicInfoBean(PreviousAcademicInfoBean previousAcademicInfoBean) {
		PreviousAcademicInfo previousAcademicInfo = convertBeanToEntity(previousAcademicInfoBean);
		previousAcademicInfo = hibernateUtil.update(previousAcademicInfo);
		
		return convertEntityToBean(previousAcademicInfo);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PreviousAcademicInfoBean> getAllPreviousAcademicInfoBean() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM PreviousAcademicInfo");
		return getPreviousAcademicInfo(query.list());
	}

	private List<PreviousAcademicInfoBean> getPreviousAcademicInfo(List<PreviousAcademicInfo> previousAcademicInfoLists) {
		List<PreviousAcademicInfoBean> previousAcademicInfoBeans = new ArrayList<PreviousAcademicInfoBean>();
		for(PreviousAcademicInfo previousAcademicInfo : previousAcademicInfoLists){
			PreviousAcademicInfoBean previousAcademicInfoBean = convertEntityToBean(previousAcademicInfo);
			previousAcademicInfoBeans.add(previousAcademicInfoBean);
		}
		return previousAcademicInfoBeans ;
	}

	//convertBeanToEntity
	private PreviousAcademicInfo convertBeanToEntity(PreviousAcademicInfoBean previousAcademicInfoBean) {
		PreviousAcademicInfo previousAcademicInfo = new PreviousAcademicInfo();
		previousAcademicInfo.setPreviousAcaInfoId(previousAcademicInfoBean.getPreviousAcaInfoId());
		previousAcademicInfo.setStudent(new Student(previousAcademicInfoBean.getStudentId()));
		previousAcademicInfo.setDateOfJoining(previousAcademicInfoBean.getDateOfJoining());
		previousAcademicInfo.setPreviousSchool(previousAcademicInfoBean.getPreviousSchool());
		previousAcademicInfo.setLastStdStudied(previousAcademicInfoBean.getLastStdStudied());
		previousAcademicInfo.setLeavingReason(previousAcademicInfoBean.getLeavingReason());
		previousAcademicInfo.setComments(previousAcademicInfoBean.getComments());
		previousAcademicInfo.setRecCreatedDate(previousAcademicInfoBean.getRecCreatedDate());
		previousAcademicInfo.setRecCreatedById(new UserInformation(previousAcademicInfoBean.getRecCreatedById()));
		previousAcademicInfo.setRecUpdatedDate(previousAcademicInfoBean.getRecUpdatedDate());
		previousAcademicInfo.setRecUpdatedById(new UserInformation(previousAcademicInfoBean.getRecUpdatedById()));
		previousAcademicInfo.setActiveFlag(previousAcademicInfoBean.isActiveFlag());
		
		return previousAcademicInfo ;
	}
	
	//convertEntityToBean
	private PreviousAcademicInfoBean convertEntityToBean(PreviousAcademicInfo previousAcademicInfo) {
		PreviousAcademicInfoBean previousAcademicInfoBean = new PreviousAcademicInfoBean();
		previousAcademicInfoBean.setPreviousAcaInfoId(previousAcademicInfo.getPreviousAcaInfoId());
		previousAcademicInfoBean.setStudentId(previousAcademicInfo.getStudent().getStudentId());
		previousAcademicInfoBean.setFirstName(previousAcademicInfo.getStudent().getFirstName());
		previousAcademicInfoBean.setDateOfJoining(previousAcademicInfo.getDateOfJoining());
		previousAcademicInfoBean.setPreviousSchool(previousAcademicInfo.getPreviousSchool());
		previousAcademicInfoBean.setLastStdStudied(previousAcademicInfo.getLastStdStudied());
		previousAcademicInfoBean.setLeavingReason(previousAcademicInfo.getLeavingReason());
		previousAcademicInfoBean.setComments(previousAcademicInfo.getComments());
		previousAcademicInfoBean.setRecCreatedDate(previousAcademicInfo.getRecCreatedDate());
		previousAcademicInfoBean.setRecCreatedById(previousAcademicInfo.getRecCreatedById().getUserId());
		previousAcademicInfoBean.setRecUpdatedDate(previousAcademicInfo.getRecUpdatedDate());
		previousAcademicInfoBean.setRecUpdatedById(previousAcademicInfo.getRecUpdatedById().getUserId());
		previousAcademicInfoBean.setActiveFlag(previousAcademicInfo.isActiveFlag());
		
		return previousAcademicInfoBean ;
	}

}
