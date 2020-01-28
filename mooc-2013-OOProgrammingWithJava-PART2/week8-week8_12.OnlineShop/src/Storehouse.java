/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;
    
    public Storehouse(){
        priceMap = new HashMap<String, Integer>();
        stockMap = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }
    
    public int price(String product){
        for(String key: priceMap.keySet()){
            if(key.equals(product)){
                return priceMap.get(key);
            }
        }
        return -99;
    }
    
    public int stock(String product){
        for(String key: stockMap.keySet()){
            if(key.equals(product)){
                return stockMap.get(key);
            }
        }
        return 0;
    }
    
    public boolean take(String product){
        for(String key: stockMap.keySet()){
            if(key.equals(product)){
                if(stockMap.get(key) >= 1){
                    stockMap.replace(key, (stockMap.get(key) - 1));
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products(){
        return priceMap.keySet();
    }
}
