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
	private ArrayList<Student> students; // List of students that take this course
	private ArrayList<Course> courses; // List of courses where this module is taught

	public Module(String name, String id) {
		this.name = name;
		this.id = id;

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

	public ArrayList<Course> getCourse() {
		return courses;

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

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void addStudent(Student s) {
		//if(students.isEmpty() || !students.contains(s))
		//{
		students.add(s);
		//}
		//else System.out.println("Student already registed for this module");
	}

	@Override
	public String toString() {

		return this.id + " " + this.name;
	}

}
