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
		// course var initialsed as null as it isn't needed in this test.
		final Student testStudent = new Student("Matthew", "Finn ", "22/09/1994", 22, "13480362", null);

		// Should be "MatthewFinn22"
		actualUsername = testStudent.getUsername();

		// Is "MatthewFinn22"
		expectedUsername = testStudent.getFirstName() + testStudent.getSurname() + testStudent.getAge();

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
