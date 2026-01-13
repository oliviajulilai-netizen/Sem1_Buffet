/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Your name is " + name);
	System.out.println("How many times would you like to print your name?");
	int times = sc.nextInt();
	System.out.println("We will print out your name " + times + " times");
	int x = 0;
	while(true){
		if(x == times){
			break;
		}
		System.out.println(name);
		x = x + 1;
	}
	
	



		
	}
}
