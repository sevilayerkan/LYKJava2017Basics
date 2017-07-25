package tr.org.linux.kamp.characters;

import java.util.Random;

public class Karakterler {
	
	private static Random rgen = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char a = 97;
		//char a = 'a';
		/*System.out.println((char)(97+1));
		System.out.println('a' +1);
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('2'));
		System.out.println(Character.isWhitespace('a'));
		System.out.println(Character.isWhitespace(' '));*/
		
		System.out.println(rastgele());
		
		
		
	}
	
	public static char rastgele() {
		return (char) (rgen.nextInt(26) + 'A');
	}

}
