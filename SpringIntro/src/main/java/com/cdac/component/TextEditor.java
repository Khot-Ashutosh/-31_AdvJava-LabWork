package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {
	
	@Autowired  //dependancy injection
	private SpellChecker sp;
	
	public void load(String document) {
		
		System.out.println("Some code for loadig the document "+document);
		// we want to call SpellChecker class method in this class
		//we need to create the object 
		//we use spring here
		sp.checkSpellingMistakes(document);
	}

}
