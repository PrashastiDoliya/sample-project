package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Average {
	private static final Logger LOGGER = LoggerFactory.getLogger(Average.class);

	public void main() {
		int[] numbers = {1, 5, 10, 7, 8, 20};
		
		computeAverage(numbers);
	}

	private void computeAverage(int[] numbers) {
		double sum = 0;
		int numbersCount = numbers.length;
		double average = 0;		
		
		for (int num : numbers) {
			sum = sum + num;
		}

		average = sum/numbersCount;
		
		LOGGER.info("Average is : " + average);
		
	}
	
}

