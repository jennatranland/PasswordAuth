
package Loops;

import java.util.Scanner;

public class loopingPassword {

    public static void main(String[] args) {
        
        final String password = "King";
        int remainingAttempts = 5;
        final String secret = "Yes, his name is King.";
        int attempts = 0;
        final int maxAttempts = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in some generic pomeranian names to find out what my dog's name is.");

        while (attempts < maxAttempts) {
            
            System.out.println("Please type in password:");
            
        String correctPassword = scanner.next();

            attempts++;
            remainingAttempts--;

            if (password.equals(correctPassword)) {
                System.out.println(secret);
                System.out.println("Wow, you got his name, great work!");
                return;
                
            } else {
                System.out.println("Incorrect, try again.");
                System.out.println("Number of attempts made: " + attempts);
                System.out.println("Number of attempts remaining: " + remainingAttempts);
                
            }
        }
        
        System.out.println("Out of attempts? Sucks for you, bud.");

    }

}
