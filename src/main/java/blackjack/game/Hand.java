package blackjack.game;

import java.util.*;

public class Hand {

	private List<Card> cards = new ArrayList<Card>();

	public void add(Card card) {
		cards.add(card);
	}

	public int size() {
		return cards.size();
	}

	public int value() {
		int value = 0;
		for (Card card : cards) {
			value += card.getRank().getValue();
		}
		return value;
	}
}
