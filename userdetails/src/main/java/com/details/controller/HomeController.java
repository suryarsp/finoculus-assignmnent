package com.details.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.details.dao.FileDAO;
import com.details.dao.UserDAO;
import com.details.model.FileModel;
import com.details.model.Userinfo;



@Controller
public class HomeController {


	@Autowired
    UserDAO udaoimpl;
	
    @Autowired
	FileDAO fileDao;
	 
	//--------------------------------------- Displaying Entry Page using mapping------------------------------------------------
	@RequestMapping(value = "/entry", method = RequestMethod.GET)
	public ModelAndView submitregForm(@ModelAttribute("userobj") Userinfo userobj) {

		ModelAndView model = new ModelAndView("Entry");
		System.out.println("Displaying entry Page");
		return model;
		
	
	}

	
	/*-----------------------------------Method to save all details to H2 DB-----------------------------------------------*/
	@RequestMapping(value = "/log", method = RequestMethod.POST)
		public ModelAndView saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname,@RequestParam String age, @RequestParam String gender, @RequestParam String location, @RequestParam String mobileno, @RequestParam String address, @RequestParam String nationality, @RequestParam CommonsMultipartFile[] filedata )throws Exception{
	
		for (CommonsMultipartFile aFile : filedata){
            
        System.out.println("Saving file: " + aFile.getOriginalFilename());
         
        FileModel uploadFile = new FileModel();
        uploadFile.setName(aFile.getOriginalFilename());
        uploadFile.setUsername(username);
        uploadFile.setFiledata(aFile.getBytes());
        fileDao.savefile(uploadFile);  
        	}
		
		
		Userinfo userobj=new Userinfo();
		userobj.setUsername(username);
		userobj.setFirstname(firstname);
		userobj.setLastname(lastname);
		userobj.setAge(age);
		userobj.setGender(gender);
		userobj.setMobileno(mobileno);
		userobj.setLocation(location);
		userobj.setNationality(nationality);
		userobj.setAddress(address);
		
		
		
		udaoimpl.addUser(userobj);
		
		ModelAndView model = new ModelAndView("Sucess", "userobj",new Userinfo());
		return model;
	}
	
	
	/*-------------------------------List all details of user from both tables--------------------------------------------------*/
	@RequestMapping(value="/display", method = RequestMethod.GET)
	public String listdetails(Model model){
		
		model.addAttribute("userinfo", new Userinfo());
		model.addAttribute("listuser", udaoimpl.list());
		model.addAttribute("filemodel", new FileModel());
		model.addAttribute("filelist", fileDao.viewfile());
		
		List<FileModel> filelist =fileDao.viewfile();
		model.addAttribute("filelist",filelist);
		
		List<Userinfo> userlist = udaoimpl.list();
		model.addAttribute("userlist", userlist);
		
		return "Display";
		
	}
	}
