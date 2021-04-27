import java.util.Scanner;

public class Email {

	public static void validEmail() {
		Scanner scanner = new Scanner(System.in);
		String emailCondition = "[a-z]{3,}([a-z\\.\\+\\-\\_]{4,})?[@](bridgelabz)(.co)([a-z.]{3})?";
		System.out.println("Please enter your valid email ID :");
		String valid = scanner.nextLine();
		CheckCondition.checkCondition(valid,emailCondition);
		if(CheckCondition.checkCondition(valid,emailCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format eg. abc.xyz@bridgelabz.co.in (.xyz and .in are optional) ");
			Email.validEmail();
		}
	}
}
