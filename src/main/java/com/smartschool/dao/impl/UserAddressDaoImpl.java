package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.UserAddressBean;
import com.smartschool.dao.UserAddressDao;
import com.smartschool.entity.UserAddress;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class UserAddressDaoImpl implements UserAddressDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createAddressInfo(UserAddressBean userAddressBean) {
		UserAddress userAddress = converBeanToEntity(userAddressBean);
		long userAddressId = (long) hibernateUtil.create(userAddress);
		return userAddressId;
	}

	@Override
	public UserAddressBean getAddressById(long addressId) {
		UserAddress userAddress = hibernateUtil.fetchById(addressId, UserAddress.class);
		
		return convertEntityToBean(userAddress);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserAddressBean> getAllAddresses() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM UserAddress");
		return getUserAddress(query.list());
	}

	private List<UserAddressBean> getUserAddress(List<UserAddress> userAddressLists) {
		List<UserAddressBean> userAddressBeans = new ArrayList<UserAddressBean>();
		for(UserAddress userAddress : userAddressLists){
			UserAddressBean userAddressBean = convertEntityToBean(userAddress);
			userAddressBeans.add(userAddressBean);
		}
		return userAddressBeans ;
	}
	
	@Override
	public UserAddressBean updateAddress(UserAddressBean userAddressBean) {
		UserAddress userAddress = converBeanToEntity(userAddressBean);
		userAddress = hibernateUtil.update(userAddress);
		return convertEntityToBean(userAddress);
	}

	@Override
	public void deleteUserAddress(long addressId) {
		UserAddress userAddress = new UserAddress();
		userAddress.setAddressId(addressId);
		hibernateUtil.delete(userAddress);
	}

	//converBeanToEntity
	private UserAddress converBeanToEntity(UserAddressBean userAddressBean) {
		UserAddress UserAddress = new UserAddress();
		UserAddress.setAddressId(userAddressBean.getAddressId());
		UserAddress.setUserInfo(new UserInformation(userAddressBean.getUserId()));
		UserAddress.setPrimaryContactNo(userAddressBean.getPrimaryContactNo());
		UserAddress.setSecondaryContactNo(userAddressBean.getSecondaryContactNo());
		UserAddress.setCurrentStreetNoName(userAddressBean.getCurrentStreetNoName());
		UserAddress.setCurrentCity(userAddressBean.getCurrentCity());
		UserAddress.setCurrentState(userAddressBean.getCurrentState());
		UserAddress.setCurrentCountry(userAddressBean.getCurrentCountry());
		UserAddress.setCurrentZipCode(userAddressBean.getCurrentZipCode());
		UserAddress.setPermanentStreetNoName(userAddressBean.getPermanentStreetNoName());
		UserAddress.setPermanentCity(userAddressBean.getPermanentCity());
		UserAddress.setPermanentState(userAddressBean.getCurrentState());
		UserAddress.setPermanentCountry(userAddressBean.getCurrentCountry());
		UserAddress.setPermanentZipCode(userAddressBean.getCurrentZipCode());
		UserAddress.setRecCreatedDate(userAddressBean.getRecCreatedDate());
		UserAddress.setRecCreatedById(new UserInformation(userAddressBean.getUserId()));
		UserAddress.setRecUpdatedDate(userAddressBean.getRecUpdatedDate());
		UserAddress.setRecUpdatedById(new UserInformation(userAddressBean.getUserId()));
		UserAddress.setActiveFlag(userAddressBean.isActiveFlag());
		
		return UserAddress ;
	}
	
	//convertEntityToBean
	private UserAddressBean convertEntityToBean(UserAddress userAddress) {
		UserAddressBean userAddressBean = new UserAddressBean();
		userAddressBean.setAddressId(userAddress.getAddressId());
		userAddressBean.setUserId(userAddress.getUserInfo().getUserId());
		userAddressBean.setPrimaryContactNo(userAddress.getPrimaryContactNo());
		userAddressBean.setSecondaryContactNo(userAddress.getSecondaryContactNo());
		userAddressBean.setCurrentCity(userAddress.getCurrentCity());
		userAddressBean.setCurrentState(userAddress.getCurrentState());
		userAddressBean.setCurrentCountry(userAddress.getCurrentCountry());
		userAddressBean.setCurrentZipCode(userAddress.getCurrentZipCode());
		userAddressBean.setPermanentStreetNoName(userAddress.getPermanentStreetNoName());
		userAddressBean.setPermanentCity(userAddress.getPermanentCity());
		userAddressBean.setPermanentState(userAddress.getPermanentState());
		userAddressBean.setPermanentCountry(userAddress.getCurrentCountry());
		userAddressBean.setPermanentZipCode(userAddress.getPermanentZipCode());
		userAddressBean.setRecCreatedDate(userAddress.getRecCreatedDate());
		userAddressBean.setRecCreatedById(userAddress.getRecCreatedById().getUserId());
		userAddressBean.setRecUpdatedDate(userAddress.getRecUpdatedDate());
		userAddressBean.setRecUpdatedById(userAddress.getRecUpdatedById().getUserId());
		userAddressBean.setActiveFlag(userAddress.isActiveFlag());
		
		return userAddressBean ;
	}
}
