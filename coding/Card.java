package coding;

public class Card {

	private int AceOfDiamond;
	private String TwoOfHeart;

	public int getAceOfDiamond() {
		return AceOfDiamond;
	}

	public void setAceOfDiamond(int aceOfDiamond) {
		AceOfDiamond = aceOfDiamond;
	}

	public String getTwoOfHeart() {
		return TwoOfHeart;
	}

	public void setTwoOfHeart(String twoOfHeart) {
		TwoOfHeart = twoOfHeart;
	}

	public void describe() {
		System.out.println("Ace cards : " + TwoOfHeart + "a deck of " + AceOfDiamond);
	}
}
