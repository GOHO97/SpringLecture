import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TMain {
	public static void main(String[] args) throws ScriptException {
		double d = 1.5; //입력한 숫자
		String sik = "* 2 + 3 - 1"; //고른 단위 별로 들어갈 식
		sik = String.format("%f %s", d, sik);
		
		// JDK 1.6 부터 생김
		// JavaScript 가져다가
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByName("JavaScript");
		
		// 문자열로 된  수식 계산[JavaScript]
		double ans = (Double) se.eval(sik);
		System.out.println(ans);
		
	}
}
