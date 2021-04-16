package com.example.sampleproject;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesIntArray {
	
	public void main() {
		int[] numbers = {1, 5, 2, 1, 6, 5, 3};
		
		removeDuplicates(numbers);
		//removeDuplicatesFromIntArray(numbers);
	    
	}

	private void removeDuplicates(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {

				if (numbers[i] == numbers[j]) {
					numbers[i] = 0;
				}
			}
		}

		System.out.print("New Array : ");
		for (int i : numbers) {
			System.out.print(i);			
		}
		
	}

	private void removeDuplicatesFromIntArray(int[] num) {

		Set<Integer> newNum = new HashSet<>();
		
		for (Integer integer : num) {
			newNum.add(integer);
		}
		
		System.out.print("New Array : ");
		newNum.stream().forEach(n -> System.out.print(n + " "));
	}

}
