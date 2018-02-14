package com.smartschool.bean;

import java.util.Date;

public class UserInformationBean {
	private long userId;
	private String userEid;
	private String firstName;
	private String midileName;
	private String lastName;
	private String userEmail;
	private String gender;
	private Date dateOfBirth;
	private String bloodGroup;
	private String idMark1;
	private long adharNo;
	private String userPassword;
	private String passwordSalt;
	private long roleId;
	private String roleName;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
//	private long studentId;
	
	//Constructor
	public UserInformationBean() {
		super();
	}

	public UserInformationBean(long userId) {
		super();
		this.userId = userId;
	}

	//Getters And Setters
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserEid() {
		return userEid;
	}

	public void setUserEid(String userEid) {
		this.userEid = userEid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidileName() {
		return midileName;
	}

	public void setMidileName(String midileName) {
		this.midileName = midileName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getIdMark1() {
		return idMark1;
	}

	public void setIdMark1(String idMark1) {
		this.idMark1 = idMark1;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	/*public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}*/
	
}
