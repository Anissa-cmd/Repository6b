package coding;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<Card>();
		this.score = 0;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void describe() {
		System.out.println("Player name: " + this.name);

		for (Card hp : hand) {
			hp.describe();
		}
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		Card hp = deck.draw();
		hand.add(hp);
	}

	public void incrementScore() {
		score += 1;
	}
}
