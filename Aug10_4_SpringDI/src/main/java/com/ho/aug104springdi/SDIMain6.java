package com.ho.aug104springdi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ho.aug104springdi.gejang.Gejang;

public class SDIMain6 {
	public static void main(String[] args) {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans3.xml");
		Gejang g1 = aac.getBean("g2", Gejang.class);
		g1.printInfo();
	}
}
