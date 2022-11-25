package com.ho.aug112conversion.calculator;

import java.util.HashMap;


public class UnitData {
	
	private HashMap<String, FormulaData> unitData;
	
	public UnitData() {
		// TODO Auto-generated constructor stub
	}

	public UnitData(HashMap<String, FormulaData> unitData) {
		super();
		this.unitData = unitData;
	}

	public HashMap<String, FormulaData> getUnitData() {
		return unitData;
	}

	public void setUnitData(HashMap<String, FormulaData> unitData) {
		this.unitData = unitData;
	}
}
