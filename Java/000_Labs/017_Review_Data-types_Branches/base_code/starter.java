/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your name");
	String name = sc.nextLine();
	System.out.println("Your name is " + name);
	
	System.out.println("What is your character title?");
	String title = sc.nextLine();
	System.out.println("Your title is " + title);
	
	System.out.println("Would you like to be a wizard, warrior, or rogue?");
	String role = sc.nextLine();
	System.out.println("Your role is a " + role);
	
	System.out.println("You have 20 points to spend.");
	System.out.println("You can spend a maximum of 10 points each on:");
	System.out.println("Strength: Buff and able to carry larger items");
	System.out.println("Dexterity: Agile and moves quickly");
	System.out.println("Intelligence: Better at magic spells!");
	System.out.println("Charisma: How personable");
	
	
	int points = 20;
	System.out.println("How many points would you like to use for strength?");
	int strength = sc.nextInt();
	System.out.println(points - strength + " points left");
	if(strength > 10){
		System.out.println("Invalid");
		System.out.println("Please restart");
	}
	int left1 = points - strength;
	System.out.println("How many points would you like to use for dexterity?");
	int dexterity = sc.nextInt();
	System.out.println(left1 - dexterity + " points left");
	if(dexterity > 10){
		System.out.println("Invalid");
		System.out.println("Please restart");
	}
	int left2 = left1 - dexterity;
	System.out.println("How many points would you like to use for intelligence?");
	int intelligence = sc.nextInt();
	System.out.println(left2 - intelligence + " points left");
	if(intelligence > 10){
		System.out.println("Invalid");
		System.out.println("Please restart");
	}
	int left3 = left2 - intelligence;
	System.out.println("How many points would you like to use for charisma?");
	int charisma = sc.nextInt();
	System.out.println(left3 - charisma + " points left");
	if(charisma > 10){
		System.out.println("Invalid");
		System.out.println("Please restart");
	}
	int left4 = left3 - charisma;
	int total = strength + dexterity + intelligence + charisma;
	if (total<0){
		System.out.println("You've used more than 20 points, please restart");
	}
	System.out.println("You ended up having " + left4 + "points left");
	System.out.println(name);
	System.out.println(title);
	System.out.println(role);
	System.out.println("Strength:" + strength);
	System.out.println("Dexterity:" + dexterity);
	System.out.println("Intelligence:" + intelligence);
	System.out.println("Charisma:" + charisma);
	
	
	
	
	}
}
