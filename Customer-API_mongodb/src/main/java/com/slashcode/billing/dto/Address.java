package com.slashcode.billing.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document
public class Address {

	private String city;
	private String district;
	private String state;
		
}
