package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telephone")
public class Telephone {
	
	@Id
	@Column(name = "telephone_id")
	private int telephoneId;
	@Column(name = "telephone_number")
	private String telephoneNumber;
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	public Telephone() {}
	
	public Telephone(int telephoneId, String telephoneNumber, String mobileNumber) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
	}


	public int getTelephoneId() {
		return telephoneId;
	}
	
	public void setTelephoneId(int telephoneId) {
		this.telephoneId = telephoneId;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + "]";
	}
}
