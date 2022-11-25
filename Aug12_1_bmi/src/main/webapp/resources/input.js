function bmiCheck(f) {
	var name = f.name;
	var height = f.height;
	var weight = f.weight;
	
	if(reqCk(name)){
		alert("이름 똑바로");
		name.value = "";
		name.focus();
		
		return false;
	}
	
	if(reqCk(height) || isNotNumber(height) || lengthCk(height, 2)){
		alert("키 똑바로");
		height.value = "";
		height.focus();
		
		return false;
	}
	
	if(reqCk(weight) || isNotNumber(weight) || lengthCk(weight, 2)){
		alert("몸무게 똑바로");
		weight.value = "";
		weight.focus();
		
		return false;
	}
	
	return true;
}