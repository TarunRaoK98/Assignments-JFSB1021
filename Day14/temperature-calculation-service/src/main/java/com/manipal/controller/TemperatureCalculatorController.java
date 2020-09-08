package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.TemperatureCalculatorBean;
import com.manipal.proxy.TemperatureConversionProxy;

@RestController
public class TemperatureCalculatorController {
	
	@Autowired
	private TemperatureConversionProxy proxy;
	
	@GetMapping("temperature-calculator/from/{from}/to/{to}/units/{unit}")
	public TemperatureCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable double unit) {
		TemperatureCalculatorBean bean = proxy.retrieveCalculatedValue(from, to);
		System.out.println(bean);
		double totalUnits = unit * bean.getConversionCoefficient0() + bean.getConversionCoefficient1();
		return new TemperatureCalculatorBean(1L, from, to, bean.getConversionCoefficient0(), bean.getConversionCoefficient1(), unit, totalUnits);
	}

}
