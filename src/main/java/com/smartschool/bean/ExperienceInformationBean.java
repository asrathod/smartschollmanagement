package com.smartschool.bean;

import java.util.Date;

public class ExperienceInformationBean {
	private long expInfoId;
	private long userId;
	private String userEid;
	private String userName;
	private int yearOfExp;
	private String expDetails1;
	private String expDetails2;
	private String skillsDetails1;
	private String skillsDetails2;
	private String skillsDetails3;
	private double currentSalary;
	private double previousSalary;
	private Date dateOfJoining;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public ExperienceInformationBean() {
		super();
	}

	public ExperienceInformationBean(long expInfoId) {
		super();
		this.expInfoId = expInfoId;
	}

	public long getExpInfoId() {
		return expInfoId;
	}

	public void setExpInfoId(long expInfoId) {
		this.expInfoId = expInfoId;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getExpDetails1() {
		return expDetails1;
	}

	public void setExpDetails1(String expDetails1) {
		this.expDetails1 = expDetails1;
	}

	public String getExpDetails2() {
		return expDetails2;
	}

	public void setExpDetails2(String expDetails2) {
		this.expDetails2 = expDetails2;
	}

	public String getSkillsDetails1() {
		return skillsDetails1;
	}

	public void setSkillsDetails1(String skillsDetails1) {
		this.skillsDetails1 = skillsDetails1;
	}

	public String getSkillsDetails2() {
		return skillsDetails2;
	}

	public void setSkillsDetails2(String skillsDetails2) {
		this.skillsDetails2 = skillsDetails2;
	}

	public String getSkillsDetails3() {
		return skillsDetails3;
	}

	public void setSkillsDetails3(String skillsDetails3) {
		this.skillsDetails3 = skillsDetails3;
	}

	public double getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public double getPreviousSalary() {
		return previousSalary;
	}

	public void setPreviousSalary(double previousSalary) {
		this.previousSalary = previousSalary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
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
