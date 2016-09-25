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

	/**
	 *
	 * @param name,
	 *            String object that is the name of the module
	 *
	 * @param module,
	 *            Arraylist that holds Module objects. These are the modules
	 *            that are part of the course
	 *
	 * @param startDate,
	 *            DateTime object that stores the starting date of the module
	 *
	 * @param endDate,
	 *            DateTime object that stores the end date of the module
	 */
	public Course(String name, ArrayList<Module> mdles, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.modules = mdles;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Module> getModules() {
		return modules;
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
}
