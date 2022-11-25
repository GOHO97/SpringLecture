package com.ho.aug161classic.share;

import java.math.BigDecimal;
import java.util.Date;

public class SWriteData {
	private BigDecimal s_no;
	private String s_title;
	private String s_txt;
	private Date s_date;
	
	public SWriteData() {
		// TODO Auto-generated constructor stub
	}

	public SWriteData(BigDecimal s_no, String s_title, String s_txt, Date s_date) {
		super();
		this.s_no = s_no;
		this.s_title = s_title;
		this.s_txt = s_txt;
		this.s_date = s_date;
	}

	public BigDecimal getS_no() {
		return s_no;
	}

	public void setS_no(BigDecimal s_no) {
		this.s_no = s_no;
	}

	public String getS_title() {
		return s_title;
	}

	public void setS_title(String s_title) {
		this.s_title = s_title;
	}

	public String getS_txt() {
		return s_txt;
	}

	public void setS_txt(String s_txt) {
		this.s_txt = s_txt;
	}

	public Date getS_date() {
		return s_date;
	}

	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}
	
}
