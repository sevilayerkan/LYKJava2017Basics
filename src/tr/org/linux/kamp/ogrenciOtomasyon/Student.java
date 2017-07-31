package tr.org.linux.kamp.ogrenciOtomasyon;

public class Student {
	String name;
	String id;
	int grade;

	public void idControl(String id) throws StudentException {
		if (id.length() != 11)
			throw new StudentException();
		else
			this.id = id;

	}

	public void gradeControl(int grade) {
		if (grade < 0 || grade > 100) {
			try {
				throw new StudentException();
			} catch (StudentException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessageForId());
			}
		} else {
			this.grade = grade;
		}

	}

}
