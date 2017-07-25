package tr.org.linux.kamp.interest;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		for(int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1.0 + rate, year);
			
			System.out.println(amount);
		}
	}

}
