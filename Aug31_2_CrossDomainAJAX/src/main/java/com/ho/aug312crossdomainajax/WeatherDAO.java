package com.ho.aug312crossdomainajax;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

@Service
public class WeatherDAO {
	
	public String getWeather(Xy xy) {

		HttpsURLConnection huc = null;
		try {
			String s = "https://www.kma.go.kr/wid/queryDFS.jsp";
			s += "?x=" + xy.getX() + "&y=" + xy.getY();
			URL u = new URL(s); 
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine()) != null){
				sb.append(line.replace("\r\n", ""));
				//기상청이 친절하게 엔터키 처놔서 빼줌
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			huc.disconnect();
		}
	}
}
