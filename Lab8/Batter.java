package Lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class Batter {

	String name;
	ArrayList<Integer> statsList = new ArrayList<Integer>();
	int atBatCounter = 0;
	int atBatResult;
	Scanner scanner = new Scanner(System.in);

	public Batter(String name, ArrayList statsList) {
		this.name = name;
		this.statsList = statsList;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList getStatsList() {
		return statsList;
	}

	public String calcBattingAverage(ArrayList firstList) {
		ArrayList<Integer> newList = firstList;
		int hitCount = 0;
		for (int value : newList) {
			if (value > 0) {
				hitCount++;
			}
		}
		double batAvg = (double) hitCount / (double) newList.size();
		return String.format("%.3f", batAvg);
	}

	public String calcSluggingAverage(ArrayList firstList) {
		ArrayList<Integer> newList = firstList;
		int baseCount = 0;
		for (int value : statsList) {
			if (value > 0) {
				baseCount += value;
			}
		}
		double slugPct = (double) baseCount / (double) newList.size();
		return String.format("%.3f", slugPct);
	}
	
	public void inputBats(){
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		atBatCounter++;
		System.out.println("Result for at-bat " + atBatCounter + ": ");
		atBatResult = scanner.nextInt();
		statsList.add(atBatResult);
	}
}