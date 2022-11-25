function inputCheck(f) {
	var number = f.number
	
	if(reqCk(number) || isNotNumber(number)) {
		alert("숫자를 입력해주세요");
		number.value="";
		number.focus();
		
		return false;
	}
	return true;
}