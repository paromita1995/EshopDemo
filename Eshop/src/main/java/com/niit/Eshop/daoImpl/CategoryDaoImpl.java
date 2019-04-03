package com.niit.Eshop.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Eshop.dao.CategoryDao;
import com.niit.Eshop.model.Category;

@Repository("categoryDao")
@Transactional
@SuppressWarnings("unchecked")
public class CategoryDaoImpl implements CategoryDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	
	}
	public boolean addCategory(Category category) 
	{
		try
		{
		Session session = getSession();

		session.save(category);

		session.flush();

		session.close();
		return true;
		}
		 catch(HibernateException e)
   		{
   		return false;
   		}
	
	}
	 public boolean updateCategory(Category category) 
	 {
  	   try
  	   {
	Session session = getSession();
	session.update(category);
	session.flush();
	session.close();
	return false;
  	   }
  	   catch(HibernateException e)
 		{
 		return false;
 		}
     }
		public boolean deleteCategory(Category category) 
		{
			try
			{
			Session session = getSession();
			session.delete(category);
			session.flush();
			session.close();
			return true;
			}
			  catch(HibernateException e)
	   		{
	   		return false;
	   		}
	       }

	

	
		
		

	

	public List<Category> getAllCategory() {
		Session session = getSession();
		Query query=session.createQuery("from Category");
		List<Category> list = query.list();
		return list;
	}

	
	

	public Category getCategoryById(int id) {
		Session session = getSession();
		Query query=session.createQuery("FROM Category p where categoryId=?");
		query.setParameter(0,id);
		Category p=(Category)query.uniqueResult();
		return p;	
		
	}

	public Category deleteCategoryById(int id) {
		Session session = getSession();
		Query query=session.createQuery("FROM Category p where categoryId=?");
		query.setParameter(0,id);
		Category p=(Category)query.uniqueResult();
		session.delete(p);
		session.flush();
		session.close();
		return p;
	}
	
}


	
