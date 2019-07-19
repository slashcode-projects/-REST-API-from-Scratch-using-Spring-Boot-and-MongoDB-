package com.slashcode.billing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashcode.billing.dto.Customer;
import com.slashcode.billing.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerRepository repository;
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int custId) {
		// TODO Auto-generated method stub
		
		return repository.findById(custId);
	}

	@Override
	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		System.out.println();
		repository.save(cust);
	}

	@Override
	public void updateCustomer(Customer cust, int custId) {
		// TODO Auto-generated method stub
		repository.save(cust);
	}

	@Override
	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		repository.deleteById(custId);
	}

}
