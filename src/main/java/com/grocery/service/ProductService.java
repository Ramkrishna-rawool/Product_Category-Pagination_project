package com.grocery.service;

import java.util.List;

import com.grocery.bean.CategoryBean;
import com.grocery.bean.ProductBean;

public interface ProductService {

	public List<ProductBean> getListOfProduct();
	public void saveProductservice(ProductBean bean);
	public ProductBean updateProductservice(int id,ProductBean productbean);
	public void deleteProductService(int id);
	
	
	
	public CategoryBean getCategoryByName(String categoryName);
	
}
