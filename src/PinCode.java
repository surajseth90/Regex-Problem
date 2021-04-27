import java.util.Scanner;

public class PinCode {
	
	public static void validPinCode() {
		Scanner scanner = new Scanner(System.in);
		String validPinCodeCondition = "[0-9]{6}";
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
