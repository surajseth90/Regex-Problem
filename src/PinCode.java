import java.util.Scanner;

public class PinCode {
	
	public static void validPinCode() {
		Scanner scanner = new Scanner(System.in);
		String validPinCodeCondition = "[^A-Za-z$%^&*#@!][0-9]{2}(\\s)?[0-9]{2}[^A-Za-z$%^&*#@!]";
		System.out.println("Please enter your valid Pin code :");
		String validPinCode = scanner.nextLine();
		CheckCondition.checkCondition(validPinCode,validPinCodeCondition);
		if(CheckCondition.checkCondition(validPinCode,validPinCodeCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format eg. 000000 ");
			PinCode.validPinCode();
		}
	}
}
