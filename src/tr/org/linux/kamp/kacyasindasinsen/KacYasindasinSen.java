package tr.org.linux.kamp.kacyasindasinsen;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class KacYasindasinSen {
	
	public static double hesaplama(LocalDate currentDate,LocalDate dateOfBirth) {
		return ChronoUnit.DAYS.between(dateOfBirth, currentDate);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dogum gününüzü gün ay yıl şeklinde giriniz:  ");
		int gun = input.nextInt();
		int ay = input.nextInt();
		int yil = input.nextInt();
		
		LocalDate dateOfBirth = LocalDate.of(yil,ay, gun);
		LocalDate currentDate = LocalDate.now();
		
		double a = hesaplama(currentDate,dateOfBirth);
		
		System.out.println(a " gundur yasiyorsunuz.");
		
		
	}

}
