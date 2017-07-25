package tr.org.linux.kamp.garbage;

public class Gc {

	public static void main(String[] args) throws Throwable {
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Toplam bellek: " +rt.totalMemory());
		
		// TODO Auto-generated method stub
		String str = new String("Linux yaz kampı");
		String str1 = new String("Java Programlama");
		System.out.println(str);
		str = "2017";
		System.out.println(str);
		str = str1;
		str = null; //nesnenin yaşam döngüsü bitti
		//System.gc();
		
		GcTest gcTest = new GcTest();
		gcTest.value = 1;
		gcTest = null;
		System.out.println("Boş bellek :" + rt.freeMemory());
		System.gc();
		System.out.println("Garbage collection çalıştıktan sonra boş bellek:  " + rt.freeMemory());
		//System.out.println(gcTest.value);
		//gcTest.finalize();
		
		
	}

}
