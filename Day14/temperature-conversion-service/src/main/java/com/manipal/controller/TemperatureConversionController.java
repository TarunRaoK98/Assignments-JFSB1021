package com.manipal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.ConversionRatio;

@RestController
public class TemperatureConversionController {

	@GetMapping("temperature-conversion/from/{from}/to/{to}")
	public ConversionRatio getConversionRatio(@PathVariable String from, @PathVariable String to) {
		return new ConversionRatio(1L, from, to);
		
	}
}
