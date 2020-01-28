/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int timesObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.timesObserved = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getTimesObserved(){
        return this.timesObserved;
    }
    
    public void observe(){
        this.timesObserved++;
    }
}
