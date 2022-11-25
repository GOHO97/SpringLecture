package com.ho.aug111sdi.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/result", method=RequestMethod.POST)
	public String result(Member m, HttpServletRequest req) {
		mDAO.join(m, req);
		return "result";
	}
}
