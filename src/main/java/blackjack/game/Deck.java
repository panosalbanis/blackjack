package blackjack.game;

import java.util.*;

public class Deck {

	private Stack<Card> cards;

	public Deck() {
		cards = new Stack<Card>();
		initialize();
	}

	public Card draw() {
		return cards.pop();
	}

	public int size() {
		return cards.size();
	}

	private void initialize() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.push(new Card(rank, suit));
			}
		}
		shuffle();
	}

	private void shuffle() {
 		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			cards.add(random.nextInt(size()), cards.pop());
		}
	}
}
