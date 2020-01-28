/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author jerry pc
 */
public class Person {
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    @Override
    public boolean equals(Object person){
        if(person == null){
            return false;
        } else if (this.getClass() != person.getClass()){
            return false;
        }
        Person pers = (Person) person;
        if(this.getName() == null || pers.getName() == null){
            return false;
        }
        return this.getName().equals(pers.getName());
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        return hash * name.hashCode();
    }    
}
