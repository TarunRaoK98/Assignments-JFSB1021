package com.manipal.model;


public class ConversionRatio {
	
	private long id;
	private String from;
	private String to;
	private double conversionCoefficient0;
	private double conversionCoefficient1;
	
	public ConversionRatio(long id, String from, String to) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.getConversionCoefficients();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void getConversionCoefficients() {
		
		if(from.equals("Celsius") && to.equals("Fahrenheit")) {
			conversionCoefficient0 = 9.0/5.0;
			conversionCoefficient1 = 32;
		}
		else if (from.equals("Fahrenheit") && to.equals("Celsius")) {
			conversionCoefficient0 = 5.0/9.0;
			conversionCoefficient1 = -32.0*5.0/9.0;
		}
	}

	public double getConversionCoefficient0() {
		this.getConversionCoefficients();
		return conversionCoefficient0;
	}

	public void setConversionCoefficient0(double conversionCoefficient0) {
		this.conversionCoefficient0 = conversionCoefficient0;
	}

	public double getConversionCoefficient1() {
		this.getConversionCoefficients();
		return conversionCoefficient1;
	}

	public void setConversionCoefficient1(double conversionCoefficient1) {
		this.conversionCoefficient1 = conversionCoefficient1;
	}

	@Override
	public String toString() {
		return "ConversionRatio [id=" + id + ", from=" + from + ", to=" + to + ", conversionCoefficient0="
				+ conversionCoefficient0 + ", conversionCoefficient1=" + conversionCoefficient1 + "]";
	}

}
