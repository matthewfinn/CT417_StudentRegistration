/**
 *
 * COPYRIGHT (C) 2016 Matthew Finn. All Rights Reserved.
 *
 * */

package ie.nuigalway.mfinn.StudentRegistration;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {

	private String name;
	private ArrayList<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	private ArrayList<Student> students;

	public Course(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public void setStart(DateTime sd) {
		this.startDate = sd;
	}

	public void setEnd(DateTime ed) {
		this.endDate = ed;
	}

	public void setModules(ArrayList<Module> mdles) {
		this.modules = mdles;
	}

	public void addModule(Module module) {
		modules.add(module);
	}

	public void addStudent(Student stu) {
		students.add(stu);
	}
}
