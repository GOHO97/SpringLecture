package com.ho.aug104springdi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ho.aug104springdi.human.Human;

public class SDIMain5 {
	public static void main(String[] args) {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans2.xml");
		aac.registerShutdownHook();
		
		Human h1 = aac.getBean("human1", Human.class);
		System.out.println(h1.getAge()); 
		System.out.println(h1.getName());
		System.out.println(h1.getPet().getName());
		System.out.println(h1.getPet().getAge());
		
		for (String s : h1.getNicknames()) {
			System.out.println(s);
		} 
		
		System.out.println(h1.getStat().get("HP"));
		System.out.println(h1.getStat().get("MP"));
		
		Human h2 = aac.getBean("human2", Human.class);
		
		
	}
}
