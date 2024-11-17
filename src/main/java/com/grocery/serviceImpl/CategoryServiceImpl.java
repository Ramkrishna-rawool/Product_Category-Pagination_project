package com.grocery.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grocery.bean.CategoryBean;
import com.grocery.dao.CategoryDao;


import com.grocery.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao ctgdao;
	
	
	
	
	
	@Override
	public List<CategoryBean> getListOfCategory()
	{
		return (List<CategoryBean>) ctgdao.findAll();
	}
	
	/*
	 * 
	 * @Override public Page<CategoryBean> getListOfCategory(Pageable pageable) {
	 * return ctgdao.findAll(pageable); }
	 * 
	 */
	  
	  
	
	 
	 
	 
	@Override
	public void saveCategoryservice(CategoryBean bean) {
		 System.out.println("Received CategoryBean: " + bean);
		    ctgdao.save(bean);
		    System.out.println("CategoryBean saved successfully");
		
	}

	/*
	 * @Override public CategoryBean updateCategoryservice(int id,CategoryBean
	 * ctgbean) { // Optional<CategoryBean> opbean = ctgdao.findById(id); //
	 * CategoryBean bean =null; // if(opbean.isPresent()) // { // bean
	 * =opbean.get(); // } // else { // throw new
	 * RuntimeException("Invalid Category Id"); // } // // return bean; CategoryBean
	 * bean = ctgdao.findById(id).get(); bean.setName(ctgbean.getName());
	 * bean.setTypes(ctgbean.getTypes());
	 * 
	 * return ctgdao.save(bean); }
	 */
	
	/*
	 * @Override public CategoryBean updateCategoryservice(int id, CategoryBean
	 * ctgbean) { Optional<CategoryBean> optionalCategory = ctgdao.findById(id); if
	 * (optionalCategory.isPresent()) { CategoryBean existingCategory =
	 * optionalCategory.get(); existingCategory.setName(ctgbean.getName());
	 * existingCategory.setTypes(ctgbean.getTypes());
	 * System.out.println("Received CategoryBean for update: " + ctgbean);
	 * 
	 * return ctgdao.save(existingCategory); } else { throw new
	 * RuntimeException("Category with id " + id + " not found"); } }
	 */
	
	
	
	
	@Override
	public CategoryBean updateCategoryservice(int id, CategoryBean ctgbean) {
	    Optional<CategoryBean> optionalCategory = ctgdao.findById(id);
	    if (optionalCategory.isPresent()) {
	        CategoryBean existingCategory = optionalCategory.get();
	        existingCategory.setName(ctgbean.getName());
	        existingCategory.setTypes(ctgbean.getTypes());
	        System.out.println("Received CategoryBean for update: " + ctgbean);

	        return ctgdao.save(existingCategory);
	    } else {
	        throw new RuntimeException("Category with id " + id + " not found");
	    }
	}


	
	
	@Override
	public void deleteCtegoryService(int id) {
		ctgdao.deleteById(id);
		
	}

	
	 @Override
	    public Page<CategoryBean> findAll(Pageable pageable) {
	        return ctgdao.findAll(pageable);
	    }

	
	
	
	



	

	
}