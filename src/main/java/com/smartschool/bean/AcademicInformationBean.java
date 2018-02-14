package com.smartschool.bean;

import java.util.Date;

public class AcademicInformationBean {
	
	private long academicInfoId;
	private long studentId;
	private String academicYear;
	private String currentStandard;
	private String currentSection;
	private String status;
	private String academicStream;
	private String medium;
	private String admissionMode;
	private String transportReq;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public AcademicInformationBean() {
		
	}

	public AcademicInformationBean(long academicInfoId) {
		
		this.academicInfoId = academicInfoId;
	}

	public long getAcademicInfoId() {
		return academicInfoId;
	}

	public void setAcademicInfoId(long academicInfoId) {
		this.academicInfoId = academicInfoId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getCurrentStandard() {
		return currentStandard;
	}

	public void setCurrentStandard(String currentStandard) {
		this.currentStandard = currentStandard;
	}

	public String getCurrentSection() {
		return currentSection;
	}

	public void setCurrentSection(String currentSection) {
		this.currentSection = currentSection;
	}

	public String getAcademicStream() {
		return academicStream;
	}

	public void setAcademicStream(String academicStream) {
		this.academicStream = academicStream;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getAdmissionMode() {
		return admissionMode;
	}

	public void setAdmissionMode(String admissionMode) {
		this.admissionMode = admissionMode;
	}

	public String getTransportReq() {
		return transportReq;
	}

	public void setTransportReq(String transportReq) {
		this.transportReq = transportReq;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
