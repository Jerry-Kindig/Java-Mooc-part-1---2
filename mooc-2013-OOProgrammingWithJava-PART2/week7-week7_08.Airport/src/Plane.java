/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */

public class Plane {
    
    private String name;
    private int capacity;
    
    public Plane(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    public String toString(){
        return this.name + " (" + this.capacity + " ppl)";
    }
    
    public String getName(){
        return this.name;
    }
}
