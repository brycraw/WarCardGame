package WAR;

public class App {

	public static void main(String[] args) {
		//fields
		Deck gameDeck = new Deck();
		
		Player jeb = new Player("Jeb");	
		Player herk = new Player("Herk");
		
		gameDeck.shuffle();	
		
		for(int i = 0; i < 26; i++) {	
			jeb.draw(gameDeck);
			herk.draw(gameDeck);
		}
		
		for(int i = 0; i < 26; i++) {
			int jebCard = jeb.flip().getValue();
			int herkCard = herk.flip().getValue();
			
			if(jebCard > herkCard) {
				jeb.incrementScore();
			}
			else if(jebCard < herkCard) {
				herk.incrementScore();
			}
		}
		if(jeb.getScore() > herk.getScore()) {
			System.out.println("Jeb wins with a score of " + jeb.getScore());
			System.out.println("Herk lost with a score of " + herk.getScore());
		}
		else if(jeb.getScore() < herk.getScore()) {
			System.out.println("Herk wins with a score of " + herk.getScore());
			System.out.println("Jeb lost with a score of " + jeb.getScore());
		}
		else{
			System.out.println("Jeb and Herk both had a score of " + jeb.getScore() + " and the match is a Draw!");
		}
	}
}
