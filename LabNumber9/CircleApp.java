package LabNumber9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");
		String continuePrompt = "y";
		int counter;
		String finalCircumference = "";
		String finalArea = "";

		do {
			String correction = "n";
			while (correction.equals("n")) {
				try {
					System.out.println("Enter radius: ");
					double userInput = scanner.nextDouble();
					finalCircumference = Circle.getFormattedCircumference(userInput);
					finalArea = Circle.getFormattedArea(userInput);
					correction = "y";

				} catch (InputMismatchException ex) {
					System.out.println("Invalid input. Please try again: ");
					scanner.next();

				}
			}

			counter = Circle.getObjectCount();
			System.out.println("Circumference: " + finalCircumference);
			System.out.println("Area: " + finalArea);
			System.out.println("Do you wanna go again? y/n");
			continuePrompt = scanner.next();

		} while (continuePrompt.equalsIgnoreCase("y"));

		System.out.println("\nGoodbye. You created " + counter + " Circle object(s).");
		scanner.close();

	}
}