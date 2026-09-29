/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        int userValue;
        String userSuit;
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(1,14));
            c.setSuit(Card.SUITS[rand.nextInt(1,4)]);
        }
        
       luckyCard.setSuit("Hearts");
       luckyCard.setValue(10);
        
        //insert code to ask the user for Card value and suit, create their card            
        System.out.println("Please enter suit: ");
        userSuit = inp.nextLine();
        System.out.println("Please enter card(1-13): ");
        userValue =inp.nextInt();
        
        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        // and search magicHand here
        
        for (Card c : magicHand){
            if (userCard == c){
                System.out.println("Your card is in the hand!");
            }
        
            else{
                System.out.println("Your card is not in the hand.");
                }
            break;
        }
        
       if(userCard == luckyCard){
           System.out.println("You found the lucky card!");
       }
       
       else{
           System.out.println("Not lucky card.");
       }
        //Then report the result here
        
        
        // add one luckcard hard code 2,clubs

    }
    
}
