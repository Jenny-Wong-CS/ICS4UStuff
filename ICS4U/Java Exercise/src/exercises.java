import java.util.Scanner;

public class exercises.java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		//System.out.println("new line?");
		
		String name;
		String age;
		String address;
		
		Scanner scan1 = new Scanner(System.in);
				
		//ASK FOR USER INPUT
		System.out.print("enter your name: ");
		//READ INPUT FROM KEYBOARD AND STORE IT
		//IN A VARIABLE
		name = scan1.nextLine(); //READS STRINGS ONLY
		System.out.print("enter your age: ");
		age = scan1.nextLine();
		System.out.print("enter your address: ");
		address = scan1.nextLine();
		
		//OUTPUT THE INFO
		System.out.print("Hi " + name + "! I hear that you live at  "+ address);
		System.out.print("i also heard you are " + age + "years old as well!");
		
		scan1.close();
	}
}