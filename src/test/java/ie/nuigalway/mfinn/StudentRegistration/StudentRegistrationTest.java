package ie.nuigalway.mfinn.StudentRegistration;

import org.junit.Test;

import junit.framework.TestCase;

public class StudentRegistrationTest extends TestCase {

	String testUsername, testUsername2;

	@Override
	public void setUp() {
		final Student testStudent = new Student("A", "B", 21, "AVC123");
		testUsername = testStudent.setUsername();
		testUsername2 = testStudent.getName() + testStudent.getAge();
	}

	@Test
	public void testUsername(String testName) {
		assertEquals(testUsername, testUsername2);
	}

}
