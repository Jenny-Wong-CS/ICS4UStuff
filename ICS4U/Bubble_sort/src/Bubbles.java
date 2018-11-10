import java.util.Scanner;

public class Bubbles {
    //public static int[] Things;
    //public static boolean Switch;
    //public static String Choice;

//    public static void main(String[] args){
    public bubbleSort(int numLines, int[] Things) {

        //create the text file
        IO.createOutputFile("List.txt", true);

        //counts the number of lines
        IO.openInputFile("List.txt");
        String line = IO.readLine( );
        int numLines = 0;

        while (line != null) {
            numLines++;
            line = IO.readLine( );
        }

        IO.closeOutputFile( );

        //stores the lines
        int [] Things = new int[numLines];
        IO.openInputFile("List.txt");
        for (int i = 0; i < numLines; i++)
            Things[i] = Integer.parseInt(IO.readLine( ));
        IO.closeInputFile( );
    //}

    //public void bubbleSort(int numLines, int[] Things) {
        int Highlow = 1;
        int LowHigh = 2;
        String Choice;
        Scanner scan1 = new Scanner(System.in);

//        System.out.print("decide your preference: 1(Highest to lowest), or 2(Lowest to highest): ");
        Choice = scan1.nextLine( );
        int decision = Integer.parseInt(Choice);


        Boolean Switch = true;
        for (int j = 0; j < numLines; j++) {
            if (decision == Highlow) {
                int Temp;
                IO.openInputFile("List.txt");
                //sorts from highest to lowest
                while (Switch) {
                    Switch = false;
                    for (int i = 1; i < numLines; i++) {
                        if (Things[i - 1] < Things[i]) {
                            Temp = Things[i - 1];
                            Things[i - 1] = Things[i];
                            Things[i] = Temp;
                            Switch = true;
                        }

                    }
                    IO.closeInputFile( );
                }
            } else if (decision == LowHigh) {
                int Temp;
                Switch = true;
                //sorts the lines in the text file
                IO.openInputFile("List.txt");
                //sorts from lowest to highest
                while (Switch) {
                    Switch = false;
                    for (int i = 1; i < numLines; i++) {
                        if (Things[i - 1] > Things[i]) {
                            Temp = Things[i - 1];
                            Things[i - 1] = Things[i];
                            Things[i] = Temp;
                            Switch = true;
                        }

                    }
                    IO.closeInputFile( );
                }

            }
        }
    }

    public static void main(String[] args){
   // public void print(int numLines, int[] Things) {
        System.out.print("decide your preference: 1(Highest to lowest), or 2(Lowest to highest): ");
        //Choice = scan1.nextLine( );
        //int decision = Integer.parseInt(Choice);

            //prints the sorted lines into console
        for (int i = 0; i < numLines; i++) {
            System.out.println(Things[i] + " ");
        }


    }

}


//in the middle of figuring out functions


//TO MAKE THE SORT WORK DONT LEAVE THE PRINT FOR LOOP INSIDE THE MAIN FOR LOOP
// MAKE SURE ITS ON THE OUTSIDE