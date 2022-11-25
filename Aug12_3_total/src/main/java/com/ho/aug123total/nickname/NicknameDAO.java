package com.ho.aug123total.nickname;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NicknameDAO {

	@Autowired
	private SqlSession ss;
	// MyBatis 때 쓰던 거랑 차이
	// comit 자동
	// close 자동
	
	public void reg(Nickname n) {
		// MyBatis : .xml에 있는거 직접 (ss.insert("a.b"))
		// SMB : .xml랑 짝인 interface를 통해서
		
		try {
			if(ss.getMapper(NicknameMapper.class).regNickname(n) == 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패");
		}
	}
	
	
}
