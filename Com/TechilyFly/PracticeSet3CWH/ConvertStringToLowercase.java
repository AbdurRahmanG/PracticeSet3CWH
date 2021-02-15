package Com.TechilyFly.PracticeSet3CWH;

import java.util.Scanner;

/*
Write a Java Program to Convert a String to lowercase
*/

public class ConvertStringToLowercase {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = userInput.nextLine();

        userInput.close();

        System.out.println("Your name in Lowercase is " + name.toLowerCase());
        
    }
}
