package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
//		Shape shape = new Triangle();
//		shape.draw();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Shape shape = (Shape)context.getBean("triangle");
//		shape.draw();
//		Shape obj = (Shape)context.getBean("acute");
//		obj.draw();
//		shape.draw();
//		System.out.println(obj==shape);
//		Stage stageObj = (Stage)context.getBean("stage");
//		stageObj.sayHello();
		
		Instrumentalist dhananjay = (Instrumentalist)context.getBean("dhananjay");
		dhananjay.perform();
//		GreatPerformer gObj = (GreatPerformer)context.getBean("greatPerformer");
//		gObj.perform();
		Shape triangle=(Triangle)context.getBean("triangle");
		triangle.draw();

	}

}
