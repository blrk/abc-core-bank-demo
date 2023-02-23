package com.axess.abccorebank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axess.abccorebank.entity.Customer;
import com.axess.abccorebank.repository.CustomerRepository;
import com.axess.abccorebank.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer createCustomer(Customer newCustomer) {
		
		Customer customer = this.customerRepo.save(newCustomer);
		
		
		return customer;
	}

	@Override
	public List<Customer> getAll() {
		return this.customerRepo.findAll();
	}
	
	
	

}

