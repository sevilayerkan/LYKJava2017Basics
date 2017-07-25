package tr.org.linux.kamp.minmax;

import java.util.Scanner;

public class MinimumFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen aralarına boşluk koyarak iki sayı tanımlayınız");
		double numbera = input.nextDouble();
		double numberb = input.nextDouble();

		double result = minimum(numbera, numberb);

		System.out.println("En küçük sayı: " + result);

	}

	public static double minimum(double x, double y) {
		double minimumValue = x;
		if (y < minimumValue)
			minimumValue = y;

		return minimumValue;

	}

}