package com.slashcode.billing.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection="order_db")
public class Customer {

	@Id
	private int custId;
	private String custName;
	private List<Product> products;		//One Customer can buy Multiple Products
	private Address address;			//One Customer can have one Address
	
}
