package blackjack.game;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {

	@Test
	public void testComapreTo() {
		Card lowCard = new Card(Rank.TWO, Suit.SPADES);
		Card highCard = new Card(Rank.TEN, Suit.HEARTS);
		assertTrue(lowCard.compareTo(highCard) < 0);
	}
}
