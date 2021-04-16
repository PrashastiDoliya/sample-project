package com.example.sampleproject.cardprogram;

public class Card {

	private String suit;
	private int value;

	public Card(String suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]";
	}

}
