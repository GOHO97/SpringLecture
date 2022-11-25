package com.ho.aug123total.nickname;

import java.math.BigDecimal;
import java.util.Date;

public class Nickname {
	private BigDecimal n_no;
	private String n_name;
	private String n_nickname;
	private Date n_regdate;
	
	public Nickname() {
		// TODO Auto-generated constructor stub
	}

	public Nickname(BigDecimal n_no, String n_name, String n_nickname, Date n_regdate) {
		super();
		this.n_no = n_no;
		this.n_name = n_name;
		this.n_nickname = n_nickname;
		this.n_regdate = n_regdate;
	}

	public BigDecimal getN_no() {
		return n_no;
	}

	public void setN_no(BigDecimal n_no) {
		this.n_no = n_no;
	}

	public String getN_name() {
		return n_name;
	}

	public void setN_name(String n_name) {
		this.n_name = n_name;
	}

	public String getN_nickname() {
		return n_nickname;
	}

	public void setN_nickname(String n_nickname) {
		this.n_nickname = n_nickname;
	}

	public Date getN_regdate() {
		return n_regdate;
	}

	public void setN_regdate(Date n_regdate) {
		this.n_regdate = n_regdate;
	}
}
