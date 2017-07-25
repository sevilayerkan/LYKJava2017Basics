package tr.org.linux.kamp.enums;

public class DaysTest {
	
	static Day day;
	
	public DaysTest(Day day) {
		this.day = day;
	}
	
	public static void tellAboutDay() {
		switch(day) {
		case PAZARTESI:
			System.out.println("pazartesiii");
			break;
		case SALI:
			System.out.println("salı");
			break;
		default:
			System.out.println("diğerleri");
		
			
		}
	}
	
	public static void main(String[] args) {
		DaysTest firstDay = new DaysTest(Day.PAZARTESI);
		firstDay.tellAboutDay();
	}
}
