import java.util.Scanner;

public class Bubbles {
    public static int[] Things;
    public static int numLines = 0;
    public static int min;

    public static void main(String[] args) {
        //create the text file
        IO.createOutputFile("List.txt", true);

        //counts the number of lines
        IO.openInputFile("List.txt");
        String line = IO.readLine( );
        //int numLines = 0;

        while (line != null) {
            numLines++;
            line = IO.readLine( );
        }

        IO.closeOutputFile( );

        //stores the lines
        Things = new int[numLines];
        IO.openInputFile("List.txt");
        for (int i = 0; i < numLines; i++)
            Things[i] = Integer.parseInt(IO.readLine( ));
        IO.closeInputFile( );

        //Sorts the list
        Boolean Switch = true;
        int Temp; //integer to hold the number that is to be switched
        IO.openInputFile("List.txt");
        //sorts from highest to lowest
        while (Switch) {
            Switch = false; //the "flag" that says if a switch has occurred is lowered
            for (int i = 0; i < numLines-1; i++) {
                // Find the minimum in unsorted array
                min = i;
                for (int j = i+1; j < numLines; j++)
                    if (Things[j] < Things[min])
                        min = j;
                    Temp = Things[min];
                    Things[min] = Things[i];
                    Things[i] = Temp;
            }
            Switch = true;
            }

        IO.closeInputFile( );

        for (int i = 0; i < numLines; i++) {
            System.out.println(Things[i] + " ");
        }


    }
}

