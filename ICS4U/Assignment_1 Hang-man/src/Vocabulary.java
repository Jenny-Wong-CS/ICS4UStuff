import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
	public static String Word;
	public static char Guess;
	public static char[] Letters;
	public static String Hidden;
	public static int Length;
	public static String Temp;

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

		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
			Vocabulary[i] = Word;
		}

		Length = Word.length();
		Letters = new char[Length];
		for (int i = 0; i < Word.length(); i++) {
			Letters[i] = '-';
		}

		Hidden = String.valueOf(Letters);
		boolean Flag;
		while(!Hidden.equals(Word)) {
            Flag = false;
            System.out.println(Hidden);
            System.out.print("input guess: ");
            Temp = Scan1.nextLine( );
			Guess = Temp.charAt(0);
			for(int i = 0; i< Word.length(); i++){
				if(Word.charAt(i) == Guess){
					Letters[i] = Guess;
					Flag = true;
				}
			}

			if(!Flag) {
				System.out.print(Guess + " is not in the word.");
			}
			Hidden = String.valueOf(Letters);
		}

	}
}
