package com.grocery.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grocery.bean.CategoryBean;
import com.grocery.bean.ProductBean;
@Repository
public interface ProductDao extends CrudRepository<ProductBean, Integer>{
    List<ProductBean> findByCategory(CategoryBean category);

}
