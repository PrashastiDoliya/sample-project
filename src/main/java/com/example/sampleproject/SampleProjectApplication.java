package com.example.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sampleproject.cardprogram.CardsProgram;

@SpringBootApplication
public class SampleProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);	
		
		switch (6) {
		case 1:
			// 1. Cards Program
			new CardsProgram().main();
			break;

		case 2:
			// 2. Sentence Reverse Program
			new StringProgs().main();
			break;

		case 3:
			// 3. String Reverse Program
			new StringProgs().main1();
			break;
			
		case 4:
			// 4. Simple Recursion Program
			new Recursion().main();
			break;
			
		case 5:
			// 5. Reverse Number Program
			new ReverseNumber().main();
			break;
			
		case 6:
			// 6. Remove Duplicates numbers from Integer Array 
			new RemoveDuplicatesIntArray().main();
			break;

		default:
			break;
		}
	}
	

}
