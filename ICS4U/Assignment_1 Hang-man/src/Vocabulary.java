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
		for(int i = 0; i < numLines; i++)
			Vocabulary[i] = Words.readLine();
		Words.closeInputFile();


        Random rand = new Random();
        //String Guess;

        for(int i = rand.nextInt((50 - 1) +1) ; i < numLines;)

        System.out.println("the chosen word is: " + Vocabulary[i] );



        Scanner scan1 = new Scanner(System.in);
        char Guess;
        System.out.println("Take a guess:");
        Guess = scan1.nextLine();


        if ()






//		System.out.print(Vocabulary[i]);
//		System.out.print("Insert a letter: ");
//		Selection = scan1.nextLine();
//		System.out.print("Your first letter guess is : " + Selection);





	}


}