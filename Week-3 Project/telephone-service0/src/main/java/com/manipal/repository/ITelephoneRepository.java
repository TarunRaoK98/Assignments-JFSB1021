package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Telephone;

@Repository
public interface ITelephoneRepository extends JpaRepository<Telephone, Integer>{
	
}
