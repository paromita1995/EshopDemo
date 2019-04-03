package com.niit.Eshop.dao;

import java.util.List;

import com.niit.Eshop.model.Category;


public interface CategoryDao {
	public List<Category> getAllCategory();
    public boolean updateCategory(Category category);
    public Category deleteCategoryById(int id);
	public Category getCategoryById(int id);
	public boolean addCategory(Category category);
   
}
