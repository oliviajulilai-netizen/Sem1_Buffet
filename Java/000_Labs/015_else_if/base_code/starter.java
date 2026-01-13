/*
 *	Author:  
 *  Date: 
*/


import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = 777;
		System.out.println("Guess the number from 1 to 1000!!!");
		int num2 = sc.nextInt();
		if(num1==num2){
		System.out.println("You've got it!!");
	}
		else if(num1>num2){
			System.out.println("Your number is too low");
		}
			else if(num2>num1){
				System.out.println("Your number is too high");
			}
		
	}
}
