package com.niit.Eshop.dao;

import java.util.List;

import com.niit.Eshop.model.OrderDetails;
import com.niit.Eshop.model.UserDetail;

public interface OrderDetailsDao {
	
	public OrderDetails getOrderDetailsByOrderDetailsId(int orderDetails);
	public boolean updateOrderDetails(OrderDetails orderDetails);
	public boolean deleteOrderDetails(OrderDetails orderDetails);
	public boolean insertOrderDetails(OrderDetails orderDetails);
	public List<OrderDetails> getOrderDetailsListByUser (UserDetail user);
}

