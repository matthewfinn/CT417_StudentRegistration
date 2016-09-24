package ie.nuigalway.mfinn.StudentRegistration;

public class Student {
	private final String name;
	private final String DOB;
	private final int age;
	private String username;
	private final String ID;

	Student(String nm, String dob, int a, String id) {

		name = nm;
		DOB = dob;
		age = a;
		ID = id;

	}

	String getName() {
		return this.name;
	}

	String getDOB() {
		return this.DOB;
	}

	int getAge() {
		return this.age;
	}

	String getUsername() {
		this.username = this.age + this.ID;
		return username;
	}
}
