package Lab15;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int menuChoice;
		String countryInput;
		ArrayList<String> countries = new ArrayList<String>();

		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
		System.out.println("Enter menu number: ");

		menuChoice = scanner.nextInt();

		while (menuChoice != 3) {

			switch (menuChoice) {
			case (1):
				System.out.println();
				CountriesTextFile words = new CountriesTextFile();
				countries = words.getCountryList();
				for (String word : countries) {
					System.out.println(word);
				}
				System.out.println();
				break;
			case (2):
				System.out.println("Enter a country: ");
				countryInput = scanner2.nextLine();
				CountriesTextFile words2 = new CountriesTextFile();
				words2.saveCountryList(countryInput);
				System.out.println("This country has been saved!");
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
			System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
			System.out.println("Enter menu number: ");
			menuChoice = scanner.nextInt();
		}
		System.out.println("Goodbye..");
	}
}