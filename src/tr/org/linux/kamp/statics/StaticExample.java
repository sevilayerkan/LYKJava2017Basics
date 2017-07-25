package tr.org.linux.kamp.statics;

public class StaticExample {
	
	public static String myStaticString = "BU BİR STATİK STRING";
	
	public static String myStaticStringMethod() {
		return "Bu bir STATİK METOD";
	}
	
	static {
		System.out.println("Bu bir statik metod.");
	}
	static {
		System.out.println("Bu bir statik metod.");
	}
	static {
		int x = 5;
		System.out.println(x);
		System.out.println("Bu bir statik metod.");
	}

}
