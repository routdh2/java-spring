package com.springdemo;

public class Instrumentalist implements Performer {
	
	private Song song;
	private Instrument instrument;
	
	public Instrumentalist() {
		
	}
	
	@Override
	public void perform() {
		System.out.println("Playing "+song.getSong()+" song");
		instrument.play();
	}
	
	public void setSong(Song song) {
		this.song=song;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}
	
	

}
