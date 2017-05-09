package com.details.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
@Entity /*Creates Table*/
@Table(name = "FILE_TABLE")/*Setting Table Name*/
public class FileModel implements Serializable{

	@Id
	private String username;  
	
	@Column
	public String name;

	@Column
	public byte[] filedata;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}

	public byte[] getFiledata() {
		return filedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}
		



}
