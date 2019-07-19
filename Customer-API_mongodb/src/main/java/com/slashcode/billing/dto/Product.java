package com.slashcode.billing.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Product {

	private String productName;
	private int productPrice;
	private int productQunatity;
		
}
