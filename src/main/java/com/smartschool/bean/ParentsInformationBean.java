package com.smartschool.bean;

import java.util.Date;

public class ParentsInformationBean {
	private long parentsInfoId;
	private long studentId;
	private String firstName;
	private String fatherFirstName;
	private String fatherLasttName;
	private String fatherQualification;
	private String fatherEmployment;
	private double fatherAnnualIncome;
	private long mobileNo1;
	private String motherFirstName;
	private String motherLasttName;
	private String motherQualification;
	private String motherEmployment;
	private double motherAnnualIncome;
	private long mobileNo2;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public ParentsInformationBean() {
		
	}

	public ParentsInformationBean(long parentsInfoId) {
		
		this.parentsInfoId = parentsInfoId;
	}

	public long getParentsInfoId() {
		return parentsInfoId;
	}

	public void setParentsInfoId(long parentsInfoId) {
		this.parentsInfoId = parentsInfoId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherLasttName() {
		return fatherLasttName;
	}

	public void setFatherLasttName(String fatherLasttName) {
		this.fatherLasttName = fatherLasttName;
	}

	public String getFatherQualification() {
		return fatherQualification;
	}

	public void setFatherQualification(String fatherQualification) {
		this.fatherQualification = fatherQualification;
	}

	public String getFatherEmployment() {
		return fatherEmployment;
	}

	public void setFatherEmployment(String fatherEmployment) {
		this.fatherEmployment = fatherEmployment;
	}

	public double getFatherAnnualIncome() {
		return fatherAnnualIncome;
	}

	public void setFatherAnnualIncome(double fatherAnnualIncome) {
		this.fatherAnnualIncome = fatherAnnualIncome;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getMotherLasttName() {
		return motherLasttName;
	}

	public void setMotherLasttName(String motherLasttName) {
		this.motherLasttName = motherLasttName;
	}

	public String getMotherQualification() {
		return motherQualification;
	}

	public void setMotherQualification(String motherQualification) {
		this.motherQualification = motherQualification;
	}

	public String getMotherEmployment() {
		return motherEmployment;
	}

	public void setMotherEmployment(String motherEmployment) {
		this.motherEmployment = motherEmployment;
	}

	public double getMotherAnnualIncome() {
		return motherAnnualIncome;
	}

	public void setMotherAnnualIncome(double motherAnnualIncome) {
		this.motherAnnualIncome = motherAnnualIncome;
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

	public long getMobileNo1() {
		return mobileNo1;
	}

	public void setMobileNo1(long mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}

	public long getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(long mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}
	
}
