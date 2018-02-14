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
@Table(name="contact_information")
public class ContactInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "contact_info_id")
	private long contactInfoId;
	
	@OneToOne()
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "first_contact_no")
	private String firstContactNo;
	
	@Column(name = "street_no_name1")
	private String streetNoName1;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "ZipCode")
	private String zipCode;
	
	@Column(name = "second_contact_no")
	private String secondContactNo;
	
	@Column(name = "street_no_name2")
	private String streetNoName2;
	
	@Column(name = "city2")
	private String city2;
	
	@Column(name = "State2")
	private String state2;
	
	@Column(name = "Country2")
	private String country2;
	
	@Column(name = "ZipCode2")
	private String zipCode2;
	
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
	
	/*@OneToOne
    @PrimaryKeyJoinColumn
	private Student student;*/

	public ContactInfo() {
		
	}

	public ContactInfo(long contactInfoId) {
		
		this.contactInfoId = contactInfoId;
	}

	public long getContactInfoId() {
		return contactInfoId;
	}

	public void setContactInfoId(long contactInfoId) {
		this.contactInfoId = contactInfoId;
	}

	public String getFirstContactNo() {
		return firstContactNo;
	}

	public void setFirstContactNo(String firstContactNo) {
		this.firstContactNo = firstContactNo;
	}

	public String getStreetNoName1() {
		return streetNoName1;
	}

	public void setStreetNoName1(String streetNoName1) {
		this.streetNoName1 = streetNoName1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSecondContactNo() {
		return secondContactNo;
	}

	public void setSecondContactNo(String secondContactNo) {
		this.secondContactNo = secondContactNo;
	}

	public String getStreetNoName2() {
		return streetNoName2;
	}

	public void setStreetNoName2(String streetNoName2) {
		this.streetNoName2 = streetNoName2;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getZipCode2() {
		return zipCode2;
	}

	public void setZipCode2(String zipCode2) {
		this.zipCode2 = zipCode2;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
