package com.springdemo;
import java.util.Map;
public class GreatPerformer implements Performer{
	private Map<String,Instrument> instruments;
	public void setInstruments(Map<String,Instrument> instruments) {
		this.instruments=instruments;
	}
	
	@Override
	public void perform() {
		for(Map.Entry<String, Instrument> entry : instruments.entrySet()) {
			String key=entry.getKey();
			Instrument instrument=entry.getValue();
			System.out.print(key+" ");
			instrument.play();
		}
	}
}
