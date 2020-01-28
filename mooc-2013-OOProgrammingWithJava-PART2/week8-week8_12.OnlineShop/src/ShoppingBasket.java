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

public class ShoppingBasket {
    
    private List<Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price){
        for(Purchase item: basket){
            if(item.name().equals(product)){
                item.increaseAmount();
                return;
            }
        }
        this.basket.add(new Purchase(product, 1, price));
    }
    
    public int price(){
        int i = 0;
        for(Purchase item: this.basket){
            i += item.price();
        }
        return i;
    }
    
    public void print(){
        for(Purchase item: basket){
            System.out.println(item);
        }
    }
}
