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
@Table(name="academic_information")
public class AcademicInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "academic_info_id")
	private long academicInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "academic_stream")
	private String academicStream;
	
	@Column(name = "medium")
	private String medium;
	
	@Column(name = "admission_mode")
	private String admissionMode;
	
	@Column(name = "transport_req")
	private String transportReq;
	
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

	public AcademicInformation() {
		super();
	}

	public AcademicInformation(long academicInfoId) {
		super();
		this.academicInfoId = academicInfoId;
	}

	public long getAcademicInfoId() {
		return academicInfoId;
	}

	public void setAcademicInfoId(long academicInfoId) {
		this.academicInfoId = academicInfoId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
