package Com.TechilyFly.PracticeSet3CWH;

import java.util.Scanner;

public class ReplaceBelowLookLike {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Name: ");

        String name = userInput.nextLine();

        userInput.close();

        System.out.println("Dear <|name|>, Thanks a lot.");
        System.out.println("Dear " + name.replace("<|name|>", name) + ", Thanks a lot.");
    }
    
}
