package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.bean.CategoryBean;
import com.grocery.service.CategoryService;


@RestController
@RequestMapping("api/category")
public class CategoryController
{

    @Autowired
    private CategoryService ctgser;

	
	
	/*
	 * @GetMapping("/categorylist") public Page<CategoryBean>
	 * getListOfCategory(Pageable pageable) { return
	 * ctgser.getListOfCategory(pageable); }
	 */
	 
    
    
    @GetMapping ("/listPageable")
    Page<CategoryBean> catPageable(Pageable pageable)
    {
        return ctgser.findAll(pageable);
    }
   
    
    
    @GetMapping("/categorylist")
	public List<CategoryBean> getListOfCategory() 
	{
		return ctgser.getListOfCategory();
	}
    
    
    
	  /* @GetMapping("/allcategories") public ResponseEntity<List<CategoryBean>>
	  getAllCategories() { List<CategoryBean> categories =
	  ctgser.getListOfCategory(); if (categories.isEmpty())
	  {return new
	 ResponseEntity<>(HttpStatus.NO_CONTENT); } return new
	 ResponseEntity<>(categories, HttpStatus.OK); }*/
	 

    @PostMapping("/categorysave")
    public ResponseEntity<String> saveCategoryContoller(@RequestBody CategoryBean categorybean)
    {
        ctgser.saveCategoryservice(categorybean);
        return new ResponseEntity<>("Add Successfully", HttpStatus.CREATED);
    }

    @PutMapping("/categoryupdate/{categoryId}")
    public ResponseEntity<String> updateCategoryContoller(@PathVariable("categoryId") int categoryId, @RequestBody CategoryBean bean)
    {
        ctgser.updateCategoryservice(categoryId, bean);
        return new ResponseEntity<>("Update Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/categorydelete/{categoryId}")
    public ResponseEntity<String> deleteCategoryContoller(@PathVariable("categoryId") int categoryId)
    {
        ctgser.deleteCtegoryService(categoryId);
        return new ResponseEntity<>("Delete Successfully", HttpStatus.OK);
    }
}