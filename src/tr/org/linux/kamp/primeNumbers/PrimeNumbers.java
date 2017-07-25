package tr.org.linux.kamp.primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int sayi = input.nextInt();
		boolean isPrime = true;
		for(int i = 2 ; i <= Math.sqrt(sayi) ;i++) {
				if(sayi % i == 0) {
					isPrime = false;
					break;
				}
		}
		if(isPrime) {
			System.out.println(sayi + " bir asal sayıdır.");
		}
		else {
			System.out.println(sayi + " asal değildir.");
		}
				
	}
}
