package com.grocery.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Table")
public class ProductBean 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Pr_Id")
	private int productId;
	
	@Column(name = "Pr_Name")
	private String name;
	
	@Column(name = "Pr_Quantity")
	private String quantity;
	
	@Column(name = "Pr_Price")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "Ct_Id") // Assuming category_id is the foreign key column in Product table
	private CategoryBean category;

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public CategoryBean getCategory() {
		return category;
	}

	
	
	public void setCategory(CategoryBean category) {
		this.category = category;
	}


	//private String quantity;

		 // private String quatity() { // TODO Auto-generated method stub return quatity;

	 
	
	
	}
	
	

