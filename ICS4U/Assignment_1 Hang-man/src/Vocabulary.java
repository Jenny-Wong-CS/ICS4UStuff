//import java.util.Random;
//import java.util.Scanner;
//
//public class Vocabulary {
//
//	public static String Word;
//	public static char [] Letter;
//	public static char Length;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Words.createOutputFile("Vocabulary_Library.txt", true);
//		Words.openInputFile("Vocabulary_Library.txt");
//		String line = Words.readLine( );
//		int numLines = 0;
//
//		while (line != null) {
//			numLines++;
//			line = Words.readLine( );
//		}
//		Words.closeInputFile( );
//
//		String[] Vocabulary = new String[numLines];
//
//		Words.openInputFile("Vocabulary_Library.txt");
//		for (int i = 0; i < numLines; i++)
//			Vocabulary[i] = Words.readLine( );
//		Words.closeInputFile( );
//		//set up ^^^^
//
//		Random rand = new Random( );
//		Scanner Scan1 = new Scanner(System.in);
//
//		//letter you guessed
//		String Guess;
//
//		System.out.print("input letter guess: ");
//		Guess = Scan1.nextLine( );

//		Words.createOutputFile("Imputed_words.txt");
//		Words.println(Guess);
//		Words.closeOutputFile();

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; )
//			//Word = Vocabulary[i];
//				//System.out.print("the word is " + Word);
//			if (Vocabulary[i].contains(Guess)) {
//				System.out.println("The letter " + Guess + " is in the word");
//			} else {
//				System.out.println("Try again!");
//			}

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
//			Vocabulary[i] = Word;
//		}
//		if (Word.contains(Guess)) {
//			System.out.println("the letter " + Guess + " is in the word");
//		} else {
//			System.out.println("ERROR");
//		}
//
//	}

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; i++) {
//			//Vocabulary[i] = Word;
//			//int Length = 0;
//			int Length = Vocabulary[i].length();
//			Letter = new char[Length];
//			for (int j = 0; j < Length; j++) {
//				Letter[j] = '-';
//			}
//		}
//
//		String SelectWord = String.valueOf(Letter);
//
//		while(SelectWord == Word){
//			System.out.print("input letter guess: ");
//			Guess = Scan1.nextLine( );
//			for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
//				if(Word.contains(Guess)){
//					System.out.println(Vocabulary[i]);
//			}
//		}
//		}

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; )
//			Word = Vocabulary[i];
//
//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; )
//			Length = Word.charAt(i);
//			if(Word.contains(Guess, Length)){
//
//			}
//			//char temp = Word.charAt(i);
//
//
//
//
//
//
//
//	}
//}

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
//			Vocabulary[i] = Word;
//			char Letter = Word.charAt(i);
//			if (Guess ) {
//				System.out.println(Letter);
//			} else {
//				System.out.print("-");
//			}
//		}

//		for (int i = rand.nextInt((50 - 1) + 1); i < numLines; ) {
//			if (Word.contains(Guess)) {
//				System.out.println("The letter " + Guess + "is in the word");
//			} else {
//				System.out.println("Try again!");
//			}
//		}
//
//		boolean Blank = false;
//		for (int i = 0; i < Word.length(); i++) {
//			char Letter = Word.charAt(i);
//			if (Word.indexOf(Letter)) {
//				System.out.println(Letter);
//			} else {
//				System.out.print("-");
//				Blank = true;
//			}
//		}
//		return Blank;



import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
	public static String Word;
	public static char Letter;

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
		//String Word;

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
			 Letter = Word.charAt(i);
			if (Word.contains(Guess,Letter)) {
				System.out.println(Word.charAt[i]+" ");
			} else {
				System.out.print("-");
				Blank = true;
			}
		}
		return Blank;


	}
}

