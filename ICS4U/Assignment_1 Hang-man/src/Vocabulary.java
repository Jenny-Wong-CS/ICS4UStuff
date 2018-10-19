//import java.util.Collections;
import java.util.Random;
//import java.util.Scanner;

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
		for(int i = 0; i < numLines; i++)
			Vocabulary[i] = Words.readLine();
		Words.closeInputFile();
		

        //String letter;
        //Scanner scan1 = new Scanner(System.in);
        //System.out.print("enter Letter: ");
		//letter = scan1.nextLine();
        //String yourRandom;

		//Random yourRandom = new Random(Vocabulary[i]);
		//String pickWord = Vocabulary[i];
		int Num = 1;

		Random rand = new Random();
		String r;
        for(int i = 0; i < numLines; i++)
        	int Chosen = rand.nextInt(51);


		System.out.println("the chosen word is: ");
		//Collections.shuffle(Vocabulary[i]);
			//String word = Vocabulary.get();






	}

}