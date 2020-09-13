package com.manipal.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.manipal.model.Telephone;

//@FeignClient(name = "telephone-service", url = "localhost:8000")
//@FeignClient(name = "telephone-service", url = "localhost:8050")
@FeignClient(name = "telephone-service")
@RibbonClient(name = "telephone-service")
public interface TelephoneProxy {

	@GetMapping("/telephone/{telephoneId}")
	public Telephone getTelephone(@PathVariable int telephoneId);
	
	@PostMapping("/telephone")
	public Telephone addTelephone(@RequestBody Telephone telephone);
	
	@PutMapping("/telephone")
	public Telephone updateTelephone(@RequestBody Telephone telephone);
	
	@DeleteMapping("/telephone/{telephoneId}")
	public String deleteTelephone(@PathVariable int telephoneId);
}
