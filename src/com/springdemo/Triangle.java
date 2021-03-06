package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class Triangle implements Shape{
	
	@Value("Equilateral")
	private String type;
	private int height;
	
	public Triangle(String _type) {
		this.type=_type;
	}
	public Triangle(String type, int height) {
		this.type=type;
		this.height=height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void draw() {
		System.out.println(this.type+ " Triangle drawn." + this.height);
	}
}
