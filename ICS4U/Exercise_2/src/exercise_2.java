import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
				
		//ASK FOR USER INPUT
		System.out.print("enter your 1st mark: ");
		int num1 = scan1.nextInt(); //READS STRINGS ONLY
		System.out.print("enter your 2nd mark: ");
		int num2 = scan1.nextInt();
		System.out.print("enter your 3rd mark: ");
		int num3 = scan1.nextInt();
		System.out.print("enter your 4th mark: ");
		int num4 = scan1.nextInt();
		
		int num5 = num1 + num2 + num3 + num4;
		int num6 = num5 / 4;
		
		//OUTPUT THE INFO
		System.out.print("Your average is " + num6 + " percent");
		
		scan1.close();
		
		
	}

}
