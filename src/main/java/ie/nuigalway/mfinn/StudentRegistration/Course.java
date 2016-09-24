package ie.nuigalway.mfinn.StudentRegistration;

import org.joda.time.DateTime;

public class Course {

	private final String name;
	private final String[] modules;
	private final DateTime startDate;
	private final DateTime endDate;

	Course(String nm, String[] mods, DateTime sd, DateTime ed) {

		name = nm;
		modules = mods;
		startDate = sd;
		endDate = ed;

	}

}
