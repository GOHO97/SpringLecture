package com.ho.aug104springdi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ho.aug104springdi.dog.Dog;

public class SDIMain3 {
	public static void main(String[] args) {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
		aac.registerShutdownHook();
		System.out.println("------");
		
		Dog ddd1 = aac.getBean("d1", Dog.class);
		aac.close();
	}
}
