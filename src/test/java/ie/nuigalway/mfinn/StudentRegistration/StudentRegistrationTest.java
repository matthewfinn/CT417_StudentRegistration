/**
 *
 * COPYRIGHT (C) 2016 Matthew Finn. All Rights Reserved.
 *
 * */

package ie.nuigalway.mfinn.StudentRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentRegistrationTest {

	static String expectedUsername;
	static String actualUsername;

	/**
	 * Initialises student object with parameters and the expected username to
	 * test by concatenating 2 strings
	 */
	@Before
	public void onSetUp() {
		final Student testStudent = new Student("A", "B", 21, "AVC123");
		actualUsername = testStudent.getUsername();
		expectedUsername = testStudent.getName() + testStudent.getAge();
	}

	/**
	 * Asserts expected vs. actual
	 *
	 * @return true if they're equal, false if they're not
	 */
	@Test
	public void testUsername() {
		assertTrue(expectedUsername.equals(actualUsername));
	}

}
