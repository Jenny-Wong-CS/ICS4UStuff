//import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Vocabulary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Words.createOutputFile("Vocabulary_Library.txt", true);
		Words.openInputFile("Vocabulary_Library.txt");
		String line = Words.readLine();
		int numLines = 0;
		
		while(line != null)
		{
			numLines++;
			line = Words.readLine();
		}
		Words.closeInputFile();

		String[] Vocabulary =  new String[numLines];

		Words.openInputFile("Vocabulary_Library.txt");
		for(int i = 0; i < numLines; i++) {
			Vocabulary[i] = Words.readLine();
			Words.closeInputFile();
		}



		Random rand = new Random();

		String Word;
		String Guess;


        for(int i = rand.nextInt((50 - 1) +1); i < numLines;){
			Word = Vocabulary[i];
		}
		//Char[] Guess = Word.toCharArray();

		if (Word.contains(Guess) ) {
			System.out.println("The letter" + Guess + "is in the word");
		}


		for (int w =0; w < Word.length(); w++)
			char Guess = Word.charAt(w);
		if (Guess(Word, Guess))
			System.out.println(Guess);
		else {
			System.out.print("-");
		}


		Scanner Scan1 = new Scanner(System.in);

		System.out.println("Input letter: ");
		Guess.scan1.nextLine();




        //System.out.println("the chosen word is: " + Vocabulary[i] );



//		String Guess;
//        Scanner Scan1 = new Scanner(System.in);
//        System.out.println("Take a guess:");
//        Guess = Scan1.nextLine();
//
//		String Letter = Guess;
//        if (Letter.indexOf(Vocabulary) != -1)






//		System.out.print(Vocabulary[i]);
//		System.out.print("Insert a letter: ");
//		Selection = scan1.nextLine();
//		System.out.print("Your first letter guess is : " + Selection);





	}


}