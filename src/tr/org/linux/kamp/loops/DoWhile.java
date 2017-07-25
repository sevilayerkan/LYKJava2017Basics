package tr.org.linux.kamp.loops;

public class DoWhile {
	
	public static void main(String[] args) {
		int counter = 8;
		
		do {
			System.out.println(counter);
			++counter;
		}
		while(counter <= 10);
	}

}