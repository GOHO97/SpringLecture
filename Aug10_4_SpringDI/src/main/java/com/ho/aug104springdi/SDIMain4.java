package com.ho.aug104springdi;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ho.aug104springdi.date.Date;

public class SDIMain4 {
	public static void main(String[] args) {
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions("beans.xml");
		
		Date now = new Date();
		SimpleDateFormat sdf = dlbf.getBean("sdf", SimpleDateFormat.class);
		String result = sdf.format(now);
		System.out.println(result);
	}
}
