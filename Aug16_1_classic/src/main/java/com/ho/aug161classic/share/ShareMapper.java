package com.ho.aug161classic.share;

import java.util.List;

import com.ho.aug161classic.SearchOption;

public interface ShareMapper {
	public abstract int sWrite(SWriteData sd);
	public abstract List<SWriteData> sShow(SearchOption so);
	public abstract int sShowBoardCount(SearchOption so);
}
