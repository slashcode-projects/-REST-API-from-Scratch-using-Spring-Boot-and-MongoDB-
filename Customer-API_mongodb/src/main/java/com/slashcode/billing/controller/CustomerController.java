package com.slashcode.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slashcode.billing.service.ICustomerService;
import com.slashcode.billing.dto.Customer;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService serviceRef;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomer(){
		return serviceRef.getAllCustomer();
	}
	
	@RequestMapping("/customers/{custId}")
	public Optional<Customer> getCustomerById(@PathVariable int custId) {
		return serviceRef.getCustomerById(custId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody Customer cust) {
		serviceRef.addCustomer(cust);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{custId}")
	public void updateCustomer(@RequestBody Customer cust, @PathVariable int custId) {
		serviceRef.updateCustomer(cust,custId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{custId}")
	public void deleteCustomer(@PathVariable int custId) {
		serviceRef.deleteCustomer(custId);
	}
	
}
