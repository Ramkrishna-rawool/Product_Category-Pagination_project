package com.grocery.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grocery.bean.CategoryBean;
@Repository
public interface CategoryDao extends JpaRepository<CategoryBean, Integer>
{

    //List<CategoryBean> findAllBCategoryBeans(String name, Pageable pageable);
    
    //Page<CategoryBean> findAll(Pageable pageable);

	
}
