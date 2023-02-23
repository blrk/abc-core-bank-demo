package com.axess.abccorebank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axess.abccorebank.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

