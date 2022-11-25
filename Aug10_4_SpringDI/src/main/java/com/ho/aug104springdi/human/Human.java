package com.ho.aug104springdi.human;

import java.util.ArrayList;
import java.util.HashMap;

import com.ho.aug104springdi.dog.Dog;

public class Human {
	//사실상 기본형급
	private String name;
	private int age;
	//Has a
	private Dog pet;
	//컬렉션
	private ArrayList<String> nicknames;
	private HashMap<String, Double> stat;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, Dog pet, ArrayList<String> nicknames, HashMap<String, Double> stat) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
		this.nicknames = nicknames;
		this.stat = stat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog getPet() {
		return pet;
	}

	public void setPet(Dog pet) {
		this.pet = pet;
	}

	public ArrayList<String> getNicknames() {
		return nicknames;
	}

	public void setNicknames(ArrayList<String> nicknames) {
		this.nicknames = nicknames;
	}

	public HashMap<String, Double> getStat() {
		return stat;
	}

	public void setStat(HashMap<String, Double> stat) {
		this.stat = stat;
	}
	
}
