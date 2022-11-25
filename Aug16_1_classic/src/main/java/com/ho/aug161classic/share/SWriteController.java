package com.ho.aug161classic.share;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ho.aug161classic.SearchOption;

@Controller
public class SWriteController {
	
	@Autowired
	private SWriteDAO sDAO;
	
	@RequestMapping(value="/share.write", method= RequestMethod.GET)
	public String swriteGo(HttpServletRequest req) {
		TokenGenerator.generate(req);
		return "sWrite";
	}
	
	@RequestMapping(value="/share.write.complete", method= RequestMethod.POST)
	public String swrite(SWriteData sd, HttpServletRequest req, @RequestParam(value="page") int p) {
		sDAO.sWrite(sd, req);
		sDAO.sShow(p, req);
		return "index";
	}
	
	@RequestMapping(value="/share.search", method=RequestMethod.GET)
	public String sSearchBoard(SearchOption so, HttpServletRequest req, @RequestParam(value="page") int p) {
		sDAO.search(req);
		sDAO.sShow(p, req);
		return "index";
	}
	
}
