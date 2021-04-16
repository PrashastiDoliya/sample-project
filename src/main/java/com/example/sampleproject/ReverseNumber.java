package com.example.sampleproject;

public class ReverseNumber {
	
	public void main() {
		
		reverseNumberWhile(2345124);
		reverseNumberFor(23427);
		reverseNumberRecursion(57462);
		
	}
	
	private void reverseNumberRecursion(int number) {
		if (number < 10) {
			System.out.println(number);
			//return;
		} else {
			System.out.print(number % 10);//Each reminder is added in the same line, makes it a reverse number.
			reverseNumberRecursion(number / 10);
		}
	}

	private void reverseNumberFor(int number) {
		System.out.println("FOR :: Old number :" + number);
		int reverse = 0;
		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("FOR :: New number : " + reverse);
	}

	private void reverseNumberWhile(int num) {
		System.out.println("Old number :" + num);
		int newNumber = 0;// 50

		while (num != 0) {
			int remainder = num % 10;  
			newNumber = newNumber * 10 + remainder;  
			num = num/10;  
		}
		System.out.println("New number :" + newNumber);
	}

}
