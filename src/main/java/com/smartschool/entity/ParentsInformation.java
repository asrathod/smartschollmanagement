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
@Table(name="parents_information")
public class ParentsInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "parents_info_id")
	private long parentsInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "father_first_name")
	private String fatherFirstName;
	
	@Column(name = "father_last_name")
	private String fatherLasttName;
	
	@Column(name = "father_qualifiction")
	private String fatherQualification;
	
	@Column(name = "father_employment")
	private String fatherEmployment;
	
	@Column(name = "father_annual_income")
	private double fatherAnnualIncome;
	
	@Column(name = "mobile_no1")
	private long mobileNo1;
	
	@Column(name = "mother_first_name")
	private String motherFirstName;
	
	@Column(name = "mother_last_name")
	private String motherLasttName;
	
	@Column(name = "mother_qualifiction")
	private String motherQualification;
	
	@Column(name = "mother_employment")
	private String motherEmployment;
	
	@Column(name = "mother_annual_income")
	private double motherAnnualIncome;
	
	@Column(name = "mobile_no2")
	private long mobileNo2;
	
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

	public ParentsInformation() {
		
	}

	public ParentsInformation(long parentsInfoId) {
		
		this.parentsInfoId = parentsInfoId;
	}

	public long getParentsInfoId() {
		return parentsInfoId;
	}

	public void setParentsInfoId(long parentsInfoId) {
		this.parentsInfoId = parentsInfoId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public long getMobileNo1() {
		return mobileNo1;
	}

	public void setMobileNo1(long mobileNo1) {
		this.mobileNo1 = mobileNo1;
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

	public long getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(long mobileNo2) {
		this.mobileNo2 = mobileNo2;
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

}
