package com.details.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	

@Entity
@Table
public class Userinfo {


@Id	
String username;	

@Column
String firstname;

@Column
String lastname;

@Column
String age;

@Column
String gender;

@Column
String email;

@Column
String location;

@Column
String mobileno;

@Column
String address;

@Column
String nationality;

@ManyToOne
@JoinColumn(name="username",updatable=false,insertable=false,nullable=false)
private FileModel fileModel; /*=========== Getting Data from FileModel POJO Class==================================*/


public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
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

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getMobileno() {
	return mobileno;
}

public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public FileModel getFileModel() {
	return fileModel;
}

public void setFileModel(FileModel fileModel) {
	this.fileModel = fileModel;
}


}
