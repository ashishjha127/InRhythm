package com.inRhythm;


//Junit Testing of the Code


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.inRhythm.pojo.SentenceObject;

public class testing {

	@Test
	public void test() {
		
		
		String demo = "My name is Ashish";
		Sentence test = new Sentence();
		SentenceObject result = test.wordLength(demo);
		
		SentenceObject sobj = new SentenceObject();
		sobj.setWord("Ashish");
		sobj.setWordLength(5);
		
		Assert.assertEquals("Ashish", result.getWord());
		Assert.assertEquals(6, result.getWordLength());
		
		 
	}

}
