package tr.org.linux.kamp.enumCalculation;

public enum Calculation {
	TOPLA, CIKAR, CARP, BOL;
	
	double calculation(int x,int y) {
		switch(this) {
		case TOPLA:
			return x+y;
		case CIKAR:
			return x-y;
		case CARP:
			return x*y;
		case BOL:
			return ((1.0) * x) / y;
		default:
			return x;
		}
			
				
	}
}


