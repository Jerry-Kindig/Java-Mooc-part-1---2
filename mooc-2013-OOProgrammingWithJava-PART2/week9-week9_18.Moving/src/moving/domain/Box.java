/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author jerry pc
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
    
    private int maximumCapacity;
    private List<Thing> contents;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.contents = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(thing.getVolume() + this.getVolume() <= maximumCapacity){
            contents.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int weight = 0;
        for(Thing thing: contents){
            weight += thing.getVolume();
        }
        return weight;
    }
}
