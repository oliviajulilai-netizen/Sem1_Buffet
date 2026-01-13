/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		int total = 100;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the slot machine!!!💸");
		System.out.println("You have $100");
		System.out.println("If 2 numbers are the same, your money doubles.");
		System.out.println("Up to $100, play wisely!!");
		System.out.println("Would you like to play?");
		String play = sc.nextLine();

		while(play.equals("Yes")||play.equals("yes")||play.equals("Y")||play.equals("y")) {

			System.out.println("Ok, lets play.");
			System.out.println("HOW MUCH DO YOU WANT TO BET?");
			int money = sc.nextInt();
		
			int slot1 = ((int) (Math.random()*10));
			int slot2 = ((int) (Math.random()*10));
			int slot3 = ((int) (Math.random()*10));
		
			System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
			if((slot1==slot2) || (slot2==slot3) || (slot1==slot3)){
				money = money*2;
				System.out.println("You won $" + money + "!!");
			}
			else if ((slot1==slot2) && (slot2==slot3) && (slot1==slot3)){
				money = money*3;
				System.out.println("ALL THREE NUMBERS ARE THE SAME!! YOUR BET TRIPLED!! $" + money);
			}
			else{
				System.out.println("TOO BAD!!!");
				money = money * -1;
			}
			
			total = total + money;
			System.out.println("You have $" + total + " left");
		
			System.out.println("Would you like to keep playing?");
			play = sc.nextLine();
			play = sc.nextLine();
			
			if(play.equals("No")||play.equals("no")||play.equals("N")||play.equals("n")||total==0){
				System.out.println("Come back next time!!");
			}
		}
	}
}
