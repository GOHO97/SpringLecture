package com.ho.aug161classic;

import java.math.BigDecimal;

public class BoardPerPage {
	private BigDecimal perPageNum;
	
	public BoardPerPage() {
		// TODO Auto-generated constructor stub
	}

	public BoardPerPage(BigDecimal perPageNum) {
		super();
		this.perPageNum = perPageNum;
	}

	public BigDecimal getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(BigDecimal perPageNum) {
		this.perPageNum = perPageNum;
	}
	
}
