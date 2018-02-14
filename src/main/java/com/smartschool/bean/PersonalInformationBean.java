package com.smartschool.bean;

import java.util.Date;

public class PersonalInformationBean {
	
	private long personalInfoId;
	private long studentId;
	private String firstName;
	private String placeOfbirth;
	private String religion;
	private String cast;
	private String subCast;
	private String motherToungue;
	private String bloodGroup;
	private String idMark1;
	private String idMark2;
	private long addmisionNo;
	private long adharNo;
	private String disabilityYesno;
	private String disabilityDetails;
	private String medicalHistory;
	private String medicalTreatement;
	private Date recCreatedDate;
	private long recCreatedById;
	private String recCreatedByName;
	private Date recUpdatedDate;
	private long recUpdatedById;
	private String recUpdatedByName;
	private boolean activeFlag;
	
	public PersonalInformationBean() {
		super();
	}

	public PersonalInformationBean(long personalInfoId) {
		super();
		this.personalInfoId = personalInfoId;
	}

	public long getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(long personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getPlaceOfbirth() {
		return placeOfbirth;
	}

	public void setPlaceOfbirth(String placeOfbirth) {
		this.placeOfbirth = placeOfbirth;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getSubCast() {
		return subCast;
	}

	public void setSubCast(String subCast) {
		this.subCast = subCast;
	}

	public String getMotherToungue() {
		return motherToungue;
	}

	public void setMotherToungue(String motherToungue) {
		this.motherToungue = motherToungue;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getIdMark1() {
		return idMark1;
	}

	public void setIdMark1(String idMark1) {
		this.idMark1 = idMark1;
	}

	public String getIdMark2() {
		return idMark2;
	}

	public void setIdMark2(String idMark2) {
		this.idMark2 = idMark2;
	}

	public long getAddmisionNo() {
		return addmisionNo;
	}

	public void setAddmisionNo(long addmisionNo) {
		this.addmisionNo = addmisionNo;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getDisabilityYesno() {
		return disabilityYesno;
	}

	public void setDisabilityYesno(String disabilityYesno) {
		this.disabilityYesno = disabilityYesno;
	}

	public String getDisabilityDetails() {
		return disabilityDetails;
	}

	public void setDisabilityDetails(String disabilityDetails) {
		this.disabilityDetails = disabilityDetails;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getMedicalTreatement() {
		return medicalTreatement;
	}

	public void setMedicalTreatement(String medicalTreatement) {
		this.medicalTreatement = medicalTreatement;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
