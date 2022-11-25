package com.ho.aug082MyBatis;

import java.math.BigDecimal;

public class Human {
	private String a_name;
	private BigDecimal a_age;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String a_name, BigDecimal a_age) {
		super();
		this.a_name = a_name;
		this.a_age = a_age;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public BigDecimal getA_age() {
		return a_age;
	}

	public void setA_age(BigDecimal a_age) {
		this.a_age = a_age;
	}
	
	
}
