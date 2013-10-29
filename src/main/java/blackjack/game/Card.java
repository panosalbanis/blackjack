package blackjack.game;

public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int compareTo(Card other) {
		if (other == null) {
			return 1;
		} else {
			return rank.getValue() - other.getRank().getValue();
		}
	}

	public Rank getRank() {
		return rank;
	}
}
