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

public class Contestants {
    private List<Skiier> skiiers;
    
    public Contestants(){
        skiiers = new ArrayList<Skiier>();
    }
    
    public void add(String name){
        skiiers.add(new Skiier(name));
    }
    
    public String jumpOrder(){
        Collections.sort(skiiers, Collections.reverseOrder());
        
        String order = "";
        int i = 0;
        for(Skiier skiier: skiiers){
            i++;
            order = order + "\n  " + i + ". " + skiier;
        }
        return order;
    }
    
    public String newRound(){
        String round = "";
        for(Skiier skiier: skiiers){
            round += skiier.newRound() + "\n";
        }
        return round;
    }
    
    public String results(){
        Collections.sort(skiiers);
        String result = "";
        int i = 1;
        for(Skiier skiier: skiiers){
            result += i + "           " + skiier + "\n";
            result += skiier.jumpLengths() + "\n";
            i++;
        }
        return result;
    }
}
