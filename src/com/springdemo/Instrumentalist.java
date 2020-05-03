package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Performer {
	
	@Autowired
	private Song song;
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	
	public Instrumentalist() {
		
	}
	
	@Override
	public void perform() {
		System.out.println("Playing "+song.getSong()+" song");
		instrument.play();
	}
	@Autowired(required=false)
	public void setSong(Song song) {
		this.song=song;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}
	
	

}
