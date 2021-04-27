import java.util.Scanner;

public class Email {

	public static void validEmail() {
		Scanner scanner = new Scanner(System.in);
		String emailCondition = "[a-z]{3,}[a-z\\.\\+\\-\\_]{4,}?[@](bridgelabz)(.co)(.in)?";
		System.out.println("Please enter your valid email ID :");
		String valid = scanner.nextLine();
		CheckCondition.checkCondition(valid,emailCondition);
		if(CheckCondition.checkCondition(valid,emailCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format eg. xyz@bridgelabz.co ");
			Email.validEmail();
		}
	}
}
