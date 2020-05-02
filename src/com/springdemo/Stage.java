package com.springdemo;

public class Stage {
	private static Stage stageObj;
	
	private Stage() {
		
	}
	public static Stage getInstance() {
		if(stageObj==null)
			stageObj=new Stage();
		return stageObj;
	}
	
	public void sayHello() {
		System.out.println("Hello from stage");
	}
	

}
