import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//	This class represents deck
	
	private static ArrayList<Card> listOfCard;
	private static Deck deck = null;
	
	public static Deck getDeck() { return Deck.deck == null ? new Deck() : Deck.deck;}
	private void createDeck() {
		Deck.listOfCard = new ArrayList<>();
		
		Figure[] figures = Figure.values();
		Suit[] suits = Suit.values();
		
		for(int i = 0; i < (figures.length * suits.length); i++) {
			Deck.listOfCard.add(new Card(suits[i/figures.length], figures[i%figures.length]));
		}
	}
	public void showDeck() {
		for(Card card: Deck.listOfCard)
			System.out.println(card);
	}
	public void shuffling() {
		 SecureRandom random = new SecureRandom();
		 int numberOfExchanges = random.nextInt(1000) + 10000;
		 
		 while(numberOfExchanges-- > 0) {
			 int firstCardPosition = random.nextInt(listOfCard.size());
			 int secondCardPosition = random.nextInt(listOfCard.size());
			 swappingCards(firstCardPosition, secondCardPosition);
		 }	 
	}
	public void swappingCards(int firstPosition, int secondPosition) {
		Card auxiliaryCard1 = Deck.listOfCard.get(firstPosition);
		Card auxiliaryCard2 = Deck.listOfCard.get(secondPosition);
		Deck.listOfCard.remove(firstPosition);
		Deck.listOfCard.add(firstPosition, auxiliaryCard2);
		Deck.listOfCard.remove(secondPosition);
		Deck.listOfCard.add(secondPosition, auxiliaryCard1);
	} 
	public List<Card> getCards(int numberOfCards) {
		List<Card> result = new ArrayList<>(); 
		while(numberOfCards-- > 0) {
			result.add(Deck.listOfCard.remove(0));
		}
		return result; 
	}
	public void putCards(List<Card> restOfCards) {
		int i = restOfCards.size();
		while(i-- > 0)
			Deck.listOfCard.add(restOfCards.remove(0));
	}
	
	private Deck() { Deck.deck = this; createDeck(); }; 
	
}
