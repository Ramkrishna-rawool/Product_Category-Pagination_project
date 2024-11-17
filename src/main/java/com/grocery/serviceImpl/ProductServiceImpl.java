package com.grocery.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.bean.CategoryBean;
import com.grocery.bean.ProductBean;
import com.grocery.dao.ProductDao;

import com.grocery.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao prdtdao;
	
	@Override
	public List<ProductBean> getListOfProduct() {
		
		return (List<ProductBean>) prdtdao.findAll();
	}

	@Override
	public void saveProductservice(ProductBean bean) {
		prdtdao.save(bean);
		
	}

	@Override
	public ProductBean updateProductservice(int id,ProductBean product) {
//		Optional<ProductBean> opbean = prdtdao.findById(id);
//		ProductBean bean =null;
//		if(opbean.isPresent())
//		{
//			bean = opbean.get();
//		}
//		else {
//			throw new RuntimeException("Invalid Product Id");
//		}
		ProductBean bean = prdtdao.findById(id).get();
		bean.setName(product.getName());
		bean.setPrice(product.getPrice());
		bean.setQuantity(product.getQuantity());

		return prdtdao.save(bean);
	}

	@Override
	public void deleteProductService(int id) {
		prdtdao.deleteById(id);
		
	}

	@Override
	public CategoryBean getCategoryByName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
