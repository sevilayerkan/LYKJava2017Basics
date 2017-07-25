package tr.org.linux.kamp.calculator;

import java.util.Scanner;

public class PrimativeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean ctn = true;
		while (ctn) {
			System.out.println("Bir sayı giriniz");
			double inputNumber1 = input.nextDouble();
			System.out.println("Bir işlem giriniz");
			String inputFunction = input.next();

			double result = 0;
			double inputNumber2 = 0;
			switch (inputFunction) {
			case "+":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 + inputNumber2;
				System.out.println(result);
				break;
			case "-":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 - inputNumber2;
				System.out.println(result);
				break;
			case "*":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 * inputNumber2;
				System.out.println(result);
				break;
			case "/":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 / inputNumber2;
				System.out.println(result);
				break;
			default:
				System.out.println("Lütfen + - * / işlemlerinden birini yapın");

			}

		}

	}

}