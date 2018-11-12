import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
	public static String Word;
	public static char Letters;
	public static boolean Contain;

	public static void main(String[] args) {
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

		//letter you guessed
		String Guess;

		System.out.print("input guess: ");
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
			 Letters = Word.charAt(i);
			 Contain = Word.contains(Guess);
			if (Contain == true) {
				System.out.println(Letters.charAt()+" ");
			} else {
				System.out.print("-");
				Blank = true;
			}
		}
		//return Blank;


	}
}

