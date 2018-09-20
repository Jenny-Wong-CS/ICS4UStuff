import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 answer1;
		String age;
		String address;
		
		Scanner scan1 = new Scanner(System.in);
				
		System.out.print("What is 5+5?:");
		answer1 = scan1.nextLine(); //READS STRINGS ONLY
		if(answer1 == 10) {
			
		}
		
		
		System.out.print("enter your age: ");
		age = scan1.nextLine();
		System.out.print("enter your address: ");
		address = scan1.nextLine();
		
		//OUTPUT THE INFO
		System.out.print("Hi " + name + "! I hear that you live at " + address + "! i also heard you are " + age + " years old.");
		
		scan1.close();
		
		
		
	}

}
