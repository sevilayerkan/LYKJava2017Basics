package tr.org.linux.kamp.string;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = "f@g.co";
		
		System.out.println(isEmailValid(mail));
		
	}
	
	public static boolean isEmailValid(String str) {
		if(str.contains(" ")) {
			return false;
		}
		if(!str.contains("@")) {
			return false;
		}
		if(!str.contains(".")) {
			return false;
		}
		if(str.startsWith("@") || str.startsWith(" ") ) {
			return false;
		}
		if(!(str.indexOf("@") + 1 < str.indexOf("."))  ) {
			return false;
		}
		if((str.length() - str.lastIndexOf('.')  <= 2)   ) {
			return false;
		}
		
		
		
		return true;
		
	}
	
	

}
