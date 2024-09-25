/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1randomnumbergeneratorp2;
import java.util.Scanner; //Importing the Scanner class
import java.util.Random; //Importing the Random class

/**
 *
 * @author TTang2026
 */
public class TravisR1RandomNumberGeneratorP2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random die = new Random();
        
        System.out.println("Press 'r' to roll the dice or 'q' to quit");
        
        while(true) {
            String userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("r")) {
                
                // Generating a random dice roll from 1 to 6
                int diceRoll = die.nextInt(6) + 1; // 1 to 6
                
                //Outputting the generated dice roll
                System.out.println("You rolled: " + diceRoll);
                
            } else if (userInput.equals("q")) {
                
                System.out.println("CYA COWBOY!");
                
                
                break; // The exit of the loop
            }
        }
    }
}


