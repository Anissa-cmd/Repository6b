package coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> AceOfDiamonds;
	
	public Deck() {
		AceOfDiamonds = new ArrayList<Card>();
		
		Card h1 = new Card();
		h1.setAceOfDiamond(3);
		h1.setTwoOfHeart("H2");
		AceOfDiamonds.add(h1);
		
		Card h2 = new Card();
		h2.setAceOfDiamond(5);
		h2.setTwoOfHeart("H3");
		AceOfDiamonds.add(h2);
		
		Card h3 = new Card();
		h3.setAceOfDiamond(4);
		h3.setTwoOfHeart("H4");
		AceOfDiamonds.add(h3);
		
		Card h4 = new Card();
		h4.setAceOfDiamond(2);
		h4.setTwoOfHeart("H5");
		AceOfDiamonds.add(h4);
		
		Card h5 = new Card();
		h5.setAceOfDiamond(6);
		h5.setTwoOfHeart("H6");
		AceOfDiamonds.add(h5);
		
		Card h6 = new Card();
		h6.setAceOfDiamond(7);
		h6.setTwoOfHeart("H7");
		AceOfDiamonds.add(h6);
		
		Card h7 = new Card();
		h7.setAceOfDiamond(8);
		h7.setTwoOfHeart("H8");
		AceOfDiamonds.add(h7);
		
		Card h8 = new Card();
		h8.setAceOfDiamond(9);
		h8.setTwoOfHeart("H9");
		AceOfDiamonds.add(h8);
		
		Card h9 = new Card();
		h9.setAceOfDiamond(10);
		h9.setTwoOfHeart("H52");
		AceOfDiamonds.add(h9);
		
		Card h10 = new Card();
		h10.setAceOfDiamond(11);
		h10.setTwoOfHeart("H50");
		AceOfDiamonds.add(h10);
		
		Card h11 = new Card();
		h11.setAceOfDiamond(12);
		h11.setTwoOfHeart("H45");
		AceOfDiamonds.add(h11);
		
		Card h12 = new Card();
		h12.setAceOfDiamond(13);
		h12.setTwoOfHeart("H49");
		AceOfDiamonds.add(h12);
		
		Card h13 = new Card();
		h13.setAceOfDiamond(14);
		h13.setTwoOfHeart("H47");
		AceOfDiamonds.add(h13);
		
		Card h14 = new Card();
		h14.setAceOfDiamond(3);
		h14.setTwoOfHeart("H42");
		AceOfDiamonds.add(h14);
		
		Card h15 = new Card();
		h15.setAceOfDiamond(2);
		h15.setTwoOfHeart("H39");
		AceOfDiamonds.add(h15);
		
		Card h16 = new Card();
		h16.setAceOfDiamond(5);
		h16.setTwoOfHeart("H38");
		AceOfDiamonds.add(h16);
		
		Card h17 = new Card();
		h17.setAceOfDiamond(6);
		h17.setTwoOfHeart("H36");
		AceOfDiamonds.add(h17);
		
		Card h18 = new Card();
		h18.setAceOfDiamond(7);
		h18.setTwoOfHeart("H34");
		AceOfDiamonds.add(h18);
		
		Card h19 = new Card();
		h19.setAceOfDiamond(9);
		h19.setTwoOfHeart("H30");
		AceOfDiamonds.add(h19);
		
		Card h20 = new Card();
		h20.setAceOfDiamond(10);
		h20.setTwoOfHeart("H28");
		AceOfDiamonds.add(h20);
		
		Card h21 = new Card();
		h21.setAceOfDiamond(14);
		h21.setTwoOfHeart("H25");
		AceOfDiamonds.add(h21);
		
		Card h22 = new Card();
		h22.setAceOfDiamond(13);
		h22.setTwoOfHeart("H51");
		AceOfDiamonds.add(h22);
		
		Card h23 = new Card();
		h23.setAceOfDiamond(12);
		h23.setTwoOfHeart("H46");
		AceOfDiamonds.add(h23);
		
		Card h24 = new Card();
		h24.setAceOfDiamond(2);
		h24.setTwoOfHeart("H18");
		AceOfDiamonds.add(h24);
		
		Card h25 = new Card();
		h25.setAceOfDiamond(3);
		h25.setTwoOfHeart("H10");
		AceOfDiamonds.add(h25);
		
		Card h26 = new Card();
		h26.setAceOfDiamond(4);
		h26.setTwoOfHeart("H13");
		AceOfDiamonds.add(h26);
		
		Card h27 = new Card();
		h27.setAceOfDiamond(5);
		h27.setTwoOfHeart("H41");
		AceOfDiamonds.add(h27);
		
		Card h28 = new Card();
		h28.setAceOfDiamond(10);
		h28.setTwoOfHeart("H37");
		AceOfDiamonds.add(h28);
		
		Card h29 = new Card();
		h29.setAceOfDiamond(6);
		h29.setTwoOfHeart("H23");
		AceOfDiamonds.add(h29);
		
		Card h30 = new Card();
		h30.setAceOfDiamond(7);
		h30.setTwoOfHeart("H38");
		AceOfDiamonds.add(h30);
		
		Card h31 = new Card();
		h31.setAceOfDiamond(8);
		h31.setTwoOfHeart("H17");
		AceOfDiamonds.add(h31);
		
		Card h32 = new Card();
		h32.setAceOfDiamond(9);
		h32.setTwoOfHeart("H24");
		AceOfDiamonds.add(h32);
		
		Card h33 = new Card();
		h33.setAceOfDiamond(10);
		h33.setTwoOfHeart("H25");
		AceOfDiamonds.add(h33);
		
		Card h34 = new Card();
		h34.setAceOfDiamond(11);
		h34.setTwoOfHeart("H8");
		AceOfDiamonds.add(h34);
		
		Card h35 = new Card();
		h35.setAceOfDiamond(12);
		h35.setTwoOfHeart("H1");
		AceOfDiamonds.add(h35);
		
		Card h36 = new Card();
		h36.setAceOfDiamond(13);
		h36.setTwoOfHeart("H15");
		AceOfDiamonds.add(h36);
		
		Card h37 = new Card();
		h37.setAceOfDiamond(14);
		h37.setTwoOfHeart("H21");
		AceOfDiamonds.add(h37);
		
		Card h38 = new Card();
		h38.setAceOfDiamond(2);
		h38.setTwoOfHeart("H16");
		AceOfDiamonds.add(h38);
		
		Card h39 = new Card();
		h39.setAceOfDiamond(3);
		h39.setTwoOfHeart("H31");
		AceOfDiamonds.add(h39);
		
		Card h40 = new Card();
		h40.setAceOfDiamond(4);
		h40.setTwoOfHeart("H33");
		AceOfDiamonds.add(h40);
		
		Card h41 = new Card();
		h41.setAceOfDiamond(5);
		h41.setTwoOfHeart("19");
		AceOfDiamonds.add(h41);
		
		Card h42 = new Card();
		h42.setAceOfDiamond(6);
		h42.setTwoOfHeart("H24");
		AceOfDiamonds.add(h42);
		
		Card h43 = new Card();
		h43.setAceOfDiamond(5);
		h43.setTwoOfHeart("H23");
		AceOfDiamonds.add(h43);
		
		Card h44 = new Card();
		h44.setAceOfDiamond(8);
		h44.setTwoOfHeart("H3");
		AceOfDiamonds.add(h44);
		
		Card h45 = new Card();
		h45.setAceOfDiamond(9);
		h45.setTwoOfHeart("H17");
		AceOfDiamonds.add(h45);
		
		Card h46 = new Card();
		h46.setAceOfDiamond(10);
		h46.setTwoOfHeart("H28");
		AceOfDiamonds.add(h46);
		
		Card h47 = new Card();
		h47.setAceOfDiamond(11);
		h47.setTwoOfHeart("H6");
		AceOfDiamonds.add(h47);
		
		Card h48 = new Card();
		h48.setAceOfDiamond(12);
		h48.setTwoOfHeart("H29");
		AceOfDiamonds.add(h48);
		
		Card h49 = new Card();
		h49.setAceOfDiamond(13);
		h49.setTwoOfHeart("H28");
		AceOfDiamonds.add(h49);
		
		Card h50 = new Card();
		h50.setAceOfDiamond(14);
		h50.setTwoOfHeart("H43");
		AceOfDiamonds.add(h50);
		
		Card h51 = new Card();
		h51.setAceOfDiamond(2);
		h51.setTwoOfHeart("H47");
		AceOfDiamonds.add(h51);
		
		Card h52 = new Card();
		h52.setAceOfDiamond(3);
		h52.setTwoOfHeart("H49");
		AceOfDiamonds.add(h52);
	}

	public List<Card> getAceOfDiamonds() {
		return AceOfDiamonds;
	}

	public void setAceOfDiamonds(List<Card> aceOfDiamonds) {
		AceOfDiamonds = aceOfDiamonds;
	}
	
	public void shuffle() {

		Random random = new Random();
		
		
		for(int i = AceOfDiamonds.size() - 1; i > 0; i--) {

			int a = random.nextInt(i + 1);
			
			Card aceOfDiamondAtIndexI = AceOfDiamonds.get(i);
			Card aceOfDiamondAtIndexJ = AceOfDiamonds.get(a);
			
			AceOfDiamonds.set(i, aceOfDiamondAtIndexJ);
			AceOfDiamonds.set(a, aceOfDiamondAtIndexI);
		}
	}

	public Card draw() {
		return AceOfDiamonds.remove(0);
	}
}
