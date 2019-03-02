
public class Card {
	// This class represents the card from the deck
	
	private Suit suit;
	private Figure figure;
	
	public Suit getSuit() { return suit;}
	public Figure getFigure() { return figure;}
	public String toString() {return suit + " " + figure;};
	
	public Card(Suit suit, Figure figure) {
		this.suit = suit;
		this.figure = figure;
	}
	
}
