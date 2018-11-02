public class Bubbles {

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        //create the text file
        IO.createOutputFile("List.txt");

        //counts the lines
        IO.openInputFile("List.txt");
        String line = IO.readLine( );
        int numLines = 0;

        while (line != null) {
            System.out.println(line.toUpperCase( ));
            numLines++;
            line = IO.readLine( );
        }
        System.out.println(numLines);
        IO.closeOutputFile( );

        //stores the lines
        int[] Things = new int[numLines];

//        IO.openInputFile("List.txt");
//        for(int i =0; i < numLines; i++)
//            Things[i] = IO.readLine();
//        IO.closeInputFile();


        //sorts the lines and stuff
//        boolean Switch = true;
//        int Temp;
//
//        IO.openInputFile("List.txt");
//        while (Switch) {
//            Switch = false;
//            for (int j = 0; j < numLines; j++ ) {
//                for (int i = 1; i < numLines - j; i++) {
//                    if (Things[i - 1] > Things[i]) {
//                        Temp = Things[i - 1];
//                        Things[i - 1] = Things[i];
//                        Things[i] = Temp;
//                        Switch = true;
//                    }
//
//                }
//            }
//            //prints into console
//            //for(int i = 0; i < numLines; i++)
//                //System.out.println(Things[i]);
//
//
//        }
//        IO.closeInputFile( );

        //insertion sort calculation
        for (int i = 1; i < numLines; i++) {
            int temp = Things[i];
            int j;
            for (j = i - 1; j >= 0 && temp < Things[j]; j--)
                Things[j + 1] = Things[j];
            Things[j + 1] = temp;
        }






    }

}
