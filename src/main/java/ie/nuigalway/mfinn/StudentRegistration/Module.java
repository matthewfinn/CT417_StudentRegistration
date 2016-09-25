/**
 *
 * COPYRIGHT (C) 2016 Matthew Finn. All Rights Reserved.
 *
 * */

package ie.nuigalway.mfinn.StudentRegistration;

import java.util.ArrayList;

public class Module {

	private String name;
	private String id;
	private ArrayList<Student> students;

	public Module(String name, String id, ArrayList<Student> students) {
		this.name = name;
		this.id = id;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

}
