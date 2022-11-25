package com.ho.aug121bmi.input;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class InputController {
	
	@Autowired
	private BmiDAO bDAO;
	
	@RequestMapping(value="/bmiCalculate", method=RequestMethod.POST)
	public String goOutput(HttpServletRequest req) {
		MultipartRequest mr = null;
		try {
			String path = req.getSession().getServletContext().getRealPath("resources/img");
			mr = new MultipartRequest(req, path, 10485760, "utf-8", new DefaultFileRenamePolicy());
			
			bDAO.imgCheck(mr, req);
			bDAO.obesityJudge(bDAO.bmiCalculate(mr, req), req);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "output";
	}
}
