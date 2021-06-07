package com.example.icf.demo.datatypes;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String employeeid;
	private String startdate;
	private String designation;
	private String departement;
	private String enddate;
	private String status;
	private String dob;
	private String reportingmanager;
	private String gender;
	private String bloodgroup;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getemployeeid() {
		return employeeid;
	}
	public void setEmployeeId(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setstartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
