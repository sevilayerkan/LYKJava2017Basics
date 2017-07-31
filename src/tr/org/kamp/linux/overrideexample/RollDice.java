package tr.org.kamp.linux.overrideexample;

public class RollDice {
	public static void main(String[] args) {
		FairDie die1 = new FairDie();
		FairDie die2 = new FairDie();
		
		System.out.println(die1.roll()+"-"+die2.roll());
		
		GamblersDie die3 = new GamblersDie();
		GamblersDie die4 = new GamblersDie();
		
		System.out.println(die3.roll()+"-"+die3.roll());
	}
}
