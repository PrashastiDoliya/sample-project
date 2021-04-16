/*
 * Copyright (C) 2020, Amobee, Videology - All Rights Reserved
 */
package com.example.sampleproject.cardprogram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amobee Integration
 * 
 *         SpringBootApplication class CardsProgram to load Spring
 *         Boot application
 */
public class CardsProgram {

	private static final Logger LOGGER = LoggerFactory.getLogger(CardsProgram.class);
	public static final int NCARDS = 40;

	public void main() {
		Card[] cards = createCards();
		printCards(cards);
		System.out.println("======================");
		Card[] shuffledCards = shuffle(cards);
		printCards(shuffledCards);
	}


	private static Card[] shuffle(Card[] cards) {
		
		int i, j, k;

	      for ( k = 1; k <= 100; k++ )
	      {
	          i = (int) ( NCARDS * Math.random() );  // Pick 2 random cards      
	          j = (int) ( NCARDS * Math.random() );  // in the deck

	          Card tmp = cards[i];
	          cards[i] = cards[j];
	          cards[j] = tmp;
	      }
	      return cards;
	}


	private static void printCards(Card[] cards) {
		
		for (Card card : cards) {
			System.out.println("Card is : " + card.getSuit() + " " + card.getValue());
		}
		
	}

	private static Card[] createCards() {
		int j = 0;
		Card[] cards = new Card[NCARDS];
		String[] cardTypes = { "spade", "club", "heart", "diamond" };
		for (String cardType : cardTypes) {
			for (int i = 1; i <= 10; i++) {
				cards[j] = new Card(cardType, i);
				j++;
			}
		}
		return cards;
	}
}
