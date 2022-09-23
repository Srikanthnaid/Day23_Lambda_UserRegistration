package UserRegistrationLambda;

public class UserMain {
	public static void main(String[] args) {

		/*
		 * Creating object of userDetails class
		 */
		UserRegistration user = new UserRegistration();

		/**
		 * calling firstName method to ensure valid first name
		 */
		user.firstName();
		/**
		 * calling LastName method to ensure valid Last name
		 */
		user.lastName();
		/**
		 * calling email method to ensure valid email
		 */
		user.email();
		/**
		 * calling moblieNumber method to ensure valid mobile Number
		 */
		user.moblieNumber();
		/**
		 * calling password method to ensure valid password of minimum 8 characters
		 */
		user.password();
		/**
		 * calling password method to ensure valid password of minimum 8 characters and
		 * have at least 1 uppercase
		 */
		user.password();
	}
}
