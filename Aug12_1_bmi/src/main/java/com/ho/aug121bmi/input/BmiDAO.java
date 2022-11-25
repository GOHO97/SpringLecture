package com.ho.aug121bmi.input;

import java.net.URLEncoder;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;

@Service
public class BmiDAO {
	@Autowired
	private Fomula f;
	
	@Autowired
	private Judge rj;

	
	private ScriptEngine se;
	
	
	public BmiDAO() {
		ScriptEngineManager sem = new ScriptEngineManager();
		se = sem.getEngineByName("JavaScript");
	}
	
	public void imgCheck(MultipartRequest mr, HttpServletRequest req) {
		try {
			String img = mr.getFilesystemName("img");
			img = URLEncoder.encode(img, "utf-8").replace("+", " ");
			req.setAttribute("img", img);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double bmiCalculate(MultipartRequest mr, HttpServletRequest req) throws ScriptException {
		double height = Double.parseDouble(mr.getParameter("height"));
		double weight = Double.parseDouble(mr.getParameter("weight"));
		String name = mr.getParameter("name"); 
		
		String fomula = f.getFomula().replace("height", height + "").replace("weight", weight + "");
		double bmi =(Double) se.eval(fomula); 
		
		req.setAttribute("bi",new BmiInfo(null, name, height, weight, bmi));
		
		
		return bmi;
	}
	
	public void obesityJudge(double bmi, HttpServletRequest req) {
		
		ArrayList<String> rj2 = rj.getResultJudge();
		
		String ss[] = null;
		for (String s : rj2) {
			ss = s.split(" ");
			if(bmi >= Double.parseDouble(ss[0])) {
				req.setAttribute("result", ss[1]);
			} else {
				break;
			}
		}
		
	}
}
