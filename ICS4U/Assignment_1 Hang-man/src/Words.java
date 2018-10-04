import java.io.*;
public class Words {

	private static PrintWriter fileOut;

		public static void createOutputFile(String filename)
		{
			createOutputFile(filename,false);
			try {
				fileOut = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			}
			catch(IOException e) {
				System.out.println("***Cannot create file: " + filename + " ***");
			}
		}	
		
		public static void createOutputFile(String fileName, boolean append) {
			try {
				fileOut = new PrintWriter(new BufferedWriter(new FileWriter(fileName, append)));
			}
			catch(IOException e) {
				System.out.println("***Cannot create file: " + fileName + " ***");
			}
		}
		

		public static void print(String text)
		{
			fileOut.print(text);
		}
		
		public static void println(String text)
		{
			fileOut.println(text);
		}
		
		
		public static void closeOutputFile()
		{
			fileOut.close();
		}
		
		private static BufferedReader fileIn;
		
		public static void openInputFile(String fileName)
		{
			try {
				fileIn = new BufferedReader(new FileReader(fileName));
			}
			catch(FileNotFoundException e) {
				System.out.println("***Cannot open " + fileName + " ***");
			}
		}
		
		public static String readLine()
		{
			try {
				return fileIn.readLine();
			}
			catch(IOException e) {
				return null;
			}
		}
		

		public static void closeInputFile()
		{
			try {
				fileIn.close();
			}
			catch(IOException e) {}
		}
	}