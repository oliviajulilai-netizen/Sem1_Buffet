/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word.");
	String word = sc.nextLine();
	
	if(word.equals("pig")){
		    
System.out.println("^..^     \\9");
System.out.println("(oo)_____/") ;
System.out.println("  WW  WW");
	}
	else if(word.equals("broom")){
		System.out.println("|");
  System.out.println("  |");
  System.out.println("  |");
  System.out.println("  |");
  System.out.println("  |");
  System.out.println("  |");
 System.out.println("//X\\\\");
System.out.println("//X\\\\");
	}
	else if(word.equals("face")){
System.out.println("(^o^)");
		
	}
	else{
		System.out.println("Invalid Input.");
	}
	}
}
