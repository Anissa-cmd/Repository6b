package coding;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player nancyLee = new Player("Nancy Lee");
		Player elSasha = new Player("El Sasha");
		
		deck.shuffle();
		
		for (int i = 1; i < 53; i++) {
			if (i % 2 == 0) {
				nancyLee.draw(deck);
			} else {
				elSasha.draw(deck);
			}
		}
		
		for (int i = 1; i < 27; i++) {
			Card nancyLeeHP = nancyLee.flip();
			Card elSashaHP = elSasha.flip();
			
			if(nancyLeeHP.getAceOfDiamond() > elSashaHP.getAceOfDiamond()) {
				
				nancyLee.incrementScore();
				
			} else if (nancyLeeHP.getAceOfDiamond() < elSashaHP.getAceOfDiamond()) {
				
				elSasha.incrementScore();
				
			} else {
				nancyLee.incrementScore();
				elSasha.incrementScore();
			}
		}
		
		int nancyLeeScore = nancyLee.getScore();
		int elSashaScore = elSasha.getScore();
		
		if (nancyLeeScore == elSashaScore) {
			
			System.out.println("It was great game between " + nancyLee.getName() + " and " + elSasha.getName());
			
		} else if (nancyLeeScore > elSashaScore) {
			
			System.out.println(nancyLee.getName() + " Triumph!!!!!!!!!!!!!");
			
		} else {
			
			System.out.println(elSasha.getName() + " Victory!!!!!!!!!!!!!");
			
		}
	}

}
