package com.axess.abccorebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axess.abccorebank.config.ApiSuccessResponse;
import com.axess.abccorebank.entity.Customer;
import com.axess.abccorebank.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/customer")
@ApiOperation(value="customer")
@ApiModel(value = "customer", description = "APIs related to customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ApiSuccessResponse response;
	
	@PostMapping("/create")
	@ApiOperation(value = "create-customer", notes = "Create new customer in the system.")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer newCustomer) {
		
		Customer customer = this.customerService.createCustomer(newCustomer);
		
		response.setMessage("Customer created");
		response.setBody(customer);
		response.setSuccess(true);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		
		
	}
	
	
	@GetMapping("/")
	@ApiOperation(value = "list-customer", notes="fetch all customers")
	public ResponseEntity<?> sgetCustomers() {
		
		List<Customer> customers = this.customerService.getAll();
		
		response.setMessage("Customers found - "+ customers.size());
		response.setBody(customers);
		response.setSuccess(true);
		
		return ResponseEntity.status(HttpStatus.FOUND).body(response);
		
		
	}

}

