package com.ho.aug102javaboss;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ho.avengers.Avengers;

public class AMian {
	public static void main(String[] args) {
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions("zc.xml");
		
		Avengers a = dlbf.getBean("a", Avengers.class);
		a.attack();
	}
}
