function loginCheck() {
	var id = document.loginF.id;
	var pw = document.loginF.pw;
	var name = document.loginF.name;
	var age = document.loginF.age;
	
	if(reqCk(id)){
		alert("id 쓰셈");
		id.value = "";
		id.focus();
		
		return false;
	}
	
	if(reqCk(pw)){
		alert("pw 쓰셈");
		pw.value = "";
		pw.focus();
		
		return false;
	}
	
	if(reqCk(name)){
		alert("이름 쓰셈");
		name.value = "";
		name.focus();
		
		return false;
	}
	
	if(reqCk(age)){
		alert("나이 쓰셈");
		age.value = "";
		age.focus();
		
		return false;
	}
	
	return true;
}