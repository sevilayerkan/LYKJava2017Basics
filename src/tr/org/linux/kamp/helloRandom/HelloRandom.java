package tr.org.linux.kamp.helloRandom;

import java.util.Random;

public class HelloRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Math.random());
		Random rgen = new Random();
		//System.out.println("Rgen random "+ rgen.nextDouble());
		//System.out.println("Rgen random "+ rgen.nextBoolean());
		System.out.println("Rgen random "+ rgen.nextInt(55));
		
		//Random rgen2 = new Random();
		//System.out.println("Rgen random "+ rgen2.nextInt());
		
	}

}
