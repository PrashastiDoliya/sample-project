package com.example.sampleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortInDecendingOrder {

	public void main() {

		int[] numbers = {2, 5, 10, 23, 8, 20};
		
		orderInDecendingOrder(numbers);
	}

	private void orderInDecendingOrder(int[] numbers) {

		for (int i = 0; i < numbers.length-1; i++)
            for (int j = 0; j < numbers.length-i-1; j++)
                if (numbers[j] < numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
    
		
		System.out.print("Sorted Numbers : ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		
	}

}
