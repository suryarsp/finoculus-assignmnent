package com.details.dao;

import java.util.List;

import com.details.model.FileModel;

public interface FileDAO {

	public void savefile(FileModel filemodel);
	
	public List<FileModel> viewfile();

}
