import java.util.ArrayList;

public class Deck {

	//	This class represents deck
	
	private static ArrayList<Card> listOfCard;
	private static Deck deck = null;
	
	private Deck() { Deck.deck = this; createDeck();
		showDeck();		// Comment out it after the testing 
	};
	
	public static Deck getDeck() { return Deck.deck == null ? new Deck() : Deck.deck;}
	private void createDeck() {
		Deck.listOfCard = new ArrayList<>();
		
		Figure[] figures = Figure.values();
		Suit[] suits = Suit.values();
		
		for(int i = 0; i < (figures.length * suits.length); i++) {
			Deck.listOfCard.add(new Card(suits[i/figures.length], figures[i%figures.length]));
		}
	}
	private void showDeck() {
		for(Card card: Deck.listOfCard)
			System.out.println(card);
	}
}
