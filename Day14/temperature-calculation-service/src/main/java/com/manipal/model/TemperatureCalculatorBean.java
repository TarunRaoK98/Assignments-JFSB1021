package com.manipal.model;

public class TemperatureCalculatorBean {
	
	private long id;
	private String from;
	private String to;
	private double conversionCoefficient0;
	private double conversionCoefficient1;
	private double unit;
	private double totalUnits;
	
	public TemperatureCalculatorBean() {}
	
	public TemperatureCalculatorBean(long id, String from, String to, double conversionCoefficient0, double conversionCoefficient1, double unit,
			double totalUnits) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionCoefficient0 = conversionCoefficient0;
		this.conversionCoefficient1 = conversionCoefficient1;
		this.unit = unit;
		this.totalUnits = totalUnits;
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

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	public double getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}

	@Override
	public String toString() {
		return "TemperatureCalculatorBean [id=" + id + ", from=" + from + ", to=" + to + ", conversionCoefficient0="
				+ conversionCoefficient0 + ", conversionCoefficient1=" + conversionCoefficient1 + ", unit=" + unit
				+ ", totalUnits=" + totalUnits + "]";
	}

	public double getConversionCoefficient0() {
		return conversionCoefficient0;
	}

	public void setConversionCoefficient0(double conversionCoefficient0) {
		this.conversionCoefficient0 = conversionCoefficient0;
	}

	public double getConversionCoefficient1() {
		return conversionCoefficient1;
	}

	public void setConversionCoefficient1(double conversionCoefficient1) {
		this.conversionCoefficient1 = conversionCoefficient1;
	}
}
