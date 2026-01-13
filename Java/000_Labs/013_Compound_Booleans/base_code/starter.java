/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number");
	int num1 = sc.nextInt();
	System.out.println("Please enter another number");
	int num2 = sc.nextInt();
	System.out.println("Please enter one more number");
	int num3 = sc.nextInt();
	System.out.println("Your numbers are " + num1 + "," + num2 + "," + num3);

	if((num1>num2) && (num1>num3)){
		System.out.println("The largest number is " + num1);
	}
		else if((num2>num1) && (num2>num3)){
		System.out.println("The largest number is " + num2);
		}
			else if((num3>num1) && (num3>num2)){
			System.out.println("The largest number is " + num3);
			
	
	if((num3<num1) && (num3<num2)){
		System.out.println("The smallest number is " + num3);
	}
		else if((num2<num1) && (num2<num3)){
			System.out.println("The smallest number is " + num2);
		}
			else if((num1<num3) && (num1<num2)){
				System.out.println("The smallest number is " + num1);
			}
	}
	}
}
			
		
	
	
	

