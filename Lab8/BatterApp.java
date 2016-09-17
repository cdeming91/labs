package Lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		
		String atBatPrompt = "y";
		String anotherBatterPrompt = "y";
		int atBatCounter = 0;
		int atBatResult;
		int numberOfHits = 0;
		int numberOfBases = 0;
		//String playerName;
		ArrayList<Batter> batterList = new ArrayList<Batter>();
		ArrayList<Integer> statsList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Batting Average Calculator!\n");
		
		while(anotherBatterPrompt.equalsIgnoreCase("y")){
			String playerName;
			System.out.println("Enter the player's name: ");
			playerName = sc.nextLine();
			atBatPrompt = "y";
			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			
			while(atBatPrompt.equalsIgnoreCase("y")){
//				atBatCounter++;
//				System.out.println("Result for at-bat " + atBatCounter + ": ");
//				atBatResult = sc.nextInt();
				
				atBatCounter++;
				System.out.println("Result for at-bat " + atBatCounter + ": ");
				atBatResult = sc.nextInt();
				statsList.add(atBatResult);
				
				System.out.println("Another at-bat? (y/n): ");
				atBatPrompt = sc.next();
			}
			batterList.add(new Batter(playerName, statsList));
			
			System.out.println("Do you want to add another batter? (y/n): ");
			anotherBatterPrompt = sc.next();
		}
		
		for(Batter batter: batterList){
			System.out.println(batter.getName());
			//System.out.println("Batting Average: " + String.format("%.3f",batter.calcBattingAverage()));
			//System.out.println("Slugging Percentage: " + String.format("%.3f", batter.calcSluggingAverage()));
			System.out.println();
		}
//		
//		do{
//			
//			statsList.add(atBatResult);
//			
//		}
//		while(atBatPrompt.equalsIgnoreCase("y"));
//		
//		for(int value: statsList){
//			if(value>0){
//				numberOfHits++;
//				numberOfBases += value;
//			}
//		}
//		double battingAverage = (double) numberOfHits / (double) statsList.size();
//		System.out.println("Name: " + batter.getName());
//		System.out.println("Batting Average: " + String.format("%.3f",battingAverage));
//		
//		double sluggingAverage = (double) numberOfBases / (double) statsList.size();
//		System.out.println("Slugging Percentage: " + String.format("%.3f",sluggingAverage));

	}
}