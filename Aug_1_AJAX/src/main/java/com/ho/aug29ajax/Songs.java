package com.ho.aug29ajax;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Songs {
	private List<Abcdefu> song; //단수형 권장

	public Songs(List<Abcdefu> song) {
		super();
		this.song = song;
	}
	
	public Songs() {
		// TODO Auto-generated constructor stub
	}

	public List<Abcdefu> getSong() {
		return song;
	}
	@XmlElement
	public void setSong(List<Abcdefu> song) {
		this.song = song;
	}
	
}
