package UserRegistrationLambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	public void firstNameValidator() throws CustomException {
		try {
			String firstName = "Srikanth";
			assertEquals(true, UserRegistration.firstName(firstName));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 1. Test case for lastName validation throws CustomException 2. checks
	 * firstName for condition if matches it satisfied 3. else it throws exception
	 * and print message from Throwable class
	 */

	@Test
	public void lastNameValidator() throws CustomException {
		try {
			String lastName = "Naidu";
			assertEquals(true, UserRegistration.lastName(lastName));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 1. Test case for email validation throws CustomException 2. checks firstName
	 * for condition if matches it satisfied 3. else it throws exception and print
	 * message from Throwable class
	 */

	@Test
	public void emailValidator() throws CustomException {
		try {
			String email = "srikanth019@gmail.com";
			assertEquals(true, UserRegistration.email(email));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 1. Test case for password validation throws CustomException 2. checks
	 * firstName for condition if matches it satisfied 3. else it throws exception
	 * and print message from Throwable class
	 */

	@Test
	public void passwordValidator() throws CustomException {
		try {
			String password = "Sri@9";
			assertEquals(true, UserRegistration.password(password));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
