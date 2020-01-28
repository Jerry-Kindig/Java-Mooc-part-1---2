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

public class Suitcase {
    private ArrayList<Thing> thingList;
    private int weightLimit;
    
    public Suitcase(int limit){
        this.thingList = new ArrayList<Thing>();
        this.weightLimit = limit;
    }
    
    public void addThing(Thing thing){
        if(thing.getWeight() + this.totalWeight() <= this.weightLimit){
            this.thingList.add(thing);
        }    
    }
    
    private String thingStatus(){
        if(this.thingList.size() < 1){
            return "empty (";
        } else if(this.thingList.size() < 2){
            return "1 thing (";
        } else {
            return this.thingList.size() + " things (";
        }
    }
    
    public void printThings(){
        for(Thing thing: this.thingList){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Thing thing: this.thingList){
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing(){
        if(this.thingList.size() > 0){
            Thing heaviest = this.thingList.get(0);
            for(Thing thing: this.thingList){
                if(thing.getWeight() > heaviest.getWeight()){
                    heaviest = thing;
                }
            }
            return heaviest;
        } else {
            return null;
        }    
    }
    
    public String toString(){
        return this.thingStatus() + this.totalWeight() + " kg)";
    }
}
