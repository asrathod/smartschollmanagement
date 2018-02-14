package com.smartschool.bean;

import java.util.Date;

public class ContactInfoBean {
	
	private long contactInfoId;
	private long studentId;
	private String firstContactNo;
	private String streetNoName1;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String secondContactNo;
	private String streetNoName2;
	private String city2;
	private String state2;
	private String country2;
	private String zipCode2;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public ContactInfoBean() {
		
	}

	public ContactInfoBean(long contactInfoId) {
		
		this.contactInfoId = contactInfoId;
	}

	public long getContactInfoId() {
		return contactInfoId;
	}

	public void setContactInfoId(long contactInfoId) {
		this.contactInfoId = contactInfoId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstContactNo() {
		return firstContactNo;
	}

	public void setFirstContactNo(String firstContactNo) {
		this.firstContactNo = firstContactNo;
	}

	public String getStreetNoName1() {
		return streetNoName1;
	}

	public void setStreetNoName1(String streetNoName1) {
		this.streetNoName1 = streetNoName1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getSecondContactNo() {
		return secondContactNo;
	}

	public void setSecondContactNo(String secondContactNo) {
		this.secondContactNo = secondContactNo;
	}

	public String getStreetNoName2() {
		return streetNoName2;
	}

	public void setStreetNoName2(String streetNoName2) {
		this.streetNoName2 = streetNoName2;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getZipCode2() {
		return zipCode2;
	}

	public void setZipCode2(String zipCode2) {
		this.zipCode2 = zipCode2;
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

	public String getRecCreatedByName() {
		return recCreatedByName;
	}

	public void setRecCreatedByName(String recCreatedByName) {
		this.recCreatedByName = recCreatedByName;
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

	public String getRecUpdatedByName() {
		return recUpdatedByName;
	}

	public void setRecUpdatedByName(String recUpdatedByName) {
		this.recUpdatedByName = recUpdatedByName;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
