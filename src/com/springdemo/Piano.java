package com.springdemo;

public class Piano implements Instrument{
	public Piano() {
		
	}
	
	@Override
	public void play() {
		System.out.println("Playing piano...");
	}
}
