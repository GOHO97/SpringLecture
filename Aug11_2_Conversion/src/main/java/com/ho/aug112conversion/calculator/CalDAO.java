package com.ho.aug112conversion.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalDAO {
	
	private ScriptEngine se;
	
	@Autowired
	private UnitData uD;
	
	public CalDAO() {
		ScriptEngineManager sem = new ScriptEngineManager();
		se = sem.getEngineByName("JavaScript");
	}
	
	public void calculation(InputInfo ii, HttpServletRequest req) throws ScriptException {
		
		String kind = ii.getKind();
		
		String sik = String.format(uD.getUnitData().get(kind).getFormula(), ii.getNumber());
		double ans = (Double) se.eval(sik);
		
		req.setAttribute("result", ans);
		req.setAttribute("fd", uD.getUnitData().get(kind));
	}
}
