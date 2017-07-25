package tr.org.linux.kamp.arrays;

public class ArrayApplication {

	public static void main(String[] args) {
		arrayToPrint(initialize(5));

}
	
	public static int[][] initialize(int n){
		int[][] multi = new int[n][n];
		for(int i = 0; i < multi.length ; i++) {
			for(int j = 0; j < multi[i].length ; j++) {
				multi[i][j] = (i+1)*(j+1);
			}
		}
		
		return multi;
	}
	
	public static void arrayToPrint(int[][] multi) {
		for(int j = 0; j < multi.length ; j++) {
			for(int i = 0; i < multi[j].length  ; i++) {
				System.out.print(multi[j][i] + "\t");
			}
			System.out.println();
		}

	}
}
