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
public class CardDealer {
    public static void main(String[] args)
    {
        Card c1=new Card();
        c1.setSuit("Hearts");
        c1.setValue(13);
        
        System.out.println(c1.getSuit());
        System.out.println(c1.getValue());
        
        System.out.println("Card Generated");
    }
}
