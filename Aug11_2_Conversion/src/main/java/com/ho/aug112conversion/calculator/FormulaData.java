package com.ho.aug112conversion.calculator;

public class FormulaData {
	private String input;
	private String output;
	private String formula;
	
	public FormulaData() {
		// TODO Auto-generated constructor stub
	}

	public FormulaData(String input, String output, String formula) {
		super();
		this.input = input;
		this.output = output;
		this.formula = formula;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}
	
}
