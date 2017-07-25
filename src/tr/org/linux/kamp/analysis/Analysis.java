package tr.org.linux.kamp.analysis;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int passes = 0,failures = 0, studentCounter= 1;
		
		while(studentCounter <= 10) {
			System.out.println("Sonucu giriniz: ");
			
			int result = input.nextInt();
			
			if(result == 1) {
				passes ++;
				studentCounter++;
			}
			else if(result == 2) {
				failures ++;
				studentCounter++;
			}
			else {
				System.out.println("Lütfen sonucu 1 ve 2 olarak giriniz.");
			}
			
			
		}
		System.out.println("Geçenler: " + passes);
		System.out.println("Kalanlar: " + failures);
		
	}

}
