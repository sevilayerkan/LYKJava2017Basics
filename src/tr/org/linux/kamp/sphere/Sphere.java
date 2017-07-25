package tr.org.linux.kamp.sphere;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hacim hesabı için bir yarıçap değeri giriniz: ");
		int radius = input.nextInt();
		
		System.out.println("Hacim = "+ getVolume(radius));
		
	}
	
	public static double getVolume(int r) {
		return 1.0 * 4 * Math.PI * Math.pow(r, 3) / 3;
	}

}
