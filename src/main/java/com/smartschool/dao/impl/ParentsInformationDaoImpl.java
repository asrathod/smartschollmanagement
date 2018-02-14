package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.ParentsInformationBean;
import com.smartschool.dao.ParentsInformationDao;
import com.smartschool.entity.ParentsInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class ParentsInformationDaoImpl implements ParentsInformationDao {
	
	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createParentsInfo(ParentsInformationBean parentsInformationBean) {
		ParentsInformation parentsInformation = converBeanToEntity(parentsInformationBean);
		long parentsInfoId = (long) hibernateUtil.create(parentsInformation);
		return parentsInfoId ;
	}

	@Override
	public ParentsInformationBean getParentsInformationById(long parentsInfoId) {
		ParentsInformation parentsInformation = hibernateUtil.fetchById(parentsInfoId, ParentsInformation.class);
		return convertEntityToBean(parentsInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ParentsInformationBean> getAllParentsInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM ParentsInformation");
		return getParentsInformation(query.list());
	}

	private List<ParentsInformationBean> getParentsInformation(List<ParentsInformation> parentsInformationlists) {
		List<ParentsInformationBean> parentsInformationBeans = new ArrayList<ParentsInformationBean>();
		for(ParentsInformation parentsInformation : parentsInformationlists){
			ParentsInformationBean ParentsInformationBean = convertEntityToBean(parentsInformation);
			parentsInformationBeans.add(ParentsInformationBean);
		}
		return parentsInformationBeans ;
	}

	@Override
	public ParentsInformationBean updateParentsInformation(ParentsInformationBean parentsInformationBean) {
		ParentsInformation parentsInformation = converBeanToEntity(parentsInformationBean);
		parentsInformation = hibernateUtil.update(parentsInformation);
		return convertEntityToBean(parentsInformation);
	}

	@Override
	public void deleteParentsInformation(long parentsInfoId) {
		// TODO Auto-generated method stub

	}
	//converBeanToEntity
	private ParentsInformation converBeanToEntity(ParentsInformationBean parentsInformationBean) {
		ParentsInformation parentsInformation = new ParentsInformation();
		parentsInformation.setParentsInfoId(parentsInformationBean.getParentsInfoId());
		parentsInformation.setStudent(new Student(parentsInformationBean.getStudentId()));
		parentsInformation.setFatherFirstName(parentsInformationBean.getFatherFirstName());
		parentsInformation.setFatherLasttName(parentsInformationBean.getFatherLasttName());
		parentsInformation.setFatherQualification(parentsInformationBean.getFatherQualification());
		parentsInformation.setFatherEmployment(parentsInformationBean.getFatherEmployment());
		parentsInformation.setFatherAnnualIncome(parentsInformationBean.getFatherAnnualIncome());
		parentsInformation.setMobileNo1(parentsInformationBean.getMobileNo1());
		parentsInformation.setMotherFirstName(parentsInformationBean.getMotherFirstName());
		parentsInformation.setMotherLasttName(parentsInformationBean.getMotherLasttName());
		parentsInformation.setMotherQualification(parentsInformationBean.getMotherQualification());
		parentsInformation.setMotherEmployment(parentsInformationBean.getMotherEmployment());
		parentsInformation.setMotherAnnualIncome(parentsInformationBean.getMotherAnnualIncome());
		parentsInformation.setMobileNo2(parentsInformationBean.getMobileNo2());
		parentsInformation.setRecCreatedDate(parentsInformationBean.getRecCreatedDate());
		parentsInformation.setRecCreatedById(new UserInformation(parentsInformationBean.getRecCreatedById()));
		parentsInformation.setRecUpdatedDate(parentsInformationBean.getRecUpdatedDate());
		parentsInformation.setRecUpdatedById(new UserInformation(parentsInformationBean.getRecUpdatedById()));
		parentsInformation.setActiveFlag(parentsInformationBean.isActiveFlag());
		return parentsInformation ;
	}
	
	//convertEntityToBean
	private ParentsInformationBean convertEntityToBean(ParentsInformation parentsInformation) {
		ParentsInformationBean parentsInformationBean = new ParentsInformationBean();
		parentsInformationBean.setParentsInfoId(parentsInformation.getParentsInfoId());
		parentsInformationBean.setStudentId(parentsInformation.getStudent().getStudentId());
		parentsInformationBean.setFatherFirstName(parentsInformation.getFatherFirstName());
		parentsInformationBean.setFatherLasttName(parentsInformation.getFatherLasttName());
		parentsInformationBean.setFatherQualification(parentsInformation.getFatherQualification());
		parentsInformationBean.setFatherEmployment(parentsInformation.getFatherEmployment());
		parentsInformationBean.setFatherAnnualIncome(parentsInformation.getFatherAnnualIncome());
		parentsInformationBean.setMobileNo1(parentsInformation.getMobileNo1());
		parentsInformationBean.setMotherFirstName(parentsInformation.getMotherFirstName());
		parentsInformationBean.setMotherLasttName(parentsInformation.getMotherLasttName());
		parentsInformationBean.setMotherQualification(parentsInformation.getMotherQualification());
		parentsInformationBean.setMotherEmployment(parentsInformation.getMotherEmployment());
		parentsInformationBean.setMotherAnnualIncome(parentsInformation.getMotherAnnualIncome());
		parentsInformationBean.setMobileNo2(parentsInformation.getMobileNo2());
		parentsInformationBean.setRecCreatedDate(parentsInformation.getRecCreatedDate());
		parentsInformationBean.setRecCreatedById(parentsInformation.getRecCreatedById().getUserId());
		parentsInformationBean.setRecUpdatedDate(parentsInformation.getRecUpdatedDate());
		parentsInformationBean.setRecUpdatedById(parentsInformation.getRecUpdatedById().getUserId());
		parentsInformationBean.setActiveFlag(parentsInformation.isActiveFlag());
		
		return parentsInformationBean ;
	}
}
