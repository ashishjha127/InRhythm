package com.inRhythm;

import com.inRhythm.pojo.SentenceObject;

public class TestingChallenge {

	public static void main(String[] args) {
		Sentence sen = new Sentence();
		SentenceObject senObj = new SentenceObject();
		senObj = sen.wordLength("The cow jumped over the Ashish");
		System.out.println("Longest word: " + senObj.getWord() + "\nWord Length : " + senObj.getWordLength() + " ");
	}

}
