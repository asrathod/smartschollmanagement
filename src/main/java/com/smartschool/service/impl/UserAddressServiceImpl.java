package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.UserAddressBean;
import com.smartschool.dao.UserAddressDao;
import com.smartschool.service.UserAddressService;

@Service
@Transactional
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressDao userAddressDao;
	
	@Override
	public long createAddressInfo(UserAddressBean userAddressBean) {
		
		return userAddressDao.createAddressInfo(userAddressBean);
	}

	@Override
	public UserAddressBean getAddressById(long addressId) {
		
		return userAddressDao.getAddressById(addressId);
	}

	@Override
	public List<UserAddressBean> getAllAddresses() {
		
		return userAddressDao.getAllAddresses();
	}

	@Override
	public UserAddressBean updateAddress(UserAddressBean userAddressBean) {
		
		return userAddressDao.updateAddress(userAddressBean);
	}

	@Override
	public void deleteUserAddress(long addressId) {
		userAddressDao.deleteUserAddress(addressId);

	}

}
