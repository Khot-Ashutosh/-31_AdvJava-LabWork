package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;

public class App {

	public static void main(String[] args) {
		//Loading Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts2");
		
		//entity classes are not instantiated by using spring
		CarPart cp = new CarPart();
		cp.setPartName("Seat Covers");
		cp.setCarModel("Maruti 800");
		cp.setPrice(700);
		cp.setQuantity(10);
		
		long ms1 = System.currentTimeMillis();
		inv.addNewPart(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : "+ (ms2 - ms1) + " ms");
		
	}

}
