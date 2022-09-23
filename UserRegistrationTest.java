package UserRegistrationLambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	public void firstNameValidation() {
		assertEquals(true, UserRegistration.firstName());
	}

	/**
	 * Test case for firstName
	 */
	@Test
	public void lastNameValidation() {
		assertEquals(true, UserRegistration.lastName());
	}

	/**
	 * Test case for Email
	 */
	@Test
	public void emailValidation() {
		assertEquals(true, UserRegistration.email());
	}

	/**
	 * Test case for Mobile Number
	 */
	@Test
	public void mobileNumberValidation() {
		assertEquals(true, UserRegistration.moblieNumber());
	}

	/**
	 * Test case for Password
	 */
	@Test
	public void passwordValidation() {
		assertEquals(true, UserRegistration.password());
	}
}
