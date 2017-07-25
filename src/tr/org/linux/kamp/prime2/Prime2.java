package tr.org.linux.kamp.prime2;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		int sayi;
		
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int son = input.nextInt();
		
		for(int i=2;i<son;i++) {
			sayi=0;
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
					sayi++;
				}
			}
			if(sayi==0) {
				System.out.print(+i + " ");
			}
		}
	}

}
