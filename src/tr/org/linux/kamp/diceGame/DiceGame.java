package tr.org.linux.kamp.diceGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	
	private static Random rgen = new Random();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı isimlerini giriniz.");
		
		String user1 = sc.next();
		String user2 = sc.next();
		
		int dice1 = roll();
		int dice2 = roll();
	
		
		System.out.println(user1 + " " + dice1 + ", " + user2 + " " + dice2 + " attı.");
		
		String winner;
		
		/*if(dice1>dice2)
		{
			winner = user1;
		}
		else if(dice1 == dice2) {
			winner = "Berabere!";
		}
		else {
			winner = user2;
		}*/
		
		winner = (dice1 > dice2) ? user1 : (dice1 == dice2) ? "Berabere" : user2;
		
		System.out.println("Kazanan " + winner);
		
	}
	
	public static int roll() {
		return rgen.nextInt(6) + 1;
	}
	

}
