/**
 *
 * COPYRIGHT (C) 2016 Matthew Finn. All Rights Reserved.
 *
 * */

package ie.nuigalway.mfinn.StudentRegistration;

import java.util.ArrayList;

public class Student {
	private final String name;
	private final String DOB;
	private final int age;
	private final String ID;
	private String username;
	private ArrayList<String> modules;

	public Student(String name, String dOB, int age, String iD) {
		this.name = name;
		this.DOB = dOB;
		this.age = age;
		this.ID = iD;
		this.username = setUsername();
	}

	public String setUsername() {

		username = this.getName() + this.getAge();
		return username;
	}

	public String getUsername() {

		// username = this.getName() + this.getAge();
		return username;
	}

	public String getName() {
		return name;
	}

	public String getDOB() {
		return DOB;
	}

	public int getAge() {
		return age;
	}

	public String getID() {
		return ID;
	}

}
