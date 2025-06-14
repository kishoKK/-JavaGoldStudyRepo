package interfaceSample;

public class DeckUser {

	public static void main(String[] args) {
		
		ControllPanelIf myDeck = createDeck(args[0]);
		
		myDeck.play();
		myDeck.forwardFast();
		myDeck.pause();
		myDeck.play();
		myDeck.backwordFast();
		myDeck.stop();

	}

	
	private static ControllPanelIf createDeck(String deckType) {
		
		ControllPanelIf deck;
		
		if(deckType.equals("DVD")) {
			deck = new DvdDeck();		
		}else if(deckType.equals("BlueRay")){
			deck = new BlueDeck();					
		}else if(deckType.equals("HDD")){
			deck = new HDD();
		}else {
			deck = new DvdDeck();
	    }
	
		return deck;
	}
}
