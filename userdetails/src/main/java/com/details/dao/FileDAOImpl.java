package com.details.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.details.model.FileModel;

@Repository("FileDAO")
public class FileDAOImpl implements FileDAO {
	
	@Autowired
	    SessionFactory sessionFactory;

	
	/*================================Saving the files to table using object==================================*/
	public void savefile(FileModel filemodel) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(filemodel);
		session.getTransaction().commit();
		session.close();
	
	}

	/*================================Listing the files from table using object==================================*/
	@SuppressWarnings("unchecked")
	public List<FileModel> viewfile()
	{
		
		Session session = sessionFactory.openSession();
	   session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<FileModel> filelist = (List<FileModel>) session.createCriteria(FileModel.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		session.getTransaction().commit();
		session.close();
	
		return filelist;
	}

}
