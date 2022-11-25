package com.ho.aug312crossdomainajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@Autowired
	private WeatherDAO wDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/weather.get", 
			method=RequestMethod.GET,
			produces = "application/xml; charset=utf-8")
	public @ResponseBody String weatherGet(Xy xy) {
		return wDAO.getWeather(xy);
	}
}
