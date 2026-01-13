


import java.util.Scanner;/*
    Lecture note example - Input!!
*/

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Meet your favorite Meat");
        System.out.println("1.🥩Raw Meat - $3.99");
        System.out.println("2.🥩Cooked Meat - $8.99");
        System.out.println("3.🥩Seasoned and Cooked Meat - $30.99");
        
        System.out.println("Who are you?");
        String name = sc.nextLine();
        System.out.println("How much Raw Meat would you like?");
        int item1 = sc.nextInt();
        System.out.println("How much Cooked Meat would you like?");
        int item2 = sc.nextInt();
        System.out.println("How much Seasoned and Cooked Meat would you like?");
        int item3 = sc.nextInt();
        
        double price1 = item1*13.99; 
        double price2 = item2*8.99;
        double price3 = item3*30.99;
        
        System.out.println("How much do you want to tip?");
        double tip = sc.nextDouble();
        
        double total = price1+price2+price3+tip;
        
        System.out.println(name + "s Receipt");
        System.out.println(item1 + " x Raw Meat = $" + price1);
        System.out.println(item2 + " x Cooked Meat = $" + price2);
        System.out.println(item3 + " x Seasoned and Cooked Meat = $" + price3);
        System.out.println("The Grand Total is - " + total);
        
	}
}
