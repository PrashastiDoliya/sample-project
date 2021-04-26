package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.example.sampleproject.cardprogram.CardsProgram;
import com.example.sampleproject.comparable.ComparableImpl;
import com.example.sampleproject.comparator.ComparatorImpl;

@SpringBootApplication
public class SampleProjectApplication implements CommandLineRunner  {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleProjectApplication.class); 
	
	@Autowired
	Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);	
	}
	
	@Override
	public void run(String... args) {
		LOGGER.info("Running program : {}", env.getProperty("programNumber"));
		
		String programNumber = env.getProperty("programNumber");

		if (!programNumber.isEmpty() && !programNumber.equalsIgnoreCase(" ")) {

			int programNum = Integer.parseInt(programNumber);
			
			switch (programNum) {
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
				new RemoveDuplicates().main();
				break;

			case 7:
				// 7. Calculate average of numbers 
				new Average().main();
				break;
				
			case 8:
				// 8. Largest Number from array 
				new LargestNumber().main();
				break;
				
			case 9:
				// 9. Sort Numbers in decending order 
				new SortInDecendingOrder().main();
				break;
				
			case 10:
				// 10. Compare person object using Comparable Interface
				new ComparableImpl().main();
				break;

			case 11:
				// 11. Compare Objects using Comparator Interface 
				new ComparatorImpl().main();
				break;
				
			default:
				break;
			}
			
		}
		
	}
	
}
