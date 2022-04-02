package WAR;

import java.util.*;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<>();
	String [] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
	
	//deck constructor
	public Deck() {
		for(int j = 0; j < 4; j++) {	//loop for all suits
			for(int i = 2; i <= 14; i++) {	//nested loop all cards in suit
				Card a = new Card(i, suits[j]);	//each element of the HashMap gets printed
				cards.add(a);
			}
		}
	}
		
	public void shuffle() {	//creates a List out of all the cards made via the constructor
			Collections.shuffle(cards);	//shuffles the List
	}
		
	public Card draw() {
		return cards.remove(0);	//"deletes" top card from the community deck, returns it to be used by the receiving player in diff method
	}
}

