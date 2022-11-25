package com.ho.aug105jmvc.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ho.aug105jmvc.calculate.CalculateDAO;


@Controller
public class HomeController {
	@Autowired
	private CalculateDAO cDAO;
	
	@RequestMapping(value="hahaha.do", method=RequestMethod.GET)
	public void hahaha() {
		System.out.println("ㅎㅎㅎ");
	}
	
	@RequestMapping(value="gogogo.go", method=RequestMethod.GET)
	public void gogogo() {
		System.out.println("ㄱㄱㄱ");
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String goHome() {
		System.out.println("고홈");
		// req.getRequestDispatcher("index.jsp").forward(req, res);
		return "index";
	}
	
	@RequestMapping(value="/xy.calculate", method=RequestMethod.POST)
	public String xyCalculate(HttpServletRequest req) {
		cDAO.calculate(req);
		return "index";
	}
}
