package com.slashcode.billing.service;

import java.util.List;
import java.util.Optional;

import com.slashcode.billing.dto.Customer;

public interface ICustomerService {

	List<Customer> getAllCustomer();

	Optional<Customer> getCustomerById(int custId);

	void addCustomer(Customer cust);

	void updateCustomer(Customer cust, int custId);

	void deleteCustomer(int custId);

}
