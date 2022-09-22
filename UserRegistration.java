package UserRegistrationLambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner s = new Scanner(System.in);

	/**
	 * Method to Enter FirstName First Name should start with capital and has
	 * minimum 3 characters if entered firstName matches the pattern then it gives
	 * true value else it gives false Invalid first name
	 */
	public void firstName() {
		while (true) {
			System.out.println("Please enter your firstName:");
			String firstName = s.next();
			boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}", firstName);
			if (result) {
				System.out.println("Valid");

				System.out.println("Enter last Name : ");
				String lastName = s.next();
				boolean result1 = Pattern.matches("[A-Z][a-z]{2,}", lastName);

				System.out.println("Valid Last Name");

				System.out.println(
						"Invalid ... Please Enter Valid Last Name\n 1.lastName atleast having one Cap letter i,e: [A-Z]{1} \n"
								+ "2.lastName having atleast 3Characters i,e:[A-Z{1}[a-z]{2,}" + "]");
			} else {
				System.out.println(
						"Invalid please enter firstName bellow mention coditions  \n 1. FirstName Start with Cap[A-Z]{1} \n"
								+ "2.firstname having minimum 3 characters");
			}
			return;
		}
	}

	/**
	 * Method to Enter LastName Last Name should start with capital and has minimum
	 * 3 characters if entered lastName matches the pattern then it gives true value
	 * else it gives false Invalid Last name
	 */
	public void lastName() {
		while (true) {
			System.out.println("Enter last Name : ");
			String lastName = s.next();
			boolean result = Pattern.matches("[A-Z][a-z]{2,}", lastName);
			if (result) {
				System.out.println("Valid Last Name");
			} else {
				System.out.println(
						"Invalid ... Please Enter Valid Last Name\n 1.lastName atleast having one Cap letter i,e: [A-Z]{1} \n"
								+ "2.lastName having atleast 3Characters i,e:[A-Z{1}[a-z]{2,}" + "]");
			}
			return;
		}

	}
}
