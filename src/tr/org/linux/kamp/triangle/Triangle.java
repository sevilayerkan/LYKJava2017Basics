package tr.org.linux.kamp.triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("İki kenar değeri giriniz: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Hesaplanması istenen degeri giriniz: ");
		String secim = input.next();
		
		switch(secim) {
			case "hipotenus":
				System.out.println("Hipotenüs = " + getHypo(a,b));
				break;
			case "alan":
				System.out.println("Alan = " + getArea(a,b));
				break;
			case "cevre":
				System.out.println("Cevre = " + getPerimeter(a,b));
				break;
			default:
				System.out.println("Lütfen cevre ,alan veya hipotenus yazınız.");
		}
		
		/*System.out.println("Hipotenüs = " + getHypo(a,b));
		System.out.println("Alan = " + getArea(a,b));
		System.out.println("Çevre = " + getPerimeter(a,b));*/
		
	}
	
	public static int getHypo(int a,int b) {
		return (int)Math.hypot(a, b);
	}
	public static int getArea(int a,int b) {
		return a*b/2;
	}
	public static int getPerimeter(int a,int b) {
		return getHypo(a,b)+a+b;
	}
	

}
