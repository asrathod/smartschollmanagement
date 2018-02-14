package com.smartschool.bean;

import java.util.Date;

public class ExtraCurricularInformationBean {
	
	private long extraCurrInfoId;
	private long studentId;
	private String firstName;
	private String sprorts;
	private String indoorGame;
	private String outdoorGame;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public ExtraCurricularInformationBean() {
		
	}

	public ExtraCurricularInformationBean(long extraCurrInfoId) {
		
		this.extraCurrInfoId = extraCurrInfoId;
	}

	public long getExtraCurrInfoId() {
		return extraCurrInfoId;
	}

	public void setExtraCurrInfoId(long extraCurrInfoId) {
		this.extraCurrInfoId = extraCurrInfoId;
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

	public String getSprorts() {
		return sprorts;
	}

	public void setSprorts(String sprorts) {
		this.sprorts = sprorts;
	}

	public String getIndoorGame() {
		return indoorGame;
	}

	public void setIndoorGame(String indoorGame) {
		this.indoorGame = indoorGame;
	}

	public String getOutdoorGame() {
		return outdoorGame;
	}

	public void setOutdoorGame(String outdoorGame) {
		this.outdoorGame = outdoorGame;
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
