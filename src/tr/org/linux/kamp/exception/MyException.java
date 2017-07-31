package tr.org.linux.kamp.exception;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "Hata MyException classında yakalandı.";
	}
}
