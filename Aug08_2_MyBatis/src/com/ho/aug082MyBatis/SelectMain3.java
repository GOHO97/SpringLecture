package com.ho.aug082MyBatis;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.ho.db.manager.HoDBManager;

public class SelectMain3 {
	public static void main(String[] args) {
		SqlSession ss = null;
		try {
			ss = HoDBManager.hi("aaa.xml");
			
			Scanner k = new Scanner(System.in);
			System.out.print("몇 번까지: ");
			int n = k.nextInt();
			//int/double -> BigDecimal
			BigDecimal bd = new BigDecimal(n);
			//BigDecimal -> int/double
//			int i = bd.intValue();
			
			Human h = new Human(null, bd); 
			List<Human> humans = ss.selectList("humanMapper.getHumanByNo", h);
			for (Human h2 : humans) {
				System.out.println(h2.getA_name());
				System.out.println(h2.getA_age());
			}
			k.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ss.close();
	}
}
