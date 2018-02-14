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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "experience_information")
public class ExperienceInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="exp_info_id")
	private long expInfoId;
	
	@OneToOne()
	@JoinColumn(name = "user_id")
	private UserInformation user;
	
	@Column(name ="year_of_exp")
	private int yearOfExp;
	
	@Column(name ="exp_details1")
	private String expDetails1;
	
	@Column(name ="exp_details2")
	private String expDetails2;
	
	@Column(name ="skills_details1")
	private String skillsDetails1;
	
	@Column(name ="skills_details2")
	private String skillsDetails2;
	
	@Column(name ="skills_details3")
	private String skillsDetails3;
	
	@Column(name ="current_salary")
	private double currentSalary;
	
	@Column(name ="previous_salary")
	private double previousSalary;
	
	@Column(name ="date_of_joining")
	private Date dateOfJoining;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_created_date")
	private Date recCreatedDate;
	
	@ManyToOne
	@JoinColumn(name="rec_created_by")
	private UserInformation recCreatedById;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_updated_date")
	private Date recUpdatedDate;
	
	@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private UserInformation recUpdatedById;
	
	@Column(name = "active_flag")
	private boolean activeFlag;

	public ExperienceInformation() {
		super();
	}

	public ExperienceInformation(long expInfoId) {
		super();
		this.expInfoId = expInfoId;
	}

	public long getExpInfoId() {
		return expInfoId;
	}

	public void setExpInfoId(long expInfoId) {
		this.expInfoId = expInfoId;
	}

	public UserInformation getUser() {
		return user;
	}

	public void setUser(UserInformation user) {
		this.user = user;
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
