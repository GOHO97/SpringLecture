package com.ho.aug112conversion.calculator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalDAO cDAO; 
	
	@RequestMapping(value="/calculation", method=RequestMethod.GET)
	public String goOutput(InputInfo ii, HttpServletRequest req) {
		try {
			cDAO.calculation(ii, req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "output";
	}
}
