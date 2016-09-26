/**
 *
 * COPYRIGHT (C) 2016 Matthew Finn. All Rights Reserved.
 *
 * */

package ie.nuigalway.mfinn.StudentRegistration;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String surname;
	private String DOB;
	private int age;
	private String ID;
	private String username;
	private Course course;
	private ArrayList<Module> modules;

	public Student(String fn, String sn, String dOB, int age, String iD, Course c) {
		this.firstName = fn;
		this.surname = sn;
		this.DOB = dOB;
		this.age = age;
		this.ID = iD;
		this.course = c;
		this.username = getUsername();
	}

	// Getter methods
	public String getUsername() {
		setUsername();
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
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

	public Course getCourse() {
		return course;
	}

	// Setter methods
	public void setFirstName(String fn) {
		this.firstName = fn;
	}

	public void setSurname(String sn) {
		this.surname = sn;
	}

	public void setDOB(String dob) {
		this.DOB = dob;
	}

	public void setUsername() {
		username = this.getFirstName() + this.getSurname() + this.getAge();
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void setID(String id) {
		this.ID = id;
	}

	public void setCourse(Course c) {
		this.course = c;
	}

	// Method to add a module to list of modules they're taking
	public void addModule(Module mod) {
		modules.add(mod);
	}

	// toString method concatenates their first name & surname
	@Override
	public String toString() {
		return this.firstName + " " + this.surname;

	}
}
