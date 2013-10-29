package blackjack.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {

	@Test
	public void deckTest() {
		Deck deck = new Deck();
		assertEquals(deck.size(), 52);
		deck.draw();
		assertEquals(deck.size(), 51);
	}
}
