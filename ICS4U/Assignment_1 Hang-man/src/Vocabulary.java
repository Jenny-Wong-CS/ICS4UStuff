import java.util.Random;
import java.util.Scanner;

public class Vocabulary {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub

		Words.createOutputFile("Vocabulary_Library.txt", true);
		Words.openInputFile("Vocabulary_Library.txt");
		String line = Words.readLine();
		int numLines = 0;

		while (line != null) {
			numLines++;
			line = Words.readLine();
		}
		Words.closeInputFile();

		String[] Vocabulary = new String[numLines];

		Words.openInputFile("Vocabulary_Library.txt");
		for (int i = 0; i < numLines; i++) {
			Vocabulary[i] = Words.readLine();
			Words.closeInputFile();
		}


		Random rand = new Random();
		Scanner Scan1 = new Scanner(System.in);
		//random chosen word
		String Word;

		//letter you guessed
		String Guess;


		System.out.println("input guess: ");
		Guess = Scan1.nextLine();

		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; )
			Vocabulary[i] = Word;


		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
			if (Word.contains(Guess)) {
				System.out.println("The letter " + Guess + "is in the word");
			} else {
				System.out.println("Try again!");
			}
		}

		boolean Blank = false;
		for (int i = 0; i < Word.length(); i++) {
			char Letter = Word.charAt(i);
			if (Word.indexOf(Letter)) {
				System.out.println(Letter);
			} else {
				System.out.print("-");
				Blank = true;
			}
		}
		return Blank;


	}
}


