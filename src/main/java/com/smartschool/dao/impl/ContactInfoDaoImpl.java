package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.ContactInfoBean;
import com.smartschool.dao.ContactInfoDao;
import com.smartschool.entity.ContactInfo;
import com.smartschool.entity.ExperienceInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class ContactInfoDaoImpl implements ContactInfoDao {
	
	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public long createContactInfo(ContactInfoBean contactInfoBean) {
		ContactInfo contactInfo = converBeanToEntity(contactInfoBean);
		long contactId = (long) hibernateUtil.create(contactInfo);
		return contactId;
	}

	@Override
	public ContactInfoBean getContactformationById(long contactInfoId) {
		ContactInfo contactInfo = hibernateUtil.fetchById(contactInfoId, ContactInfo.class);
		
		return convertContactInformationEntityToBean(contactInfo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContactInfoBean> getAllContactInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM ContactInfo");
		return getContactInformation(query.list());
	}

	private List<ContactInfoBean> getContactInformation(List<ContactInfo> ContactInfolists) {
		List<ContactInfoBean> contactInfoBeans = new ArrayList<ContactInfoBean>();
		for(ContactInfo contactInfo : ContactInfolists){
			ContactInfoBean contactInfoBean = convertContactInformationEntityToBean(contactInfo);
			contactInfoBeans.add(contactInfoBean);
		}
		return contactInfoBeans; 
	}

	@Override
	public ContactInfoBean updateContactInformation(ContactInfoBean contactInfoBean) {
		ContactInfo contactInfo = converBeanToEntity(contactInfoBean);
		contactInfo = hibernateUtil.update(contactInfo);
		return convertContactInformationEntityToBean(contactInfo);
	}

	@Override
	public void deleteContactInformation(long contactInfoId) {
		 
		
	}
	
	// converBeanToEntity
	private ContactInfo converBeanToEntity(ContactInfoBean contactInfoBean) {
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setContactInfoId(contactInfoBean.getContactInfoId());
		contactInfo.setStudent(new Student(contactInfoBean.getStudentId()));
		contactInfo.setFirstContactNo(contactInfoBean.getFirstContactNo());
		contactInfo.setStreetNoName1(contactInfoBean.getStreetNoName1());
		contactInfo.setCity(contactInfoBean.getCity());
		contactInfo.setState(contactInfoBean.getState());
//		contactInfo.setCountry(contactInfoBean.getCountry());
		contactInfo.setCountry(contactInfoBean.getCountry());
		contactInfo.setZipCode(contactInfoBean.getZipCode());
		contactInfo.setSecondContactNo(contactInfoBean.getSecondContactNo());
		contactInfo.setStreetNoName2(contactInfoBean.getStreetNoName2());
		contactInfo.setCity2(contactInfoBean.getCity2());
		contactInfo.setState2(contactInfoBean.getState2());
		contactInfo.setCountry2(contactInfoBean.getCountry2());
		contactInfo.setZipCode2(contactInfoBean.getZipCode2());
		contactInfo.setRecCreatedDate(contactInfoBean.getRecCreatedDate());
		contactInfo.setRecCreatedById(new UserInformation(contactInfoBean.getRecCreatedById()));
		contactInfo.setRecUpdatedDate(contactInfoBean.getRecUpdatedDate());
		contactInfo.setRecUpdatedById(new UserInformation(contactInfoBean.getRecUpdatedById()));
		contactInfo.setActiveFlag(contactInfoBean.isActiveFlag());
		return contactInfo;
	}

	//convertContactInformationEntityToBean
	private ContactInfoBean convertContactInformationEntityToBean(ContactInfo contactInfo) {
		ContactInfoBean contactInfoBean = new ContactInfoBean();
		contactInfoBean.setContactInfoId(contactInfo.getContactInfoId());
		contactInfoBean.setStudentId(contactInfo.getStudent().getStudentId());
		contactInfoBean.setFirstContactNo(contactInfo.getFirstContactNo());
		contactInfoBean.setStreetNoName1(contactInfo.getStreetNoName1());
		contactInfoBean.setCity(contactInfo.getCity());
		contactInfoBean.setState(contactInfo.getState());
		contactInfoBean.setCountry(contactInfo.getCountry());
		contactInfoBean.setZipCode(contactInfo.getZipCode());
		contactInfoBean.setSecondContactNo(contactInfo.getSecondContactNo());
		contactInfoBean.setStreetNoName2(contactInfo.getStreetNoName2());
		contactInfoBean.setCity2(contactInfo.getCity2());
		contactInfoBean.setState2(contactInfo.getState2());
		contactInfoBean.setCountry2(contactInfo.getCountry2());
		contactInfoBean.setZipCode2(contactInfo.getZipCode2());
		contactInfoBean.setRecCreatedDate(contactInfo.getRecCreatedDate());
		contactInfoBean.setRecCreatedById(contactInfo.getRecCreatedById().getUserId());
		contactInfoBean.setRecUpdatedDate(contactInfo.getRecUpdatedDate());
		contactInfoBean.setRecUpdatedById(contactInfo.getRecUpdatedById().getUserId());
		contactInfoBean.setActiveFlag(contactInfo.isActiveFlag());
		
		return contactInfoBean ;
	}
}
