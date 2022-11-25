package com.ho.aug29ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Autowired
	private AbcdefuDAO aDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		aDAO.showTable(req);
		return "index2";
	}
	
	@RequestMapping(value = "/songs.get.xml", method = RequestMethod.GET,
			produces = "application/xml; charset=utf-8")
	public @ResponseBody Songs songsGetXML(HttpServletRequest req) {
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		Songs songs = aDAO.getXML(req);
		return songs; //songs 객체를 응답
	}
	
	@RequestMapping(value = "/songs2.get.json", method = RequestMethod.GET,
			produces = "application/json; charset=utf-8")
	public @ResponseBody Songs2 songsGetJSON(HttpServletRequest req,
			@RequestParam(value="page") int page, HttpServletResponse res) {
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 2번째 파라메터는 허용 ip를 지정해 주는 것인데 *로 하면 전부 허용한다는 뜻이다.
		Songs2 songs2 = aDAO.getJSON(req, page);
		return songs2;
	}
	
	
	
}
