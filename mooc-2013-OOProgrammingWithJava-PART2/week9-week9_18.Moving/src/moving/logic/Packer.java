/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author jerry pc
 */
import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxList = new ArrayList<Box>();
        Box newBox = new Box(boxesVolume);
        boxList.add(newBox);
        for(Thing thing: things){
            if(newBox.getVolume() + thing.getVolume() <= this.boxesVolume){
                newBox.addThing(thing);
            } else {
                newBox = new Box(boxesVolume);
                boxList.add(newBox);
                newBox.addThing(thing);
            }
        }
        return boxList;
    }
}
