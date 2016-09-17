import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		int lastNumber;
		int square;
		int cube;
		String continueInput = "y";
		Scanner scanlastNumber = new Scanner(System.in);
		Scanner scanContinue = new Scanner(System.in);

		while (continueInput.equalsIgnoreCase("y")) {

			System.out.println("Please enter an integer");

			lastNumber = scanlastNumber.nextInt();

			System.out.println("Number    Squared    Cubed");
			System.out.println("======    =======    ======");

			for (int i = 1; i <= lastNumber; i++) {
				square = i * i;
				cube = i * i * i;
				System.out.println(i + "           " + square + "           " + cube);
			}

			System.out.println("Do you want to continue Y/N?");
			continueInput = scanContinue.next();
		}
	}

}