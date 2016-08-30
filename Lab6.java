import java.util.Scanner;

public class Lab6 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String englishWord = scanner.next();
		
		String pigLatinWord = translateWord(englishWord);
		System.out.println(pigLatinWord);
		
	}

	//This method takes any single English word and translates it to a Pig Latin word.
	
	
	public static String translateWord(String englishWord) {
		String latinWord = englishWord.toLowerCase();

		
		char firstChar = latinWord.charAt(0);
		if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
			latinWord = latinWord.concat("way");
			
			
		}
		
		else{
			System.out.println("You have entered a consonant");
			for(int i=0; i< latinWord.length(); i ++){
				char x = latinWord.charAt(i);
				if( !  (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')){
					
				}
				
				
			}

		}
		return latinWord;
	}

}