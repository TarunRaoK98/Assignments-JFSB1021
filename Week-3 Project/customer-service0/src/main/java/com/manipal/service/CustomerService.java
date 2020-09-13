package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Customer;
import com.manipal.model.Telephone;
import com.manipal.proxy.TelephoneProxy;
import com.manipal.repository.ICustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private ICustomerRepository repository;
	@Autowired
	private TelephoneProxy proxy;
	
	public List<Customer> getAll(){
		List<Customer> customerList = repository.findAll();
		for(Customer customer : customerList)
			customer.setCustomerTelephone(proxy.getTelephone(customer.getCustomerId()));
		return customerList;
	}
	
	public Customer getCustomer(int customerId) {
		Customer customer = repository.findById(customerId).orElseThrow(null);
		customer.setCustomerTelephone(proxy.getTelephone(customer.getCustomerId()));
		return customer;
	}
	
	public Customer addCustomer(Customer customer) {
		Customer customerObject = repository.save(customer);
		Telephone telephone = customer.getCustomerTelephone();
		telephone.setTelephoneId(customerObject.getCustomerId());
		customerObject.setCustomerTelephone(proxy.addTelephone(telephone));
		return customerObject;
	}
	
	public void updateCustomer(Customer customer) {
		Customer customerObject = this.getCustomer(customer.getCustomerId());
		customerObject.setCustomerFirstName(customer.getCustomerFirstName());
		customerObject.setCustomerLastName(customer.getCustomerLastName());
		customerObject.setCustomerDateOfBirth(customer.getCustomerDateOfBirth());
		Telephone telephone = customer.getCustomerTelephone();
		telephone.setTelephoneId(customerObject.getCustomerId());
		customerObject.setCustomerTelephone(proxy.updateTelephone(telephone));
		repository.save(customerObject);
	}
	
	public void deleteCustomer(int customerId) {
		repository.deleteById(customerId);
		proxy.deleteTelephone(customerId);
	}

	public Telephone getTelephone(int customerId) {
		return proxy.getTelephone(customerId);
	}
}
