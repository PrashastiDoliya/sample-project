package com.example.sampleproject;

public class Recursion {
	
	public void main() {
		recursionFun(15);
	}

	private void recursionFun(int i) {
		i--;
		while(i>0) {
		recursionFun(i);
		}
	}

}
