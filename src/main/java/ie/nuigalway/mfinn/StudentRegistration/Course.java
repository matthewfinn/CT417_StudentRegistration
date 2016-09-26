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
	private int length;
	private ArrayList <Student> students;

	public Course(String name, DateTime startDate, DateTime endDate, int len) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.length = len;
		this.modules = new ArrayList<Module>();
		this.students = new ArrayList<Student>();
	}

	// Getter Methods
	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}


	public int getLength() {

		return length;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	// Setter Methods
	public void setName(String nm) {
		this.name = nm;
	}

	public void setStart(DateTime sd) {
		this.startDate = sd;
	}

	public void setEnd(DateTime ed) {
		this.endDate = ed;
	}

	public void setLength(int len) {
		this.length = len;
	}

	public void setModules(ArrayList<Module> mdles) {
		this.modules = mdles;
	}

	// Method to add a module to the course
	public void addModule(Module m) {

		if(!modules.contains(m)){
			modules.add(m);

			//Temporary arraylist of student objects obtained from a module object
			ArrayList<Student> tempStudents = new ArrayList<Student>();
			tempStudents = m.getStudents();

			//adds student to a list so students registered for this course can be obtained
			for (Student temp : tempStudents) {
				if(!students.contains(temp)){ //checks if adding duplicate students
					students.add(temp);
				}
			}

		}
	}}


