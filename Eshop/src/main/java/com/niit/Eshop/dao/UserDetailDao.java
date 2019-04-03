package com.niit.Eshop.dao;

import java.util.List;

import com.niit.Eshop.model.ShippingAddress;
import com.niit.Eshop.model.UserDetail;



public interface UserDetailDao {
	
	public boolean addUsers(UserDetail users);
	public List<UserDetail> getAllUsers();
	public UserDetail getUsersById(String userId);
	public boolean updateUsers(UserDetail users);
	public boolean deleteUsers(String userId);
	public boolean checkUserId(String userId);
	public boolean addShippingAddress(ShippingAddress shippingaddress);
	public ShippingAddress getShippingAddressById(int id);
	public List<ShippingAddress> getShippingAddressByUserId(String userId);
}
