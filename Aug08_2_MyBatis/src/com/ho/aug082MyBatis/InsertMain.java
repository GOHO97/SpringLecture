package com.ho.aug082MyBatis;

import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.ho.db.manager.HoDBManager;

public class InsertMain {
	public static void main(String[] args) {
		SqlSession ss = null;
		try {
			ss = HoDBManager.hi("aaa.xml");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			BigDecimal age = sc.nextBigDecimal();
			Human h = new Human(name, age);
			
			if(ss.insert("humanMapper.regHuman", h) == 1) {
				System.out.println("성공");
				ss.commit();
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ss.close();
	}
}
