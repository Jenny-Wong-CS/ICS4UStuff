import java.util.Scanner;

public class Bubbles {
    public static int[] Things;
    public static int numLines = 0;

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
        int Insert = 1;
        int LowHigh = 2;
        String Choice;
        Scanner scan1 = new Scanner(System.in);

        //asks for your preferred sorting
        System.out.print("decide your preference: 1(Insertion), or 2(): ");
        Choice = scan1.nextLine( );
        int decision = Integer.parseInt(Choice);


        //Sorts the list
        Boolean Switch = true;
        int Temp = 0;//integer to hold the number that is to be switched
        //
        if (decision == Insert) {
            IO.openInputFile("List.txt");
            while (Switch) {
                Switch = false;
                for (int i = 0; i < numLines - 1; i++)
                {
                    //int index = i;
                    for (int j = i + 1; j < numLines; j++){
                        if (Things[j] < Things[i]){
                            i = j;//searching for lowest index
                        }
                    }
                    Things[i] = Temp;
                IO.closeInputFile( );
            }
        }
//        if (decision == Insert) {
//            IO.openInputFile("List.txt");
//            while (Switch) {
//                Switch = false;
//                for (int j = 1; j < numLines; j++) {
//                    for (int i = j; i > 0; i--) {
//                        if (Things[i] < Things[i - 1]) {
//                            Temp = Things[j];
//                            Things[i] = Things[i - 1];
//                            Things[i - 1] = Temp;
//                            Switch = true;
//                        }
//                    }
//
//                }
//                IO.closeInputFile( );
//            }
//        }

//        if (decision == Insert) {
//            IO.openInputFile("List.txt");
//            while (Switch) {
//                Switch = false;
//                for (int j = 1; j < numLines; j++) {
//                    int key = Things[j];
//                    int i = j-1;
//                    while ( (i > -1) && (Things[i] > key) ) {
//                        Things[i+1] = Things[i];
//                        i--;
//                    }
//                    Things[i+1] = key;
//                }
//                IO.closeInputFile( );
//            }
//        }

//        for (int i = 0; i < numLines - 1; i++)
//        {
//            //int index = i;
//            for (int j = i + 1; j < numLines; j++){
//                if (Things[j] < Things[i]){
//                    i = j;//searching for lowest index
//                }
//            }
//            Things[i] = Temp;
        }








    //prints your sorted numbers into the console
        for (int i = 1; i < numLines; i++){
                System.out.println(Things[i] + " ");
            //}
        }

    }
