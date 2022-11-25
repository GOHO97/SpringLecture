package com.ho.aug112conversion.calculator;


public class InputInfo {
	private double number;
	private String kind;
	
	public InputInfo() {
		// TODO Auto-generated constructor stub
	}

	public InputInfo(double number, String kind) {
		super();
		this.number = number;
		this.kind = kind;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
}
