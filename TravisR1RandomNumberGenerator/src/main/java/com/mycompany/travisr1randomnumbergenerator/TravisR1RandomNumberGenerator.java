/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1randomnumbergenerator;
import java.util.Random; //Importing the Random class
import java.util.Scanner; //Importing the Scanner class
/**
 *
 * @author TTang2026
 */


public class TravisR1RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random digits = new Random();
        
        System.out.println("Press the letter 'p' to generate a new phone number, and press 'q' to quit");
        
        while(true) {
            String userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("p")) {
                
                //Generating the first part of the phone number (3 digits, each never approaching 8 or 9)
                int firstDigit = digits.nextInt(8); // 0 to 7
                int secondDigit = digits.nextInt(8); // 0 to 7
                int thirdDigit = digits.nextInt(8); // 0 to 7
                
                //Generating the second part of the phone number (3 digits, never going higher than 655)
                int fourthDigit = digits.nextInt(7); // 0 to 6
                int fifthDigit = digits.nextInt(10); // 0 to 9
                int sixthDigit = digits.nextInt(10); // 0 to 9
                
                //Restricting the second part when the part enters the 600s
                if(fourthDigit == 6) {
                    fifthDigit = digits.nextInt(6); // 0 to 5
                } 
                if(fifthDigit == 6) {
                        sixthDigit = digits.nextInt(6); // 0 to 5
                    } 
                
                //Generating the final part of the phone number (4 digits, no restrictions)
                int seventhDigit = digits.nextInt(10);
                int eighthDigit = digits.nextInt(10);
                int ninthDigit = digits.nextInt(10);
                int tenthDigit = digits.nextInt(10);

                //Outputting the generated phone number 
                System.out.println("New Phone Number: " + firstDigit + secondDigit + thirdDigit + "-" + fourthDigit + fifthDigit + sixthDigit + "-" + seventhDigit + eighthDigit + ninthDigit + tenthDigit);
                
            } else if (userInput.equals("q")) {
                
                System.out.println("CYA COWBOY!");
                
                
                break; //The exit of the loop
            } 
        }
    }
}

