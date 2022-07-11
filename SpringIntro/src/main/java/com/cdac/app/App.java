package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Atm;
import com.cdac.component.Calculation;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;
import com.cdac.component.TextEditor;

public class App {

	public static void main(String[] args) {
		//it loads Spring/IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		// for accessing a particular bean
		//it is creating a object of class
		HelloWorld hw = (HelloWorld)ctx.getBean("hello");
		System.out.println(hw.sayHello("Ashutosh"));
		
		Calculation cal = (Calculation)ctx.getBean("cal");
		System.out.println(cal.Add(22, 11));
		System.out.println(cal.Sub(22, 11));
		
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD", "INR", 550));
		
		LoginService loginServ = (LoginService) ctx.getBean("loginServ");
		System.out.println(loginServ.isValidUser("Ashutosh", "1234"));
		
		TextEditor tx = (TextEditor) ctx.getBean("txtEdtr");
		tx.load("abc.txt");
		
		Atm atm = (Atm) ctx.getBean("hdfcAtm");
		atm.withdraw(10101010, 2500);
	}

}
