import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.out.println("new line?");
		
		String name;
		String movie;
		
		Scanner scan1 = new Scanner(System.in);
				
		//ASK FOR USER INPUT
		System.out.print("enter your name: ");
		//READ INPUT FROM KEYBOARD AND STORE IT
		//IN A VARIABLE
		name = scan1.nextLine(); //READS STRINGS ONLY
		System.out.print("enter your favourite movie: ");
		movie = scan1.nextLine();
		
		//OUTPUT THE INFO
		System.out.print("Hi " + name + "! I like "+ movie +" too. ");
		
		scan1.close();
	}

}
