package tr.org.linux.kamp.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<16;i++) {
			String in = "";
			if(i%3==0)
				in+= "Fizz";
			if(i%5==0)
				in+= "Buzz";
			System.out.print(in + " ");
		}

	}

}
