function sWriteCheck(f) {
	var title = f.s_title;
	var text = f.s_txt;
	
	if(reqCk(title)){
		alert("제목을 입력해주세요");
		title.focus();
		
		return false;
	}
	
	if(reqCk(text) || lengthCk(text, 20)){
		alert("내용을 입력해주세요.(최소 20자)");
		text.focus();
		
		return false;
	}
	
	return true;
}