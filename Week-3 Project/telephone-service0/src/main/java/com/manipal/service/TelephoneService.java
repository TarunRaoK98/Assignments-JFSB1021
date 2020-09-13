package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Telephone;
import com.manipal.repository.ITelephoneRepository;

@Service
public class TelephoneService {
	
	@Autowired
	private ITelephoneRepository repository;
	
	public Telephone getTelephone(int telephoneId) {
		return repository.findById(telephoneId).orElse(null);
	}
	
	public List<Telephone> getAll(){
		return repository.findAll();
	}
	
	public Telephone addTelephone(Telephone telephone) {
		return repository.save(telephone);
	}
	
	public void updateTelephone(Telephone telephone) {
		Telephone telephoneObject = this.getTelephone(telephone.getTelephoneId());
		telephoneObject.setTelephoneNumber(telephone.getTelephoneNumber());
		telephoneObject.setMobileNumber(telephone.getMobileNumber());
		repository.save(telephoneObject);
	}
	
	public void deleteTelephone(int telephoneId) {
		if(repository.existsById(telephoneId))
			repository.deleteById(telephoneId);
	}
	
}
