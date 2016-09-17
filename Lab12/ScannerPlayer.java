package Lab12;

import java.util.Scanner;

public class ScannerPlayer extends Player {
	Scanner sc = new Scanner(System.in);

	public ScannerPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		System.out.println("rock,paper, or scissors?");
		String userInput = sc.next();
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'r' || firstLetter == 'p' || firstLetter == 's') {
			switch (firstLetter) {
			case 'r':
				return Roshambo.ROCK;
			case 'p':
				return Roshambo.PAPER;
			case 's':
				return Roshambo.SCISSORS;
			}
		}
		return generateRoshambo();
	}
}