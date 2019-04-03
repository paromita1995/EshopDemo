package com.niit.Eshop.dao;


import java.util.List;

import com.niit.Eshop.model.CartItems;

public interface CartItemsDao {
	public boolean addCartItems(CartItems cartItems);
	public List<CartItems> getAllCartItems();
	public boolean updateCartItems(CartItems cartItems);
	public List<CartItems> getCartItemsByCartId(int cartId);
	public boolean deleteCartItems(int cartItemId);
	public List<CartItems> getCartItemsByOrderId(int cid);

}
