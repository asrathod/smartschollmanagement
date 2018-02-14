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
@Table(name="personal_information")
public class PersonalInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "personal_info_id")
	private long personalInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "place_of_birth")
	private String placeOfbirth;
	
	@Column(name = "religion")
	private String religion;
	
	@Column(name = "cast")
	private String cast;
	
	@Column(name = "sub_cast")
	private String subCast;
	
	@Column(name = "mother_toungue")
	private String motherToungue;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "id_mark1")
	private String idMark1;
	
	@Column(name = "id_mark2")
	private String idMark2;
	
	@Column(name = "addmision_no")
	private long addmisionNo;
	
	@Column(name = "adhar_no")
	private long adharNo;
	
	@Column(name = "disability_yesno")
	private String disabilityYesNo;
	
	@Column(name = "disability_details")
	private String disabilityDetails;
	
	@Column(name = "medical_history")
	private String medicalHistory;
	
	@Column(name = "medical_treatement")
	private String medicalTreatement;
	
	@Column(name = "rec_created_date")
	private Date recCreatedDate;
	
	/*@ManyToOne
	@JoinColumn(name="rec_created_by")
	private Student recCreatedById;*/
	
	@ManyToOne
	@JoinColumn(name="rec_created_by")
	private UserInformation recCreatedById;
	
	@Column(name = "rec_updated_date")
	private Date recUpdatedDate;
	
	/*@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private Student recUpdatedById;*/
	
	@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private UserInformation recUpdatedById;
	
	@Column(name = "active_flag")
	private boolean activeFlag;

	public PersonalInformation() {
		super();
	}

	public PersonalInformation(long personalInfoId) {
		super();
		this.personalInfoId = personalInfoId;
	}

	public long getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(long personalInfoId) {
		this.personalInfoId = personalInfoId;
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public String getDisabilityYesNo() {
		return disabilityYesNo;
	}

	public void setDisabilityYesNo(String disabilityYesNo) {
		this.disabilityYesNo = disabilityYesNo;
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

	/*public Student getRecCreatedById() {
		return recCreatedById;
	}

	public void setRecCreatedById(Student recCreatedById) {
		this.recCreatedById = recCreatedById;
	}
*/
	public Date getRecUpdatedDate() {
		return recUpdatedDate;
	}

	public void setRecUpdatedDate(Date recUpdatedDate) {
		this.recUpdatedDate = recUpdatedDate;
	}

	/*public Student getRecUpdatedById() {
		return recUpdatedById;
	}

	public void setRecUpdatedById(Student recUpdatedById) {
		this.recUpdatedById = recUpdatedById;
	}*/

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public UserInformation getRecCreatedById() {
		return recCreatedById;
	}

	public void setRecCreatedById(UserInformation recCreatedById) {
		this.recCreatedById = recCreatedById;
	}

	public UserInformation getRecUpdatedById() {
		return recUpdatedById;
	}

	public void setRecUpdatedById(UserInformation recUpdatedById) {
		this.recUpdatedById = recUpdatedById;
	}
	
}
