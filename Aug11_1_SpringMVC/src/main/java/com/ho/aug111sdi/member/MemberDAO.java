package com.ho.aug111sdi.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class MemberDAO {
	
	public void join(Member m, HttpServletRequest req) {
		System.out.println(m.getId());
		System.out.println(m.getPw());
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		req.setAttribute("r", "가입성공");
	}
	
}
