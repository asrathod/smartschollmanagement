package com.smartschool.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_address")
public class UserAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "address_id")
	private long addressId;
	
	@OneToOne()
	@JoinColumn(name = "user_id")
	private UserInformation userInfo;
	
	@Column(name = "primary_contact_no")
	private String primaryContactNo;
	
	@Column(name = "secondary_contact_no")
	private String secondaryContactNo;
	
	@Column(name = "current_street_no_name")
	private String currentStreetNoName;
	
	@Column(name = "current_city")
	private String currentCity;
	
	@Column(name = "current_State")
	private String currentState;
	
	@Column(name = "current_country")
	private String currentCountry;
	
	@Column(name = "current_zip_code")
	private String currentZipCode;
	
	@Column(name = "permanent_street_no_name")
	private String permanentStreetNoName;
	
	@Column(name = "permanent_city")
	private String permanentCity;
	
	@Column(name = "permanent_state")
	private String permanentState;
	
	@Column(name = "permanent_country")
	private String permanentCountry;
	
	@Column(name = "permanent_zip_code")
	private String permanentZipCode;
	
	@Column(name = "rec_created_date")
	private Date recCreatedDate;
	
	@ManyToOne
	@JoinColumn(name="rec_created_by")
	private UserInformation recCreatedById;
	
	@Column(name = "rec_updated_date")
	private Date recUpdatedDate;
	
	@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private UserInformation recUpdatedById;
	
	@Column(name = "active_flag")
	private boolean activeFlag;

	// Constructors
	public UserAddress() {
		super();
	}

	public UserAddress(long addressId) {
		super();
		this.addressId = addressId;
	}

	// Getters and Setters
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public UserInformation getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInformation userInfo) {
		this.userInfo = userInfo;
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

	public UserInformation getRecCreatedById() {
		return recCreatedById;
	}

	public void setRecCreatedById(UserInformation recCreatedById) {
		this.recCreatedById = recCreatedById;
	}

	public Date getRecUpdatedDate() {
		return recUpdatedDate;
	}

	public void setRecUpdatedDate(Date recUpdatedDate) {
		this.recUpdatedDate = recUpdatedDate;
	}

	public UserInformation getRecUpdatedById() {
		return recUpdatedById;
	}

	public void setRecUpdatedById(UserInformation recUpdatedById) {
		this.recUpdatedById = recUpdatedById;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	// otString method
	@Override
	public String toString() {
		return "UserAddress [addressId=" + addressId + ", userInfo=" + userInfo + ", primaryContactNo="
				+ primaryContactNo + ", secondaryContactNo=" + secondaryContactNo + ", currentStreetNoName="
				+ currentStreetNoName + ", currentCity=" + currentCity + ", currentState=" + currentState
				+ ", currentCountry=" + currentCountry + ", currentZipCode=" + currentZipCode
				+ ", permanentStreetNoName=" + permanentStreetNoName + ", permanentCity=" + permanentCity
				+ ", permanentState=" + permanentState + ", permanentCountry=" + permanentCountry
				+ ", permanentZipCode=" + permanentZipCode + ", recCreatedDate=" + recCreatedDate + ", recCreatedById="
				+ recCreatedById + ", recUpdatedDate=" + recUpdatedDate + ", recUpdatedById=" + recUpdatedById
				+ ", activeFlag=" + activeFlag + "]";
	}
	
	
}
