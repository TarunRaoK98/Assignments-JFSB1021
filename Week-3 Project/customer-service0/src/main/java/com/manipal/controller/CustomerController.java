package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Customer;
import com.manipal.model.Telephone;
import com.manipal.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAll(){
		return new ResponseEntity<List<Customer>>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){
		return new ResponseEntity<Customer>(service.getCustomer(customerId), HttpStatus.OK);
	}
	
	@GetMapping("{customer}/telephone")
	public ResponseEntity<Telephone> getTelephone(@PathVariable int customerId){
		return new ResponseEntity<Telephone>(service.getTelephone(customerId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		service.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@DeleteMapping("{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int customerId){
		service.deleteCustomer(customerId);
		return new ResponseEntity<String>("Customer Id: "+customerId+" deleted.", HttpStatus.OK);
	}
}
