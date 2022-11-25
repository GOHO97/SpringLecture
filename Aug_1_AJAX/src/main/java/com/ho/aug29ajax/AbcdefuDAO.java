package com.ho.aug29ajax;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbcdefuDAO {

	@Autowired
	private SqlSession ss;
	
	public void showTable(HttpServletRequest req) {
		
		List<Abcdefu> au2 = ss.getMapper(Mapper.class).showTable();
		req.setAttribute("au", au2);
	}
	
	public Songs getXML(HttpServletRequest req) {
		List<Abcdefu> au2 = ss.getMapper(Mapper.class).showTable();
		return new Songs(au2);
	}
	
	public Songs2 getJSON(HttpServletRequest req, int page) {
		int songs2Perpage = 5;
		int start = (page - 1) * page + 1;
		int end = page * songs2Perpage;
		
		List<Abcdefu2> au2 = ss.getMapper(Mapper.class).showTable2
				(new SearchOption(new BigDecimal(start), new BigDecimal(end), null));
		return new Songs2(au2);
	}
}
