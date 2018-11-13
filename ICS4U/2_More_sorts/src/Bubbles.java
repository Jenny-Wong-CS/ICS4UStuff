import java.util.Scanner;

public class Bubbles {
    public static int[] Things;
    public static int numLines = 0;
    public static  int min;

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

        //console selection prep
        int Highlow = 1;
        int LowHigh = 2;
        int Insertion = 3; //****
        int selection = 4; //****
        String Choice;
        Scanner scan1 = new Scanner(System.in);

        //asks for your preferred sorting
        System.out.print("decide your preference: 1(Bubble-High-Low), 2(Bubble-Low-High), 3(Insertion), or 4(Selection): ");
        //System.out.print("Decide your preference: 1(Insertion), or 2(Sort): "); // ****
        Choice = scan1.nextLine( );
        int decision = Integer.parseInt(Choice);

        //Sorts the list
        Boolean Switch = true;
        int Temp; //integer to hold the number that is to be switched
        if (decision == Highlow) {//if number imputed is the same as the number assigned to this set of code, it will proceed with the next set of code within
            IO.openInputFile("List.txt");
            //sorts from highest to lowest
            while (Switch) {
                Switch = false; //the "flag" that says if a switch has occurred is lowered
                for (int i = 1; i < numLines; i++) {
                    if (Things[i - 1] < Things[i]) {//checks if the next number(will be refereed to as box 2) is smaller thant the current number(will be referred to as box 1)
                        // (if it is, then it precedes with the next set of code)
                        Temp = Things[i - 1]; //box 2 gets stored into the variable Temp
                        Things[i - 1] = Things[i]; //what was once box 1, becomes the "NEW" box 2
                        Things[i] = Temp; // the Temp number now becomes the new box 1
                        Switch = true;
                    }
                }
                IO.closeInputFile( );
            }

        } else if (decision == LowHigh) { //if number imputed is the same as the number assigned to this set of code, it will proceed with the next set of code within
            Switch = true;
            //sorts the lines in the text file
            IO.openInputFile("List.txt");
            //sorts from lowest to highest
            while (Switch) {
                Switch = false;
                for (int i = 1; i < numLines; i++) {
                    //Same principle as the high to low switch, but it checks if the number in box 2 is bigger instead
                    if (Things[i - 1] > Things[i]) {
                        Temp = Things[i - 1];
                        Things[i - 1] = Things[i];
                        Things[i] = Temp;
                        Switch = true;
                    }

                }
                IO.closeInputFile( );
            }
        } else if (decision == Insertion) {
            Switch = true;
            //sorts the lines in the text file
            IO.openInputFile("List.txt");
            //sorts from lowest to highest
            while (Switch) {
                Switch = false;
                for (int i = 1; i < numLines; ++i) {
                    Temp = Things[i];
                    int j = i - 1;
                    while (j >= 0 && Things[j] > Temp) {
                        Things[j + 1] = Things[j];
                        j = j - 1;
                    }
                    Things[j + 1] = Temp;
                    Switch = true;
                }
                IO.closeInputFile( );
            }

        } else if (decision == selection) {
            Switch = true;
            IO.openInputFile("List.txt");
            while (Switch) {
                Switch = false;
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
        }

        //prints your sorted numbers into the console
        for (int i = 0; i < numLines; i++) {
            System.out.println(Things[i] + " ");
        }

    }
}
