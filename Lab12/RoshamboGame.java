package Lab12;

import java.util.Scanner;

public class RoshamboGame {
	
	static int wins = 0, losses = 0, ties = 0;

	public static void main(String[] args) {

		Scanner promptScanner = new Scanner(System.in);
		String prompt = "y";

		System.out.println("Welcome to Rock Paper Scissors!");
		Scanner NameScanner = new Scanner(System.in);
		Scanner OpponentScanner = new Scanner(System.in);

		System.out.println("\nPlease enter your name:");
		String ChoiceOfName = NameScanner.next();
		System.out.println("\nWould you like to play against a random or a rock?");
		String ChoiceOfOpponent = OpponentScanner.next();

		do {
			Player opponent;
			Player user = new ScannerPlayer(ChoiceOfName);

			switch (ChoiceOfOpponent) {
			case "random":
				opponent = new RandomPlayer(ChoiceOfOpponent);
				break;
			case "rock":
				opponent = new RockPlayer(ChoiceOfOpponent);
				break;
			default:
				throw new IllegalArgumentException("Must type 'random' or 'rock'.");
			}

			String userChoice = user.generateRoshambo().toString();	
			String opponentChoice = opponent.generateRoshambo().toString();

			System.out.println("\n" + user.getPlayerName() + ": " + userChoice);
			System.out.println(opponent.getPlayerName() + ": " + opponentChoice + "\n");
			System.out.println(theResults(userChoice, opponentChoice));
			
			System.out.println("\n**SCOREBOARD**\n");
			System.out.println("Wins: " + wins);
			System.out.println("Losses: " + losses);
			System.out.println("Ties: " + ties);

			System.out.println("\nDo you wanna play again? (y/n)");
			prompt = promptScanner.next();
		} while (prompt.equalsIgnoreCase("y"));

		System.out.println("\nGoodbye..");
	}

	public static String theResults(String userChoice, String opponentChoice) {
		if (userChoice.equals(opponentChoice)) {
			ties ++;
			return "TIE!";
		} else if ((userChoice.equals("Rock")) & (opponentChoice.equals("Scissors"))) {
			wins ++;
			return "ROCK beats SCISSORS... You Win!";
		} else if ((userChoice.equals("Rock")) & (opponentChoice.equals("Paper"))) {
			losses ++;
			return "PAPER beats ROCK... You Lose!";
		} else if ((userChoice.equals("Paper")) & (opponentChoice.equals("Rock"))) {
			wins ++;
			return "PAPER beats ROCK... You Win!";
		} else if ((userChoice.equals("Paper")) & (opponentChoice.equals("Scissors"))) {
			losses ++;
			return "SCISSORS beats PAPER... You Lose!";
		} else if ((userChoice.equals("Scissors")) & (opponentChoice.equals("Paper"))) {
			wins ++;
			return "SCISSORS beats PAPER... You Win!";
		} else {
			losses ++;
			return "ROCK beats SCISSORS... You Lose!";
		}
	}
}