/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card>{
    public int compare(Card card1, Card card2){
        if(card1.getSuit() < card2.getSuit()){
            return -1;
        } else if (card1.getSuit() > card2.getSuit()){
            return 1;
        } else if (card1.getValue() < card2.getValue()){
            return -1;
        } else if (card1.getValue() > card2.getValue()){
            return 1;
        } else {
            return 0;
        }
    }
    
}
