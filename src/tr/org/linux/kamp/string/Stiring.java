package tr.org.linux.kamp.string;

public class Stiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = Integer.toString(1555579256);
		System.out.println(str);
		String hello = "hello world!";
		System.out.println(hello);
		System.out.println(hello.toUpperCase());
		System.out.println(hello);
		
		String a = "hello";
		String b = "hello";
		boolean karsi = "hello" == "hello" ;
		boolean karsiab = a == b;
		
		//System.out.println(karsi);
		System.out.println(karsiab);
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(c==d);
		
		System.out.println(hello.substring(hello.indexOf(' ')+1,hello.length()));
		
		System.out.println(hello.indexOf(' '));
		
		System.out.println(hello.charAt(hello.length()-1));
		
		System.out.println(hello.indexOf('e')); //ilk e nin değerini verir.
		System.out.println(hello.indexOf('l',3));
		
		
		System.out.println(hello.substring(0,2) == "he");
		System.out.println(hello.substring(0,2).equals("he"));
		
		
		
	}

}
