package com.smartschool.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="achievements_information")
public class AchievementsInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "achiev_info_id")
	private long achievInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;

	@Column(name = "achievement1")
	private String achievement1;
	
	@Column(name = "achievement2")
	private String achievement2;
	
	@Column(name = "achievement3")
	private String achievement3;
	
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
	
	private String code;
	
	@Transient
	private MultipartFile file;

	public AchievementsInformation() {
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public AchievementsInformation(long achievInfoId) {
		
		this.achievInfoId = achievInfoId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public long getAchievInfoId() {
		return achievInfoId;
	}

	public void setAchievInfoId(long achievInfoId) {
		this.achievInfoId = achievInfoId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getAchievement1() {
		return achievement1;
	}

	public void setAchievement1(String achievement1) {
		this.achievement1 = achievement1;
	}

	public String getAchievement2() {
		return achievement2;
	}

	public void setAchievement2(String achievement2) {
		this.achievement2 = achievement2;
	}

	public String getAchievement3() {
		return achievement3;
	}

	public void setAchievement3(String achievement3) {
		this.achievement3 = achievement3;
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
