package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.ContactInfoBean;

public interface ContactInfoService {
	
	public long createContactInfo(ContactInfoBean contactInfoBean);
	public ContactInfoBean getContactformationById(long contactInfoId);
	public List<ContactInfoBean> getAllContactInformation();
	public ContactInfoBean updateContactInformation(ContactInfoBean contactInfoBean);
	public void deleteContactInformation(long contactInfoId);

}
