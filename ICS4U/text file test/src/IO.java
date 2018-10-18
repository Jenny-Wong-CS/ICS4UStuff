import java.io.*;
public class IO {

    //VARIABLES AND METHODS NEEDED FOR WRITING TO A FILE

    private static PrintWriter fileOut;

    //CREATES A NEW FILE (file name) IN THE CCURRENT FOLDER
    //and places a reference to it in the object fileOut
    //the parameter fileName represents the name of the text file
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

    /*
     * creates a new file (fileName) in the current folder and places
     * a reference to it in fileOut
     * append TRUE if you want to add to the existing information
     * append FALSE if you want to rewrite the entire file
     */

    public static void createOutputFile(String fileName, boolean append) {
        try {
            fileOut = new PrintWriter(new BufferedWriter(new FileWriter(fileName, append)));
        }
        catch(IOException e) {
            System.out.println("***Cannot create file: " + fileName + " ***");
        }
    }

    /*
     * Text is added to the current file
     * string text - the characters that will be added to the file
     */
    public static void print(String text)
    {
        fileOut.print(text);
    }

    /*
     * text is added to the current file and then a
     * new line is inserted at the end of the characters
     */
    public static void println(String text)
    {
        fileOut.println(text);
    }


    /*
     * closes the file that is currently being written to
     * NOTE: MUST BE CALLED WHEN YOU ARE FINISHED WRITING
     * IN ORDER TO SAVE THE FILE
     */
    public static void closeOutputFile()
    {
        fileOut.close();
    }

    //VARIABLES AND METHODES NEEDED FOR READING FROM A FILE
    private static BufferedReader fileIn;

    /*
     * Opens a file called fileName (file must be in the current folder) and places
     * a reference to it in fileIn
     */
    public static void openInputFile(String fileName)
    {
        try {
            fileIn = new BufferedReader(new FileReader(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("***Cannot open " + fileName + " ***");
        }
    }

    /*
     * reads the next line from the file and
     * returns it to be stored in a string
     */
    public static String readLine()
    {
        try {
            return fileIn.readLine();
        }
        catch(IOException e) {
            return null;
        }
    }

    /*
     * closes the file that is currently being read from
     */
    public static void closeInputFile()
    {
        try {
            fileIn.close();
        }
        catch(IOException e) {}
    }
}