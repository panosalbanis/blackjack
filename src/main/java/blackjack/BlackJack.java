package blackjack;

import blackjack.game.Deck;
import blackjack.game.Hand;

import java.io.IOException;

public class BlackJack {

	private final static int DEALER_MINIMUM = 17;
	private final static int BLACKJACK = 21;
	private final static String PLAYER_WINS = "You win!, congratulations.";
	private final static String DEALER_WINS = "Dealer wins, sorry.";

	public static void main(String[] args) throws IOException {
		Deck deck = new Deck();
		Hand dealer = new Hand();
		Hand player = new Hand();

		while (dealer.value() < DEALER_MINIMUM) {
			dealer.add(deck.draw());
		}
		System.out.println("DEBUG[Dealer stops at: " + dealer.value() + ".]");
		if (dealer.value() > BLACKJACK) {
			System.out.println(PLAYER_WINS);
			return;
		}
		if (dealer.value() == BLACKJACK) {
			System.out.println(DEALER_WINS);
			return;
		}
		player.add(deck.draw());
		while (true) {
			System.out.println("You are at " + player.value() + ".");
			if (player.value() > BLACKJACK) {
				System.out.println(DEALER_WINS);
				return;
			}
			if (player.value() == BLACKJACK) {
				System.out.println(PLAYER_WINS);
				return;
			}
			System.out.println("hit? (y/n)");
			char answer = (char)System.in.read();
			if (answer == 'y') {
				player.add(deck.draw());
			} else if (answer == 'n') {
				if (player.value() <= dealer.value()) {
					System.out.println(DEALER_WINS);
					return;
				} else {
					System.out.println(PLAYER_WINS);
					return;
				}
			} else {
				continue;
			}
		}
	}
}
