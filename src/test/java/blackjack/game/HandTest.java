package blackjack.game;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandTest {

	@Test
	public void handTest() {
		Hand hand = new Hand();
		Card card = new Card(Rank.TWO, Suit.CLUBS);
		hand.add(card);
		assertEquals(hand.size(), 1);
		assertTrue(hand.value() > 0);
	}
}
