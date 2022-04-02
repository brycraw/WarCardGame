package WAR;

import java.util.*;

public class Player {
	//fields
	private ArrayList<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name = "";

	public Player(String playerName) {
	}

	//Methods
	public void describe() {
		for (Card h: hand) {
			h.describe();
		}
		System.out.println(name + ": " + hand);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck gameDeck) {
		hand.add(gameDeck.draw());
	}
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
