package ie.nuigalway.mfinn.StudentRegistration;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class StudentRegistrationTest extends TestCase {

	public void usernameTest(String testName) {

		final Student testStudent = new Student("A", "B", 21, "AVC123");
		final String testUsername = testStudent.getUsername();

		System.out.println(testStudent.getUsername());
	}

}
