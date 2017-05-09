package com.details.dao;


import java.util.List;

import com.details.model.FileModel;
import com.details.model.Userinfo;




public interface UserDAO {
	
	public void addUser(Userinfo userobj);
	
	public List<Userinfo> list();
	
	
 
}
