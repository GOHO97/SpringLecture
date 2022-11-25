package com.ho.aug121bmi.input;


public class BmiInfo {
	private String img;
	private String name;
	private double height;
	private double weight;
	private double bmi;
	
	public BmiInfo() {
		// TODO Auto-generated constructor stub
	}

	public BmiInfo(String img, String name, double height, double weight, double bmi) {
		super();
		this.img = img;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	
}
