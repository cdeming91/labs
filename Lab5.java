import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String yesOrNo;
		String userInput = "numberOfSides";
		
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();
		do {
			System.out.println("How many sides should your dice have?");
			int numberOfSides = scanner.nextInt();
	
			System.out.println("Do you think the odds are in your favor? (y/n)");
			yesOrNo = scanner.next();
		} while (userInput.equals("y"));
	
	
	}

	//public static int rollADie(int numberOfSides) {
		
		
}

