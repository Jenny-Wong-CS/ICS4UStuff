
public class Vocabulary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Words.createOutputFile("Vocabulary_Library.txt", true);
		Words.print("Example");
		Words.closeOutputFile();
		
		
		//first we need to count how many lines are in the file
		
		Words.openInputFile("Vocabulary_Library.txt");
		
		String line = Words.readLine();
		int numLines = 0;
		
		while(line != null);
		{
			System.out.println(line.toUpperCase());
			numLines++;
			line = Words.readLine();
		}
		System.out.println(numLines);
		
		Words.closeInputFile();
		//now we can store these lines in an array
		
		String[] Vocabulary =  new String[numLines];
		
		Words.openInputFile("Vocabulary_Library.txt");
		for(int i =0; i < numLines; i++)
			Vocabulary[i] = Words.readLine();
		Words.closeInputFile();
		
		//now we can do things with the data
		for(int i = 0; i < numLines; i++)
			System.out.println(Vocabulary[i].toLowerCase());
		
		
	}

}