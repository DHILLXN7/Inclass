package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * This class populates a magic hand with 7 random Card objects,
 * prompts the user to select a card, and checks if the selected card
 * is in the magic hand. Used as starting code in ICE 1.
 * @author Kamaljot Singh
 * @modifier Kamaljot Singh
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random(); 

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = card;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(8); 
        luckyCard.setSuit("Hearts"); 

        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card);
        }

        System.out.println("Lucky Card: " + luckyCard);

        boolean luckyFound = isCardInHand(magicHand, luckyCard.getValue(), luckyCard.getSuit());
        if (luckyFound) {
            System.out.println("Congratulations! You win! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, you lose! The lucky card is not in the magic hand.");
        }
    }

    public static boolean isCardInHand(Card[] hand, int value, String suit) {
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }
}
