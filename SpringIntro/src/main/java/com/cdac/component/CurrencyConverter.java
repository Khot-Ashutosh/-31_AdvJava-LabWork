package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("currencyConv") //alternative to create object
public class CurrencyConverter {
	
	public double convert(String from, String to,double amount) {
		if(from.equals("USD") && to.equals("INR")) {
			return 78.93 * amount;
		}
		else if(from.equals("GBP") && to.equals("INR")) {
			return 94.78 * amount;
		}
		else
			return 0;
	}
}
