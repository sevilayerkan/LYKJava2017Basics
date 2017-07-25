package tr.org.linux.kamp.randomCard;

import java.util.Random;

public class RandomCard {

	private static Random rgen = new Random();
	
	//Main starts here

	public static void main(String[] args) {
		System.out.println(chooseRandomCard());
	}

	// Methods starts here

	public static String chooseRandomCard() { // Returns random card

		return chooseRandomSuit() + " " + chooseRandomRank();
	}

	public static String chooseRandomRank() { // Returns random choosen rank ace to king
		int randomNumber = rgen.nextInt(13) + 1;
		
		
		if (randomNumber > 1 && randomNumber <= 10) {
			return "" + randomNumber;
		} else {
			switch (randomNumber) {
			case 1:
				return "As";
			case 11:
				return "Kız";
			case 12:
				return "Vale";
			case 13:
				return "Papaz";
			default:
				return "Hata";
			}
		}

	}

	public static String chooseRandomSuit() { // Returns random choosen suit clubs to spades karo maça sinek kupa
		int randomNumber = rgen.nextInt(4);
		switch (randomNumber) {
		case 0:
			return "Maça";
		case 1:
			return "Kupa";
		case 2:
			return "Karo";
		case 3:
			return "Sinek";
		default:
			return "Hata";

		}
	}

}
