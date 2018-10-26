
public class Bubbles {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean Switch;

        while(Switch = true)
        {int

            IO.createOutputFile("Things.txt");
            //IO.print("i am awsome");
            IO.closeOutputFile();

            //first we need to count how many lines are in the file

            IO.openInputFile("Highscores.txt");

            String line = IO.readLine();
            int numLines = 0;

            while(line != null)
            {
                System.out.println(line.toUpperCase());
                numLines++;
                line = IO.readLine();
            }
            System.out.println(numLines);

            IO.closeInputFile();
            //now we can store these lines in an array

            String[] highscores =  new String[numLines];

            IO.openInputFile("Highscores.txt");
            for(int i =0; i < numLines; i++)
                highscores[i] = IO.readLine();
            IO.closeInputFile();

            //now we can do things with the data
            for(int i = 0; i < numLines; i++)
                System.out.println(highscores[i].toLowerCase());


        }

    }





    //boolean