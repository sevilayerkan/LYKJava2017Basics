package tr.org.linux.kamp.arrays;

import java.util.Random;

public class ArrayDemo {
	
	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void main(String[] args) {
		generateArray();
		printArray();
		
		/*sortArray();
		
		System.out.println("");
		
		printArray();
		
		System.out.println("");
		
		int item = 5;
		if(searchItem(item)) {
			System.out.println(item + " dizi içinde bulundu.");
		}
		else {
			System.out.println(item + " dizi içinde bulunamadı.");
		}
		
		System.out.println("");
		
		int index = lastIndexOf(item);
		if(index != -1) {
			System.out.println(item + " elemanı " + index + " adresinde bulundu.");
		}
		else {
			System.out.println(item + " elemanı adresinde bulunamadı.");
		}*/
		
		System.out.println("");
		
		int minimum = minOfArray();
		System.out.println("Arrayin en küçük elemanı " + minimum + " dur.");
		int maximum = maxOfArray();
		System.out.println("Arrayin en büyük elemanı " + maximum + " dur.");
		double ortalamaMaxMin = ortalama();
		System.out.println("Max ve minin ortalaması " + ortalamaMaxMin + " dir.");
		
	}

	private static int maxOfArray() {
		int max = 0;
		for(int i = 0; i < array.length ;i++) {
			for(int j = 0; j < array.length ; j++) {
				if(array[j] > max) {
					max = array[j];
				}
				
			}
		}
		return max;
	}

	private static int minOfArray() {
		int min = array[0];
		for(int i = 0; i < array.length ;i++) {
			for(int j = 0; j < array.length ; j++) {
				if(array[j] < min) {
					min = array[j];
				}
				
			}
		}
		return min;
	}
	
	private static double ortalama() {
		double ortalama = (double)(minOfArray() + maxOfArray()) /2.0;
		return ortalama;
	}

	private static int lastIndexOf(int item) {
		for(int i = (array.length-1); i >= 0 ; i--) {
			if(array[i] == item) {
				return i;
			}
			
		}
		return -1;
	}

	private static boolean searchItem(int item) {
		for(int i = 0; i< array.length ; i++) {
			if(array[i] == item) {
				return true;
			}
		}
		
		return false;
		
	}

	public static void generateArray() {
		int item;
		for(int i = 0; i < array.length ; i++) {
			item = rand.nextInt(10);
			array[i] = item;
		}
		
	}
	
	public static void printArray() {
		for(int i = 0; i < array.length ;i++) {
			System.out.print(array[i] + "\t");
		}
	}
	
	public static void sortArray() {
		int temp;
		for(int i = 0; i < array.length ;i++) {
			for(int j = 1; j < array.length ; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
	}
	
	
	
}
