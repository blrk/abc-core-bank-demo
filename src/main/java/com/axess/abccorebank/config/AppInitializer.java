package com.axess.abccorebank.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.axess.abccorebank.entity.Customer;
import com.axess.abccorebank.repository.CustomerRepository;

@Configuration
public class AppInitializer implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public void run(String... args) throws Exception {
		
		this.customerRepo.saveAll(this.loadCustomerData());
	}
	
	
	private List<Customer> loadCustomerData() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Matthew Willis");
		customer1.setCreditScore(850);
		customer1.setGender("M");
		customer1.setAge(54);
		customers.add(customer1);
		
		customer1 = new Customer();
		customer1.setId(2);
		customer1.setName("Gillie Roberts");
		customer1.setCreditScore(853);
		customer1.setGender("F");
		customer1.setAge(51);
		customers.add(customer1);
		
		
		customer1 = new Customer();
		customer1.setId(3);
		customer1.setName("Ramesh Singh");
		customer1.setCreditScore(827);
		customer1.setGender("M");
		customer1.setAge(56);
		customers.add(customer1);
		
		return customers;
		
	}
	
	
	

}

