/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in 
		// the command window when you compile and run this program.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	
	
	System.out.println("What is your age?");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("What month were you born in?");
	String month = sc.nextLine();
	
	System.out.println("What is your birthday?🎉");
	int day = sc.nextInt();
	sc.nextLine();

	System.out.println("What year were you born in?");
	int year = sc.nextInt();
	sc.nextLine();
	
	System.out.println("How much is a buck fifty?");
	double buck = sc.nextDouble();
	
	System.out.println("Your name is " + name);
	System.out.println("You are " + age + " years old");
	System.out.println("You were born in " + month);
	System.out.println("Your birthday is on the " + day + "th");
	System.out.println("You were born in year " + year);
	System.out.println("A buck fifty is " + buck);
	
	}
}
