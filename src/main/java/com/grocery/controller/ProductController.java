package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.bean.CategoryBean;
import com.grocery.bean.ProductBean;
import com.grocery.service.ProductService;

@RestController
@RequestMapping("/api/Product")
public class ProductController {

	@Autowired
	private ProductService pdtser;

	@GetMapping("/productlist")
	public List<ProductBean> getListOfProduct() {
		
		return pdtser.getListOfProduct();
	}

	@PostMapping("/productsave")
	public String saveProduct(@RequestBody ProductBean productbean) {
	    // Get the category name from the ProductBean
	    //String categoryName = productbean.getCategory().getName();
	    
	    // Call a method to fetch the category object based on the category name
	    //CategoryBean category = getCategoryByName(categoryName); // Implement this method
	    
	    // Set the fetched category object to the ProductBean
	   // productbean.setCategory(category);
	    
	    // Save the product with the updated ProductBean
	    pdtser.saveProductservice(productbean);
	    
	    return "Add Successfully";
	}


	private CategoryBean getCategoryByName(String categoryName) {
	    // Implement logic to fetch category by name from your service or repository
	    CategoryBean category = pdtser.getCategoryByName(categoryName);
	    return category;
	}

	@PutMapping("/productupdate/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,@RequestBody ProductBean bean) {
		pdtser.updateProductservice(productId,bean);
		return "update Successfully";
	}

	@DeleteMapping("/productdelete/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId) {
		pdtser.deleteProductService(productId);
		return "Delete Successfully";
	}
	
//	{
//
//		"name":"oil 1kg",
//		"quatity":"3",
//		"price":"600"
//
//		 }
	
}
