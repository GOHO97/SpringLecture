package com.ho.aug161classic;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ho.aug161classic.share.SWriteDAO;

@Controller
public class HomeController {
	
	@Autowired
	private SWriteDAO sDAO;
	
	private boolean isFirst;
	
	public HomeController() {
		isFirst = true;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		if(isFirst) {
			sDAO.sBoardCount();
			isFirst = false;
		}
		sDAO.sShow(1, req);
		return "index";
	}
	
}
