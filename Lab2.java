import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Would you like to play a game? (y/n)");
		String yesOrNo = scanner.next();

		if (yesOrNo.equals ("yes"))
		{
			System.out.print("Excellent! You are walking across a field and you encounter a fire-breathing dragon!");
			System.out.print("What would you do? (Enter face the beast or run away)");
			String decision = scanner.next();
			
			if (decision.equals("face the beast"))
			{
				System.out.println("Okay, as you approach the dragon, you see that he has __ heads.");
				int heads = scanner.nextInt();
				
				System.out.println("No one has ever faced a " + heads + "-headed dragon before!");
				System.out.println("Choose your weapon. Enter slingshot or sword or bow and arrow");
				
				
				System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel its fiery ");
				System.out.println(" breath as you get closer. It stares at you with its __ eyes. (enter red or blue)");
				System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends.");
				System.out.println("You name the dragon __. (enter a name)");
				
				
			}
			
		}
		
	}
	
	
}