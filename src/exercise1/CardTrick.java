package exercise1;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Taymour Breiche
 * @author Taymour Breiche  May 30th 2023
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(i);
            
            // Generate a random value for the card
            Random random = new Random();
            int randomValue = random.nextInt(13) + 1; // Generates a random number between 1 and 13 (inclusive)
            card.setValue(randomValue);
            
            // Generate a random suit for the card
            int randomSuitIndex = random.nextInt(4); // Generates a random number between 0 and 3 (inclusive)
            String randomSuit = Card.SUITS[randomSuitIndex];
            card.setSuit(randomSuit);
            
            hand[i] = card;
        }

//        System.out.println("Generated cards:");
//        for (Card card : hand) {
//            System.out.println(card.getValue() + " of " + card.getSuit());
//        }
//        System.out.println();
        
        // Ask the user for their guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1-10, 11 for jack, 12 for queen, 13 for king): ");
        int userValue = input.nextInt();
        System.out.print("Enter suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int userSuit = input.nextInt();
        
        // Loop through the cards in the hand and check for a match
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(Card.SUITS[userSuit - 1])) {
                matchFound = true;
                break;
            }
        }
        
        // Print the result
        if (matchFound) {
            System.out.println("Your card matches!");
        } else {
            System.out.println("No match found.");
        }
    }
}



    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
//  private static void printInfo() {
//    
//        System.out.println("Congratulations, you guessed right!");
//        System.out.println();
//        
//        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
//        System.out.println();
//        
//        System.out.println("My career ambitions:");
//        System.out.println("-- Be more active on LinkedIn");?
//        System.out.println("-- Investing");
//        System.out.println("-- Cooking");
//        System.out.println("-- Reading/Watching TV");
//        System.out.println("-- Riding my motorcycle");
//
//        System.out.println();
//        
//  
//    }
//
//}

