package Com.TechilyFly.PracticeSet3CWH;

import java.util.Scanner;

/*
Write a Java Program to Replace Space with Underscore.
*/

public class ReplaceSpaceWithUnderscore {
    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter Your Name With Spaces: ");
        String name = userInput.nextLine();

        userInput.close();

        System.out.println("Your Name is " + name + " and There's Spaces has been Replaced and " + 
        " Now Your Name is " + name.replace(" ", "_"));
        
    }
    
}
