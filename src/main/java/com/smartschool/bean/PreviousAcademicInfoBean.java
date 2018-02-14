package com.smartschool.bean;

import java.util.Date;

public class PreviousAcademicInfoBean {
	private long previousAcaInfoId;
	private long studentId;
	private String firstName;
	private Date dateOfJoining;
	private String previousSchool;
	private String lastStdStudied;
	private String leavingReason;
	private String comments;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public PreviousAcademicInfoBean() {
		super();
	}
	public PreviousAcademicInfoBean(long previousAcaInfoId) {
		super();
		this.previousAcaInfoId = previousAcaInfoId;
	}
	public long getPreviousAcaInfoId() {
		return previousAcaInfoId;
	}
	public void setPreviousAcaInfoId(long previousAcaInfoId) {
		this.previousAcaInfoId = previousAcaInfoId;
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
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getPreviousSchool() {
		return previousSchool;
	}
	public void setPreviousSchool(String previousSchool) {
		this.previousSchool = previousSchool;
	}
	public String getLastStdStudied() {
		return lastStdStudied;
	}
	public void setLastStdStudied(String lastStdStudied) {
		this.lastStdStudied = lastStdStudied;
	}
	public String getLeavingReason() {
		return leavingReason;
	}
	public void setLeavingReason(String leavingReason) {
		this.leavingReason = leavingReason;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
