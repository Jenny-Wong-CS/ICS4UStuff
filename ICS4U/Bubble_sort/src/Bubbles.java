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
        IO.openInputFile("List.txt");
        for (int i = 0; i < numLines; i++)
            Things[i] = Integer.parseInt(IO.readLine( ));
        IO.closeInputFile( );


        //sorts the lines in the text file

        //public void sortList(int[] Temp){
        int Temp;
        boolean Switch = true;

        IO.openInputFile("List.txt");
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

            }

            IO.closeInputFile( );

            //prints the sorted lines into console
            for (int i = 0; i < numLines; i++) {
                System.out.println(Things[i] + " ");
            }


        }


    }


    //FIGURE OUT HOW TO PUT SHIT INTO FUNCTIONS