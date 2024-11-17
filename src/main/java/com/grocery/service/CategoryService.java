package com.grocery.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.grocery.bean.CategoryBean;

public interface CategoryService {


	public List<CategoryBean> getListOfCategory();
	public void saveCategoryservice(CategoryBean Bean);
	public CategoryBean updateCategoryservice(int id,CategoryBean bean);
	public void deleteCtegoryService(int id);
	public Page<CategoryBean> findAll(Pageable pageable);
	
	
	
	 
  
//public Page<CategoryBean> getListOfCategory(Pageable pageable);
	
	//public Page<CategoryBean> getcategory(int pageNo, int pageSize);
	//Page<CategoryBean> getListOfCategory(Pageable pageable);
	//public Page<CategoryBean> findAll(Pageable pageable);
	//public Page<CategoryBean> findAll(Pageable pageable);


    
    
}