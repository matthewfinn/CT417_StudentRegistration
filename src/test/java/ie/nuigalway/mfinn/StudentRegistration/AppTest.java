package ie.nuigalway.mfinn.StudentRegistration;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 * @return
	 */
	public void NameTest(String testName) {

		final Student testStudent = new Student("A", "B", 21, "AVC123");

		System.out.println(testStudent.getUsername());
	}

}
