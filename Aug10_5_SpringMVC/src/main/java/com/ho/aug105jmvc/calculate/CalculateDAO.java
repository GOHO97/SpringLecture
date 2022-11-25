package com.ho.aug105jmvc.calculate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // servlet-context.xml에 자동등록
public class CalculateDAO {
	
	@Autowired
	private String f;
	
	public void calculate(HttpServletRequest req) {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		
		int z = x+y;
		double zz = z / 2.0;
		
		String result = String.format(f, zz);
		req.setAttribute("r", result);
		
	}
}
