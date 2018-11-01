
public class Bubbles {

    public static boolean main(String[] args) {
        //TODO Auto-generated method stub
        //create the text file
        IO.createOutputFile("List.txt");

        //counts the lines
        IO.openInputFile("List.txt");
        String line = IO.readLine();
        int numLines = 0;

        while (line != null) {
            numLines++;
            line = IO.readLine();
        }
        IO.closeOutputFile();


        //sorts the list of whatever
        boolean Switch;
        IO.openInputFile("List.txt");
        while (Switch = true) {
            int Temp;
            //int Box;
            int[] Things = new int[numLines];

//            for(int i = 0; i < numLines; i++)
                //Things[i] = IO.readLine();
                for (int i = 1; i < numLines; i++ ) {
                    if (Things[i-1] > Things[i]){
                        Temp = Things[i-1];
                        Things[i-1] = Things[i];
                        Things[i] = Temp;
                        System.out.println(Things[i]);

                    } else {
                        System.out.println("done");
                    }
                }

                //return Switch;


        }

        IO.closeInputFile( );
        return Switch;
    }

}