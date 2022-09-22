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
		 * calling lasttName method to ensure valid first name
		 */
		user.lastName();

	}

}
