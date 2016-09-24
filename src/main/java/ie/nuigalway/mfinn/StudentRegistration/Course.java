package ie.nuigalway.mfinn.StudentRegistration;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {

	private final String name;
	private final ArrayList<Module> modules;
	private final DateTime startDate;
	private final DateTime endDate;

	public Course(String name, ArrayList<Module> module, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.modules = module;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public ArrayList<Module> addModule(Module module) {
		modules.add(module);
		return modules;
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

}
