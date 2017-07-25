package tr.org.linux.kamp.garbage;

public class GcTest {
	int value;
	
	@Override
	
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Garbage collector çalıştı.");
	}
}
