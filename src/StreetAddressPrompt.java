import java.util.Scanner;

public class StreetAddressPrompt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter street address:");

		int houseNumber = input.nextInt();
		String street = input.nextLine();
		input.close();

		System.out.println("house number is " + houseNumber);
		System.out.println("street is" + street);

	}

}
