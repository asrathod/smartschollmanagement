package com.smartschool.bean;

import java.util.Date;

public class UserAddressBean {
	
	private long addressId;
	private long userId;
	private String primaryContactNo;
	private String secondaryContactNo;
	private String currentStreetNoName;
	private String currentCity;
	private String currentState;
	private String currentCountry;
	private String currentZipCode;
	private String permanentStreetNoName;
	private String permanentCity;
	private String permanentState;
	private String permanentCountry;
	private String permanentZipCode;
	private Date recCreatedDate;
	private long recCreatedById;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private boolean activeFlag;
	
	public UserAddressBean() {
		super();
	}

	public UserAddressBean(long addressId) {
		super();
		this.addressId = addressId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPrimaryContactNo() {
		return primaryContactNo;
	}

	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public String getSecondaryContactNo() {
		return secondaryContactNo;
	}

	public void setSecondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}

	public String getCurrentStreetNoName() {
		return currentStreetNoName;
	}

	public void setCurrentStreetNoName(String currentStreetNoName) {
		this.currentStreetNoName = currentStreetNoName;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public String getCurrentCountry() {
		return currentCountry;
	}

	public void setCurrentCountry(String currentCountry) {
		this.currentCountry = currentCountry;
	}

	public String getCurrentZipCode() {
		return currentZipCode;
	}

	public void setCurrentZipCode(String currentZipCode) {
		this.currentZipCode = currentZipCode;
	}

	public String getPermanentStreetNoName() {
		return permanentStreetNoName;
	}

	public void setPermanentStreetNoName(String permanentStreetNoName) {
		this.permanentStreetNoName = permanentStreetNoName;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentCountry() {
		return permanentCountry;
	}

	public void setPermanentCountry(String permanentCountry) {
		this.permanentCountry = permanentCountry;
	}

	public String getPermanentZipCode() {
		return permanentZipCode;
	}

	public void setPermanentZipCode(String permanentZipCode) {
		this.permanentZipCode = permanentZipCode;
	}

	public Date getRecCreatedDate() {
		return recCreatedDate;
	}

	public void setRecCreatedDate(Date recCreatedDate) {
		this.recCreatedDate = recCreatedDate;
	}

	public long getRecCreatedById() {
		return recCreatedById;
	}

	public void setRecCreatedById(long recCreatedById) {
		this.recCreatedById = recCreatedById;
	}

	public Date getRecUpdatedDate() {
		return recUpdatedDate;
	}

	public void setRecUpdatedDate(Date recUpdatedDate) {
		this.recUpdatedDate = recUpdatedDate;
	}

	public long getRecUpdatedById() {
		return recUpdatedById;
	}

	public void setRecUpdatedById(long recUpdatedById) {
		this.recUpdatedById = recUpdatedById;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

}
