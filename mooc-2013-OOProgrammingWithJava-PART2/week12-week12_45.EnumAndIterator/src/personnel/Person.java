/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author jerry pc
 */
public class Person {
    private Education deg;
    private String name;
    
    public Person(String name, Education deg){
        this.name = name;
        this.deg = deg;
    }
    
    public Education getEducation(){
        return deg;
    }
    
    @Override
    public String toString(){
        return name + ", " + deg;
    }
}
