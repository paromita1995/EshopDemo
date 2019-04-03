package com.niit.Eshop.daoImpl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Eshop.dao.UserDetailDao;
import com.niit.Eshop.model.ShippingAddress;
import com.niit.Eshop.model.UserDetail;

@Repository("userDetailDao")
@Transactional
@SuppressWarnings("unchecked")
public class UserDetailDaoImpl implements UserDetailDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean addUsers(UserDetail users) {
		try
      	{
              Session session = getSession();
		session.save(users);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
	}

	
	
	public List<UserDetail> getAllUsers() {
		Session session = getSession();
		Query query=session.createQuery("from UserDetail");
		List<UserDetail> list = query.list();
		return list;
	}

	public UserDetail getUsersById(String userId) {
		Session session = getSession();
		Query query=session.createQuery("FROM Users d where d.userId=?");
		query.setParameter(0, userId);
		UserDetail d=(UserDetail)query.uniqueResult();
		return d;
	}

	public boolean updateUsers(UserDetail users) {
		try
      	{
              Session session = getSession();
		session.update(users);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
	}

	public boolean deleteUsers(String userId) {
		try
      	{
              Session session = getSession();
		session.delete(userId);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
	}
	public boolean addShippingAddress(ShippingAddress shippingaddress) {
		try
      	{
              Session session = getSession();
		session.save(shippingaddress);
		session.flush();
		session.close();
		return true;
      	}
      	catch(HibernateException e)
      	{
      		return false;
      	}
	}

	public ShippingAddress getShippingAddressById(int id) {
		 Session session = getSession();
	        Query query=session.createQuery("FROM ShippingAddress s where s.ShippingAddressId=?");
	        Object shippingAddressId = null;
			query.setParameter(0, shippingAddressId);
	        ShippingAddress s=(ShippingAddress)query.uniqueResult();
	          return s;
	}

	public List<ShippingAddress> getShippingAddressByUserId(String userId) {
		Session session = getSession();
		Query query = session.createQuery("from ShippingAddress where user.userId=?");
		query.setParameter(0, userId);
		List<ShippingAddress> shipingAdresList = query.list();
	        return shipingAdresList;
	}

	
		
		public boolean checkUserId(String userId)
		{
			Session session= getSession();
			Query query=session.createQuery("from Users u where u.userId=?");
			query.setParameter(0, userId);
			UserDetail u=(UserDetail)query.uniqueResult();
			if(u==null)
			return true;
			else 
			return false;
	} 
}