package tr.org.linux.kamp.ogrenciOtomasyon;

public class StudentException extends Exception {
	
	String getMessageForId() {
		return "Kimlik numarası 11 haneli olmalı.";
	}
}
