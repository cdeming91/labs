import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int length = scanner.nextInt();
		
		System.out.println("Enter Width:");
		int width = scanner.nextInt();
		
		int area = width * length;
		
		int perimeter = 2 * (length+width);
		
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);
		

	}

}
