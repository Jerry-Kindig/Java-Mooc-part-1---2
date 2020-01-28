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

public class Box implements ToBeStored{
    
    private ArrayList<ToBeStored> box;
    private double weightLimit;
    
    public Box(double weightLimit){
        this.weightLimit = weightLimit;
        box = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing){
        if(weight() + thing.weight() <= this.weightLimit){
            box.add(thing);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored item: box){
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + box.size() + " things, total weight " + weight() + " kg";
    }
}
