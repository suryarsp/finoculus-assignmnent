package com.details.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.details.model.FileModel;
import com.details.model.Userinfo;


@Repository("UserDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired(required=true)
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public void addUser(Userinfo userobj) {
		
		System.out.println("user -----------" +userobj);

		Userinfo uc=new Userinfo();
		uc.setAddress(userobj.getAddress());
		uc.setAge(userobj.getAge());
		uc.setEmail(userobj.getEmail());
		uc.setFirstname(userobj.getFirstname());
		uc.setGender(userobj.getFirstname());
		uc.setLastname(userobj.getLastname());
		uc.setLocation(userobj.getLocation());
		uc.setMobileno(userobj.getLocation());
		uc.setUsername(userobj.getUsername());
		System.out.println("-----------usercredential----------------");
		
		
		/*--------------------------Creating session to store data----------------------------------*/
		Session session=sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		
		session.saveOrUpdate(userobj);  /*save or update operation */
		tx.commit();
		session.flush();
		session.close();
		/*<-------------------------------------Closing Session---------------------------->*/
		System.out.println(" -----------------------Data Saved Successfully---------------------");
	}

	
	public List<Userinfo> list() {
		
		Session session = sessionFactory.openSession();
		
		Query query= session.createQuery("from Userinfo");
		
		System.out.println("--------------------getting data from database---------------------------");
		List<Userinfo> userlist = query.list();
		
		session.flush();
		/*-----------------------------------Closing session----------------------------------*/
		return userlist;
		
	}
	
	

}
