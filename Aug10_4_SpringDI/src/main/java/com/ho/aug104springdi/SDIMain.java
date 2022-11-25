package com.ho.aug104springdi;

import com.ho.aug104springdi.dog.Dog;

public class SDIMain {
	public static void main(String[] args) {
		Dog d = new Dog("철수", 2);
		Dog d2 = new Dog("영수", 3);
		d.printInfo();
		d2.printInfo();
	}
}
