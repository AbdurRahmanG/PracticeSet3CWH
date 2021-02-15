package Com.TechilyFly.PracticeSet3CWH;

import java.util.Scanner;

/*
Write a Java Program to Detect double and Triple Spaces in a String 
*/

public class DetectDoubleAndTripleSpace {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Name with Double and Triple Space: ");
        String name = userInput.nextLine();

        userInput.close();
        
        System.out.println("You have Double Spaces: " + name.indexOf("  "));
        System.out.println("You have Tripple Spaces: " + name.indexOf("   "));
    }
    
}
