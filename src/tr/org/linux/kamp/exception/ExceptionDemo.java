package tr.org.linux.kamp.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		
		
		int array[] = {1};
		int yas = -5;
		
		//System.out.println("Bir sayi giriniz: ");
		
		try {
			methodB();
			methodA();
			if(yas < 0) {
				throw new MyException();
			}
			//System.out.println(array[array.length]);
			//int sayi = input.nextInt();
			//array[95] = 5;
			//int bolum = a/b;
		
		catch(ArithmeticException e){
			System.out.println("Sıfıra bolme hatası yakalandı.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayin boyutu aşıldı.");
		}catch(InputMismatchException e) {
			System.out.println("Girdi hatası.");
		}catch(MyException e){
			System.out.println(e.getMessage());
			return; //finally > return
		}finally { 
			System.out.println("Ne olursa");
		}
		
		
		System.out.println("Try-catch bloğu bitti.");
	}
	
	public static void methodA() throws ArithmeticException{
		System.out.println("Method A");
		int a = 5/0;
	}
	public static void methodB() {
		System.out.println("Method B");
		
		try {
			int a = 5/0;
		}catch(ArithmeticException e){
			System.out.println("Hata methodB de yakalandı.");
		}
	}

}
