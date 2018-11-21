import java.util.Scanner;
public class ofcoursenotthatimadetheporjectname {
    public static void main(String[] args) {
        //creates a scanner to read the 3 number inputs
        Scanner scan = new Scanner(System.in);
        //stores the 1st input into this integer
        int num1 = scan.nextInt();
        //stores the 2nd input into this integer
        int num2 = scan.nextInt();
        //stores the 3rd input into this integer
        int num3 = scan.nextInt();

        int random = 639025;
        //adds the inputs plus a random number together-FILLER
        int total1 = add(num1, num2, num3,random);

        //adds all the inputs together-FILLER
        int total3 =  num1+num2;

        //subtracts all the numbers together, the number is made positive because of "=-"
        int total4 =-(-num1-num2-num3);

        //adds all the inputs together-FILLER
        int total6 =  num1+num2+num3;

        //subtracts the inputs together, and makes the difference negative(unless the difference is a negative, in which it becomes positive because of "=-")-FILLER
        int total7 =-(num1-num2-num3);

        // assigned the int sum4 to the int sum, everything else in line is filler
        Assignment(total3, total4, 43720, total1, total6, "greawett", 73689, total7);

    }
    //function for the sum-the second int will be the sum for the imputed numbers
    static void Assignment(int Filler1, int sum, int Filler2, int Filler3, int Filler4, String Filler5, int Filler6, int Filler7)

    //prints out the sum
    {System.out.println(sum);}

    //decoy-code
    static int add(int Filler8, int Filler9, int Filler10, int Filler11)
    {int finalsolution = Filler8 + Filler9 + Filler10 + Filler11;
        return finalsolution;}
}