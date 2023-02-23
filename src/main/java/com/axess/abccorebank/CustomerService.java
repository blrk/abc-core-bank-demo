package com.axess.abccorebank.service;

import java.util.List;

import com.axess.abccorebank.entity.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer newCustomer);
	
	List<Customer> getAll();

}

