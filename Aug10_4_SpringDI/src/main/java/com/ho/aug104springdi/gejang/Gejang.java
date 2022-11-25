package com.ho.aug104springdi.gejang;

import org.springframework.beans.factory.annotation.Autowired;

import com.ho.aug104springdi.kimsumi.Kimsumi;

public class Gejang {
	private String name;
	private int price;
	
	@Autowired
	private Kimsumi producer;
	
	public Gejang() {
		// TODO Auto-generated constructor stub
	}

	public Gejang(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(producer.getName());
		System.out.println(producer.getAge());
	}
}
