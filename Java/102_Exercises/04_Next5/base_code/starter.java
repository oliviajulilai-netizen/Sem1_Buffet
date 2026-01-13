/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number");
	int bob = sc.nextInt();
	int bob1 = bob + 1;
	int bob2 = bob + 2;
	int bob3 = bob + 3;
	int bob4 = bob + 4;
	int bob5 = bob + 5;
	System.out.println("Here are the next 5 numbers!");
	System.out.println(bob1 + "," + bob2 + "," + bob3 + "," + bob4 + "," +bob5);
	System.out.println("Here are the next 5 multiples of" + bob);
	int bob6 = bob*1;
	int bob7 = bob*2;
	int bob8 = bob*3;
	int bob9 = bob*4;
	int bob10 = bob*5;
	System.out.println(bob6 + "," + bob7 + "," + bob8 + "," + bob9 + "," + bob10);
	System.out.println("Here is " + bob + " divided by 100!");
	double bob11 = bob/100.0;
	System.out.println(bob11);
	System.out.println("Here is " + bob + " divided by 10!");
	double bob12 = bob/10.0;
	System.out.println(bob12);

	


	}
}
