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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student_information")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="student_id")
	private long studentId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="dob")
	private Date dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="academic_year")
	private String academicYear;
	
	@Column(name="current_standard")
	private String currentStandard;
	
	@Column(name="current_section")
	private String currentSection;
	
	@Column(name ="rec_created_date")
	private Date recCreatedDate;
	
	/*@ManyToOne
	@JoinColumn(name="rec_created_by")
	private Student recCreatedBy;*/
	
	@ManyToOne
	@JoinColumn(name="rec_created_by")
	private UserInformation recCreatedBy;
	
	@Column(name = "rec_updated_date")
	private Date recUpdatedDate;
	
	/*@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private Student recUpdatedBy;*/
	
	@ManyToOne
	@JoinColumn(name="rec_updated_by")
	private UserInformation recUpdatedBy;
	
	@Column(name = "active_flag")
	private boolean activeFlag;
	
	@ManyToOne()
	@JoinColumn(name ="user_id")
	private UserInformation userInformation;
	
	//mappedBy="student", cascade= CascadeType.ALL
	@OneToOne()
	@PrimaryKeyJoinColumn
	private PersonalInformation PersonalInformation;
	
	@OneToOne()
	@PrimaryKeyJoinColumn
	private ContactInfo contactInfo;
	
	@OneToOne()
	@PrimaryKeyJoinColumn
	private AcademicInformation academicInformation;
	
	@OneToOne()
	@PrimaryKeyJoinColumn
	private PreviousAcademicInfo previousAcademicInfo;

	public Student() {
		super();
	}

	public Student(long studentId) {
		super();
		this.studentId = studentId;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Date getRecCreatedDate() {
		return recCreatedDate;
	}

	public void setRecCreatedDate(Date recCreatedDate) {
		this.recCreatedDate = recCreatedDate;
	}

	/*public Student getRecCreatedBy() {
		return recCreatedBy;
	}

	public void setRecCreatedBy(Student recCreatedBy) {
		this.recCreatedBy = recCreatedBy;
	}*/

	public Date getRecUpdatedDate() {
		return recUpdatedDate;
	}

	public void setRecUpdatedDate(Date recUpdatedDate) {
		this.recUpdatedDate = recUpdatedDate;
	}

	/*public Student getRecUpdatedBy() {
		return recUpdatedBy;
	}

	public void setRecUpdatedBy(Student recUpdatedBy) {
		this.recUpdatedBy = recUpdatedBy;
	}*/

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public PersonalInformation getPersonalInformation() {
		return PersonalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		PersonalInformation = personalInformation;
	}

	public UserInformation getRecCreatedBy() {
		return recCreatedBy;
	}

	public void setRecCreatedBy(UserInformation recCreatedBy) {
		this.recCreatedBy = recCreatedBy;
	}

	public UserInformation getRecUpdatedBy() {
		return recUpdatedBy;
	}

	public void setRecUpdatedBy(UserInformation recUpdatedBy) {
		this.recUpdatedBy = recUpdatedBy;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}
	
}
