package exercise;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print("Hi " + name + "! I hear that you live at " + address + "! i also heard you are " + age + " years old.");
		
		scan1.close();
		
	}

}


//1. Write a program that prompts the user for their name, age, and address, and then outputs this information using one or two nicely formatted sentences.
//2. Write a program that asks the user to input marks for 4 courses, and the displays the average mark.
//3. Ask 5 simple math problems. After the user enters their answer, display the problem and the correct answer. The correct answer should be calculated by your program.
//4. Ask the user their name, age, and the current year. Greet the user and tell them the year they will be 25, 50, and 75 years old.
//5. Have the user enter two integers between 1 and 9. Do the basic math operations using these numbers and display the answer (add, subtract, multiply, divide, exponent).
//6. Using the available help or online resources for your programming language, investigate how to do #2 with your answer rounded to one decimal place.
//7. Integrate each of these as different options in a GUI.