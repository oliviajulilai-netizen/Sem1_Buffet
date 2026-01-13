/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you rather be a wizard, warrior, or rogue?");
		String role = sc.nextLine();
		System.out.println("You are going to be a " + role);
	}
}
