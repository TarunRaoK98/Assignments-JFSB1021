package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.TemperatureCalculatorBean;

@FeignClient(name = "temperature-conversion-service", url = "localhost:8050")
public interface TemperatureConversionProxy {

	@GetMapping("temperature-conversion/from/{from}/to/{to}")
	public TemperatureCalculatorBean retrieveCalculatedValue(@PathVariable String from, @PathVariable String to);

}
