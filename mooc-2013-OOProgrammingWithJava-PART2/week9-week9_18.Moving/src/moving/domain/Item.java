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
public class Item implements Thing, Comparable<Item>{
    
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        if(this.volume < o.volume){
            return -1;
        } else if (this.volume > o.volume){
            return 1;
        } else {
            return 0;
        }
    }
    
}
