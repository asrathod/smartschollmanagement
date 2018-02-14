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
@Table(name="extra_curricular_information")
public class ExtraCurricularInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "extra_curr_info_id")
	private long extraCurrInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "sprorts")
	private String sprorts;
	
	@Column(name = "indoorGame")
	private String indoorGame;
	
	@Column(name = "outdoorGame")
	private String outdoorGame;
	
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

	public ExtraCurricularInformation() {
		
	}

	public ExtraCurricularInformation(long extraCurrInfoId) {
		
		this.extraCurrInfoId = extraCurrInfoId;
	}

	public long getExtraCurrInfoId() {
		return extraCurrInfoId;
	}

	public void setExtraCurrInfoId(long extraCurrInfoId) {
		this.extraCurrInfoId = extraCurrInfoId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
