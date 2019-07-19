package com.slashcode.billing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.slashcode.billing.dto.Customer;

@Repository
public interface ICustomerRepository extends MongoRepository<Customer, Integer> {

}
