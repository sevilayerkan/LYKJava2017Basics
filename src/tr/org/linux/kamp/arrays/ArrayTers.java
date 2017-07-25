package tr.org.linux.kamp.arrays;

import java.util.Arrays;

public class ArrayTers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {8,5,6,0,7,6,3};
		System.out.println(Arrays.toString(myArray));
		reverse(myArray);
		System.out.println(Arrays.toString(myArray));
	}
	
	public static int[] reverse(int[] paramArray) {
		int temp;
		for(int i = 0; i < paramArray.length/2; i++) {
			temp = paramArray[i];
			paramArray[i] = paramArray[paramArray.length -i -1];
			paramArray[paramArray.length - 1 -i] = temp;
		}
		
		return paramArray;
	}

}
