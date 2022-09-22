package UserRegistrationLambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner s = new Scanner(System.in);

	public static void firstName() {
		System.out.println("Please enter your firstname: ");
		String firstName = s.next();
		boolean result = Pattern.matches("[A-Z]{1}[a-z]{2}", firstName);
		if (result) {
			System.out.println("valid");
		} else {
			System.out.println(
					"Invalid please enter firstName bellow mention coditions  \n 1. FirstName Start with Cap[A-Z]{1} \n"
							+ "2.firstname having minimum 3 characters");
		}
		s.close();
	}
}
