package com.grocery.bean;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Category_Table")
public class CategoryBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Ct_Id")
	private int categoryId;
	
	@Column(name = "Ct_Name")
	private String name;
	
	@Column(name = "Ct_Types")
	private String types;
	
	@OneToMany(mappedBy = "category")
	private List<ProductBean> productList;

	
	
	
	
	public String getName() 
	{
	    return name; 
	}

	public void setName(String name) 
	{
	    this.name = name; 
	}
	
	public String getTypes() 
	{
	    return types; 
	}

	public void setTypes(String types) 
	{
	    this.types = types; 
	}

	

	

	
	


}
