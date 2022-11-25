package com.ho.aug082MyBatis;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.ho.db.manager.HoDBManager;

public class SelectMain2 {
	public static void main(String[] args) {
		SqlSession ss = null;
		try {
			ss = HoDBManager.hi("aaa.xml");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("종류 (나이 or 이름) : ");
			String field = sc.next();
			
			
			if(field.equals("나이")) {
				System.out.print("값 : ");
				BigDecimal value = sc.nextBigDecimal();
				Human h = new Human(null, value);
				List<Human> humans = ss.selectList("humanMapper.getHumanName", h);
				for (Human h2 : humans) {
					System.out.println(h2.getA_name());
				}
			} else if(field.equals("이름")) {
				System.out.print("값 : ");
				String value = sc.next();
				Human h = new Human(value, null);
				List<Human> humans = ss.selectList("humanMapper.getHumanAge", h);
				for (Human h2 : humans) {
					System.out.println(h2.getA_name());
					System.out.println(h2.getA_age());
				}
			} else {
				System.out.println("종류에 나이 혹은 이름만 입력하세요");
				main(null);
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("입력한 값에 해당하는 데이터가 없습니다.");
		}
		ss.close();
	}
}
