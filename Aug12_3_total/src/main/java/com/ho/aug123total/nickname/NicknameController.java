package com.ho.aug123total.nickname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NicknameController {
	
	@Autowired
	private NicknameDAO nDAO;
	
	@RequestMapping(value = "/nickname.reg", method = RequestMethod.GET)
	public String nicknameReg(Nickname n) {
		nDAO.reg(n);
		return "index";
	}
}
