package com.smartschool.bean;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class AchievementsInformationBean {

	private long achievInfoId;
	private long studentId;
	private String firstName;
	private String achievement1;
	private String achievement2;
	private String achievement3;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	private String code;
	private MultipartFile file;
	
	public AchievementsInformationBean() {
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public AchievementsInformationBean(long achievInfoId) {
		
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
