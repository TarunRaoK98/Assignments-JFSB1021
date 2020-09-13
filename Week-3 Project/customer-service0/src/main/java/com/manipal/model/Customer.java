package com.manipal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "customer_first_name")
	private String customerFirstName;
	@Column(name = "customer_last_name")
	private String customerLastName;
	@Column(name = "customer_date_of_birth")
	private LocalDate customerDateOfBirth;
	@Transient
	private Telephone customerTelephone;
	@Column(name = "customer_email")
	private String customerEmail;
	
	public Customer() {}

	public Customer(int customerId, String customerFirstName, String customerLastName, LocalDate customerDateOfBirth,
			String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerEmail = customerEmail;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public LocalDate getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}

	public void setCustomerDateOfBirth(LocalDate customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}

	public Telephone getCustomerTelephone() {
		return customerTelephone;
	}

	public void setCustomerTelephone(Telephone customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerDateOfBirth=" + customerDateOfBirth + ", customerTelephone="
				+ customerTelephone + ", customerEmail=" + customerEmail + "]";
	}
	
}
