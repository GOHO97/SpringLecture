package com.ho.aug082MyBatis;

import org.apache.ibatis.session.SqlSession;

import com.ho.db.manager.HoDBManager;

public class ConnectMain {
	public static void main(String[] args) {
		SqlSession ss = null;
			try {
				ss = HoDBManager.hi("aaa.xml");
				System.out.println("성공");
			} catch (Exception e) {
				e.printStackTrace();
			}
			ss.close();
		}
}
