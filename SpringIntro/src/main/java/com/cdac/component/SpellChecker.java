package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("splChekr")
public class SpellChecker {
	
	public void checkSpellingMistakes(String document) {
		
		System.out.println("some code to check the spelling "+ document);
		
	}
}
