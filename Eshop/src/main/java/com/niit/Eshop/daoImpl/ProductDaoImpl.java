package com.niit.Eshop.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Eshop.dao.ProductDao;
import com.niit.Eshop.model.Product;

@Repository("productDao")
@Transactional
@SuppressWarnings("unchecked")
public class ProductDaoImpl implements ProductDao
{
		@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	public boolean saveOrUpdateProduct(Product product)
	  {
      	try
      	{
              Session session = getSession();
		session.saveOrUpdate(product);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
       } 

	public List<Product> getAllProducts() {
		Session session = getSession();
	    Query query=session.createQuery("from Product");
		List<Product> list = query.list();
		session.close();
		return list;
	}

	public Product getProductById(int id) {
		Session session = getSession();
		Query query=session.createQuery("FROM Product q where productId=?");
		query.setParameter(0, id);
		Product q=(Product)query.uniqueResult();
		return q;
	}

	

	public List<Product> listByCategoryId(int categoryId) {
		Session session = getSession();
		Query query=session.createQuery("FROM Product p where p.productCategory.categoryId=?");
		query.setParameter(0, categoryId);
		List<Product> p=query.list();
		session.close();
		return p;
	}

	public boolean deleteProduct(int id) {
		try
      	{
              Session session = getSession();
		session.delete(id);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
		
	}

	

	public boolean addProduct(Product product) {
		try
      	{
              Session session = getSession();
		session.save(product);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
		
	}

	public boolean updateProduct(Product product) {
		try
      	{
              Session session = getSession();
		session.update(product);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
	}  
	
	
	
	
}
