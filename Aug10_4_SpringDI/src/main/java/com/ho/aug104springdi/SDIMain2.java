package com.ho.aug104springdi;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ho.aug104springdi.dog.Dog;

public class SDIMain2 {
	public static void main(String[] args) {
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions("beans.xml");
		System.out.println("-----");
		
		Dog dd1 = dlbf.getBean("d1", Dog.class);
	//	1] beans.xml에 등록해놓은 d1 정보를 토대로 객체 생성
	//	2] beans.xml에 d1이라고 객체 만들어놨으니 불러와라
		
	//	처음 불러올 때만 실제로 만들어짐.
	}
}
