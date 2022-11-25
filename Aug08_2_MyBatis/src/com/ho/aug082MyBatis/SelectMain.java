package com.ho.aug082MyBatis;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ho.db.manager.HoDBManager;

public class SelectMain {
	public static void main(String[] args) {
		SqlSession ss = null;
		try {
			ss = HoDBManager.hi("aaa.xml");
			List<Human> humans = ss.selectList("humanMapper.getAllHuman");
			
			for (Human h : humans) {
				System.out.println(h.getA_name());
				System.out.println(h.getA_age());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ss.close();
	}
}
