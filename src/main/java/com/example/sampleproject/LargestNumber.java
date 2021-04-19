package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LargestNumber {

	private static final Logger LOGGER = LoggerFactory.getLogger(LargestNumber.class);
	
	public void main() {

		int[] numbers = {21, 5, 10, 23, 8, 20};
		
		computeLargestNumber(numbers);
	}

	private void computeLargestNumber(int[] numbers) {
		int largestNum = 0;

		for (int i : numbers) {
			if (largestNum < i) {
				largestNum = i;
			}
		}
		LOGGER.info("Largest Number is : {}", largestNum);
		
	}

}
