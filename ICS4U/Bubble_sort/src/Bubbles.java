import java.util.Scanner;

public class Bubbles {

    public static void main(String[] args) {
        //TODO Auto-generated method

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
        int[] Things = new int[numLines];
        //int[] Things2 = new int [numLines];

        IO.openInputFile("List.txt");
        for (int i = 0; i < numLines; i++)
            Things[i] = Integer.parseInt(IO.readLine( ));
        IO.closeInputFile( );
    //}


    //public static void print(int numLines, int[] Things){
        //prints the sorted lines into console
        //String Choice;
        //int Highlow = 1;
        //int LowHigh = 2
       // Scanner scan1 = new Scanner(System.in);

        //System.out.println("decide your preference:(1)= Highest to lowest, or (2)= Lowest to highest: ");
        //Choice = scan1.nextLine();

//        for (int i = 0; i < numLines; i++) {
//            int decision = Integer.parseInt(Choice);
//            if(decision == Highlow){
//                System.out.println(Things[i] + " ");
//            }
//
//            if(decision == LowHigh) {
//                System.out.println(Things[i] + " ");
//            }
//        }
    //}



    //public static void sortList(int numLines, int[] Things, int decision){
            int Temp;
            boolean Switch = true;
            //sorts the lines in the text file
            IO.openInputFile("List.txt");
        //if(decision == 1) {
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
        //}

        //if(decision == 2) {
//            while (Switch) {
//                Switch = false;
//                for (int i = 1; i < numLines; i++) {
//                    if (Things[i - 1] > Things[i]) {
//                        Temp = Things[i - 1];
//                        Things[i - 1] = Things[i];
//                        Things[i] = Temp;
//                        Switch = true;
//                    }
//
//                }

                IO.closeInputFile( );
            //}
        //}



    //}


    //public static void print(int numLines, int[] Things, String Choice, int Highlow, int LowHigh){
            //prints the sorted lines into console

            for (int i = 0; i < numLines; i++) {
            //int decision = Integer.parseInt(Choice);
               // if(decision == Highlow){
                    System.out.println(Things[i] + " ");
                }

                //if(decision == LowHigh) {
                    //System.out.println(Things[i] + " ");
                }
        }
   // }


//}


//System.out.println(Things[i] + " ");