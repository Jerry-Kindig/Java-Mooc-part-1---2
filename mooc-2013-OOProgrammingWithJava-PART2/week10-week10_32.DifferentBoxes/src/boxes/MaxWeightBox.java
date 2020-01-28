/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerry pc
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> stuff;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.stuff = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for(Thing thingy: this.stuff){
            weight += thingy.getWeight();
        }
        if(weight + thing.getWeight() <= this.maxWeight){
            this.stuff.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing thingy: this.stuff){
            if(thingy.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
}
