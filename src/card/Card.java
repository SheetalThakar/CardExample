/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author mehta
 */
public class Card {

  private String suit;
  private int value;

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Spades")||suit.equals("Clubs")||suit.equals("Diamonds"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("It is not valid Suit ");
            System.out.println("Enter from: Hearts, Spades,Clubs,Diamonds");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if((value<1) || (value>13))
        {
            System.out.println("It is not in range 1-13");
        }
        else
        {
        this.value = value;
        }
    }
    
}
