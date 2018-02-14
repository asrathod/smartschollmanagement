package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.UserAddressBean;

public interface UserAddressDao {

	public long createAddressInfo(UserAddressBean userAddressBean);
	public UserAddressBean getAddressById(long addressId);
	public List<UserAddressBean> getAllAddresses();
	public UserAddressBean updateAddress(UserAddressBean userAddressBean);
	public void deleteUserAddress(long addressId);
	
}
