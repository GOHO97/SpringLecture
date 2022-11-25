package com.ho.aug29ajax;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Abcdefu {
	private BigDecimal a_no;
	private String a_a;
	
	public Abcdefu() {
		// TODO Auto-generated constructor stub
	}

	public Abcdefu(BigDecimal a_no, String a_a) {
		super();
		this.a_no = a_no;
		this.a_a = a_a;
	}

	public BigDecimal getA_no() {
		return a_no;
	}
	
	@XmlElement
	public void setA_no(BigDecimal a_no) {
		this.a_no = a_no;
	}

	public String getA_a() {
		return a_a;
	}
	
	@XmlElement
	public void setA_a(String a_a) {
		this.a_a = a_a;
	}
	
}
