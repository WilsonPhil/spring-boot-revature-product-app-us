package com.revature.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name = "revatureproducts")
@Component
public class Product {
	@Id
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	public int getProductId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
