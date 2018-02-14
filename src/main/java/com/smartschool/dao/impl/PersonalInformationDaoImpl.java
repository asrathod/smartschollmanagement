package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.PersonalInformationBean;
import com.smartschool.dao.PersonalInformationDao;
import com.smartschool.entity.PersonalInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class PersonalInformationDaoImpl implements PersonalInformationDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	private final Logger LOGGER = Logger.getLogger(getClass());
	
	@Override
	public long createPersonalInformation(PersonalInformationBean personalInformationBean) {
		PersonalInformation personalInformation = convertPersonalInformationBeanToEntity(personalInformationBean);
		
		long studentId = (long) hibernateUtil.create(personalInformation);
		LOGGER.info("Persist new Personal Information.");
		return studentId;
	}

	@Override
	public PersonalInformationBean getPersonalInformationById(long personalInfoId) {
		PersonalInformation personalInformation = hibernateUtil.fetchById(personalInfoId, PersonalInformation.class);
		return convertPersonalInformationEntityToBean(personalInformation);
	}

	@Override
	public void deletePersonalInformation(long personalInfoId) {
		PersonalInformation personalInformation = new PersonalInformation();
		personalInformation.setPersonalInfoId(personalInfoId);
		hibernateUtil.delete(personalInformation);
		LOGGER.info("Removed Personal Information Details = " + personalInfoId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PersonalInformationBean> getAllPersonalInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM PersonalInformation");
		return getPersonalInformation(query.list());
	}

	private List<PersonalInformationBean> getPersonalInformation(List<PersonalInformation> personalInformations) {
		List<PersonalInformationBean> personalInformationBeans = new ArrayList<PersonalInformationBean>();
		for(PersonalInformation personalInformation : personalInformations){
			PersonalInformationBean personalInformationBean = convertPersonalInformationEntityToBean(personalInformation);
			personalInformationBeans.add(personalInformationBean);
		}
		return personalInformationBeans;
	}

	@Override
	public PersonalInformationBean updatePersonalInformation(PersonalInformationBean personalInformationBean) {
		PersonalInformation personalInformation = convertPersonalInformationBeanToEntity(personalInformationBean);
		personalInformation = hibernateUtil.update(personalInformation);
		return convertPersonalInformationEntityToBean(personalInformation);
	}

	// Convert Personal Information Bean To Entity
	private PersonalInformation convertPersonalInformationBeanToEntity(PersonalInformationBean personalInformationBean) {
		PersonalInformation personalInformation = new PersonalInformation();
		personalInformation.setPersonalInfoId(personalInformation.getPersonalInfoId());
		personalInformation.setStudent(new Student(personalInformationBean.getStudentId()));
		personalInformation.setPlaceOfbirth(personalInformationBean.getPlaceOfbirth());
		personalInformation.setReligion(personalInformationBean.getReligion());
		personalInformation.setCast(personalInformationBean.getCast());
		personalInformation.setSubCast(personalInformationBean.getSubCast());
		personalInformation.setMotherToungue(personalInformationBean.getMotherToungue());
		personalInformation.setBloodGroup(personalInformationBean.getBloodGroup());
		personalInformation.setIdMark1(personalInformationBean.getIdMark1());
		personalInformation.setIdMark2(personalInformationBean.getIdMark2());
		personalInformation.setAddmisionNo(personalInformationBean.getAddmisionNo());
		personalInformation.setAdharNo(personalInformationBean.getAdharNo());
		personalInformation.setDisabilityYesNo(personalInformationBean.getDisabilityYesno());
		personalInformation.setDisabilityDetails(personalInformationBean.getDisabilityDetails());
		personalInformation.setMedicalHistory(personalInformationBean.getMedicalHistory());
		personalInformation.setMedicalTreatement(personalInformationBean.getMedicalTreatement());
		personalInformation.setRecCreatedDate(personalInformationBean.getRecCreatedDate());
		personalInformation.setRecCreatedById(new UserInformation(personalInformationBean.getRecCreatedById()));
		personalInformation.setRecUpdatedById(new UserInformation(personalInformationBean.getRecUpdatedById()));
		personalInformation.setRecUpdatedDate(personalInformationBean.getRecUpdatedDate());
		personalInformation.setActiveFlag(personalInformationBean.isActiveFlag());
		return personalInformation;
	}
	
	// Convert Personal Information Entity To Bean
	private PersonalInformationBean convertPersonalInformationEntityToBean(PersonalInformation personalInformation) {
		PersonalInformationBean PersonalInformationBean = new PersonalInformationBean();
		PersonalInformationBean.setPersonalInfoId(personalInformation.getPersonalInfoId());
		PersonalInformationBean.setStudentId(personalInformation.getStudent().getStudentId());
		PersonalInformationBean.setFirstName(personalInformation.getStudent().getFirstName());
		PersonalInformationBean.setPersonalInfoId(personalInformation.getPersonalInfoId());
		PersonalInformationBean.setPlaceOfbirth(personalInformation.getPlaceOfbirth());
		PersonalInformationBean.setReligion(personalInformation.getReligion());
		PersonalInformationBean.setCast(personalInformation.getCast());
		PersonalInformationBean.setSubCast(personalInformation.getSubCast());
		PersonalInformationBean.setMotherToungue(personalInformation.getMotherToungue());
		PersonalInformationBean.setBloodGroup(personalInformation.getBloodGroup());
		PersonalInformationBean.setIdMark1(personalInformation.getIdMark1());
		PersonalInformationBean.setIdMark2(personalInformation.getIdMark2());
		PersonalInformationBean.setAddmisionNo(personalInformation.getAddmisionNo());
		PersonalInformationBean.setAdharNo(personalInformation.getAdharNo());
		PersonalInformationBean.setDisabilityYesno(personalInformation.getDisabilityYesNo());
		PersonalInformationBean.setDisabilityDetails(personalInformation.getDisabilityDetails());
		PersonalInformationBean.setMedicalHistory(personalInformation.getMedicalHistory());
		PersonalInformationBean.setMedicalTreatement(personalInformation.getMedicalTreatement());
		PersonalInformationBean.setRecCreatedById(personalInformation.getRecCreatedById().getUserId());
		PersonalInformationBean.setRecCreatedDate(personalInformation.getRecCreatedDate());
		PersonalInformationBean.setRecUpdatedById(personalInformation.getRecUpdatedById().getUserId());
		PersonalInformationBean.setRecUpdatedDate(personalInformation.getRecUpdatedDate());
		PersonalInformationBean.setActiveFlag(personalInformation.isActiveFlag());
		
		return PersonalInformationBean;
	}

}
