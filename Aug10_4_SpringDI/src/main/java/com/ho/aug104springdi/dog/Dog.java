package com.ho.aug104springdi.dog;

public class Dog {
	private String name;
	private int age;
	
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자");
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("오버로딩된 생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("셋네임");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("셋에이지");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
