/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private List<Card> hand; 
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card: hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int compareTo(Hand hand){
        int home = 0;
        int away = 0;
        for(Card card: this.hand){
            home += card.getValue();
        }
        for(Card card: hand.hand){
            away += card.getValue();
        }
        if(home < away){
            return -1;
        } else if (home > away){
            return 1;
        } else {
            return 0;
        }
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
