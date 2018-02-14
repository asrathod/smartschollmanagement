package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.ContactInfoBean;
import com.smartschool.dao.ContactInfoDao;
import com.smartschool.service.ContactInfoService;

@Service
@Transactional
public class ContactInfoServiceImpl implements ContactInfoService {
	
	@Autowired
	private ContactInfoDao contactInfoDao;

	@Override
	public long createContactInfo(ContactInfoBean contactInfoBean) {
		
		return contactInfoDao.createContactInfo(contactInfoBean);
	}

	@Override
	public ContactInfoBean getContactformationById(long contactInfoId) {
		// TODO Auto-generated method stub
		return contactInfoDao.getContactformationById(contactInfoId);
	}

	@Override
	public List<ContactInfoBean> getAllContactInformation() {
		// TODO Auto-generated method stub
		return contactInfoDao.getAllContactInformation();
	}

	@Override
	public ContactInfoBean updateContactInformation(ContactInfoBean contactInfoBean) {
		// TODO Auto-generated method stub
		return contactInfoDao.updateContactInformation(contactInfoBean);
	}

	@Override
	public void deleteContactInformation(long contactInfoId) {
		contactInfoDao.deleteContactInformation(contactInfoId);
		
	}

}
