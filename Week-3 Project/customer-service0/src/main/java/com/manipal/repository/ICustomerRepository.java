package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
