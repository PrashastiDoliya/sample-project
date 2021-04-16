package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringProgs {
	private static final Logger LOGGER = LoggerFactory.getLogger(StringProgs.class);
	
	public void main() {
		String sentence = "   Cybage Software       Private Limited ";
		System.out.println("Old sentence :"+ sentence);
		reverseWordsOfSentence(sentence);
	}

	private void reverseWordsOfSentence(String sentence) {
		String[] words = sentence.trim().replaceAll("\\s+", " ").split(" ");
        int size = words.length;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < size ; i++) {
			sb.append(words[size-1-i] + " ");
		}
		System.out.println("New Sentence is :" + sb);
	}

	public void main1() {
		String str = "Limited";
		System.out.println("Old string :"+ str);
		reverse(str);
	}

	private void reverse(String str) {
		char[] chars = str.toCharArray();
		int size = chars.length;
		
		for (int i = 0; i < size/2; i++) {
			char c = chars[size-1-i];

			chars[size-1-i] = chars[i];
			chars[i] = c;
		}

		for (char c : chars) {
			System.out.print(c);
		}
		
	}
	
}
