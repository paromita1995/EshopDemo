package com.niit.Eshop.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Eshop.dao.CartItemsDao;
import com.niit.Eshop.model.CartItems;

@Repository("CartItemsDao")
@Transactional
@SuppressWarnings("unchecked")
public class CartItemsDaoImpl implements CartItemsDao 
{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean addCartItems(CartItems cartitems) 
	{
		try
		{
		Session session = getSession();

		session.save(cartitems);

		session.flush();

		session.close();
		return true;
		}
		catch(HibernateException e)
		{
		return false;
		}

	}
  
	       public boolean updateCartItems(CartItems cartitems) 
	       {
	    	   try
	    	   {
		Session session = getSession();
		session.update(cartitems);
		session.flush();
		session.close();
		return false;
	    	   }
	    	   catch(HibernateException e)
	   		{
	   		return false;
	   		}
	       }	
		public List<CartItems> getAllCartItems() {
			Session session = getSession();
			Query query=session.createQuery("from CartItems");
			List<CartItems> list = query.list();
			session.close();
			return list;
			
			
		}

		public List<CartItems> getCartItemsByCartId(int cartId) {
			 Session session = getSession();
		        Query query=session.createQuery("FROM CartItems  where cart.cartId=? and status =true");
		        query.setParameter(0, cartId);
		        List<CartItems> cartItemList = query.list();
		        session.close();
		        return cartItemList;
		}

		
		public List<CartItems> getCartItemsByOrderId(int cid) {
			Session session = getSession();
			Query query=session.createQuery("FROM CartItems  where orderDetails.orderDetailsId=?");
			query.setParameter(0, cid);
			List<CartItems> e=query.list();
			session.close();
			return e;
		}

		public boolean deleteCartItems(int cartItemId) {
			try
			{
			Session session = getSession();
			session.delete(cartItemId);
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