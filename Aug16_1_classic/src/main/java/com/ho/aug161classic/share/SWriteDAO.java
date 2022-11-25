package com.ho.aug161classic.share;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ho.aug161classic.BoardPerPage;
import com.ho.aug161classic.SearchOption;

@Service
public class SWriteDAO {
	private int allSBoardCount;
	
	@Autowired
	private SqlSession ss;
	
	@Autowired
	private BoardPerPage bpp;
	
	public void sBoardCount() {
		allSBoardCount = ss.getMapper(ShareMapper.class).sShowBoardCount(new SearchOption("", null, null));
		System.out.println(allSBoardCount);
	}
	
	public void sWrite(SWriteData sd, HttpServletRequest req) {
		try {
			
			String token = req.getParameter("token");
			String successToken = (String) req.getSession().getAttribute("successToken");
			
			if(successToken != null && successToken.equals(token)) {
				req.setAttribute("r", "글쓰기실패[새로고침]");
				return;
			}
			
			sd.setS_txt(sd.getS_txt().replace("\r\n", "<br>"));
			
			ShareMapper sm = ss.getMapper(ShareMapper.class);
			if(sm.sWrite(sd) == 1) {
				req.setAttribute("r", "글쓰기 성공");
				req.getSession().setAttribute("successToken", token);
				allSBoardCount ++;
			} else {
				req.setAttribute("r", "글쓰기 실패");
			}
		} catch (Exception e) {
			req.setAttribute("r", "글쓰기 실패");
			e.printStackTrace();
		}
	}
	
	public void search(HttpServletRequest req) {
		String search = req.getParameter("search");
		req.getSession().setAttribute("search", search);
	}
	
	public void sShow(int page, HttpServletRequest req) {
		
		String search = (String) req.getSession().getAttribute("search");
		int sBoardCount = 0;
		if(search == null) {
			search = "";
			sBoardCount = allSBoardCount;
		} else {
			sBoardCount = ss.getMapper(ShareMapper.class).sShowBoardCount(new SearchOption(search, null, null));
		}
		int sBoardPerPage = bpp.getPerPageNum().intValue();
		int pageCount = (int) Math.ceil(sBoardCount / (double) sBoardPerPage);
		
		req.setAttribute("pageCount", pageCount);
		
		int start = (page - 1) * sBoardPerPage + 1;
		int end = page * sBoardPerPage;
		
		SearchOption so = new SearchOption(search, new BigDecimal(start), new BigDecimal(end));
		req.setAttribute("shareBoard", ss.getMapper(ShareMapper.class).sShow(so));
	}
	
}
