/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Guessing game out of 1000!!!");
	int num1 = 777;
	while(true){
	System.out.println("Guess the number!!!");
	int guess = sc.nextInt();
	if(guess>num1){
		System.out.println("Your number is too high");
	}
	else if(guess<num1){
		System.out.println("Your number is too low");
	
	}
	if(guess==num1){
		System.out.println("That's correct");
		break;
	}

	}
}
}

