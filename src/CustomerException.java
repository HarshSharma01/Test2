import java.util.Scanner;

class InputValidationException extends Exception {
	InputValidationException(String message) {
		System.out.println(message);
	}
}

public class CustomerException {

	public void checkDetails() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter contact details");
		long phone = scan.nextLong();
		System.out.println("Enter age");
		int age = scan.nextInt();
		if (age < 20 || age > 55) {
			throw new InputValidationException("Enter a valid age between 20 and 55");
		}
	}

	public static void main(String[] args) throws Exception {
		CustomerException cust = new CustomerException();
		cust.checkDetails();

	}

}
