package com.niit.Eshop.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Eshop.dao.OrderDetailsDao;
import com.niit.Eshop.model.OrderDetails;
import com.niit.Eshop.model.UserDetail;

@Repository("OrderDetailsDao")
@Transactional
@SuppressWarnings("unchecked")
public class OrderDetailsDaoImpl implements OrderDetailsDao 
{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}  
        public boolean updateOrderDetails(OrderDetails orderDetails)
        
         {
        	try
        	{
                Session session = getSession();
		session.update(orderDetails);
		session.flush();
		session.close();
		return true;
        	}
        	catch(HibernateException e)
        	{
        		return false;
        	}
         } 
        public boolean deleteOrderDetails(OrderDetails orderDetails)
        {
        	try
        {
         Session session = getSession();
		
		session.delete(orderDetails);
		session.flush();
		session.close();
		return true;
    	}
    	catch(HibernateException e)
    	{
    		return false;
    	}
     } 
	

        public boolean insertOrderDetails(OrderDetails orderDetails)
        {
        	try
        {
         Session session = getSession();

		session.save(orderDetails);

		session.flush();

		session.close();
		return true;
    	}
    	catch(HibernateException e)
    	{
    		return false;
    	}
      

         } 

		public List<OrderDetails> getOrderDetailsListByUser(UserDetail user) {
			Session session = getSession();
			Query query=session.createQuery("FROM OrderDetails q where q.user.userId=?");
			query.setParameter(0, user.getUserId());
			List<OrderDetails> q=query.list();
			return q;
		}

		public OrderDetails getOrderDetailsByOrderDetailsId(int orderDetails) {
			Session session = getSession();
			Query query=session.createQuery("FROM OrderDetails q where q.OrderDetailsId=?");
			query.setParameter(0, orderDetails);
			OrderDetails q=(OrderDetails)query.uniqueResult();
			return q;
		}
} 
		