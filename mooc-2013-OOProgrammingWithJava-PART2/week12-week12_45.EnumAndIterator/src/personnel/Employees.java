/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jerry pc
 */
public class Employees {
    private List<Person> perList;
    
    public Employees(){
        perList = new ArrayList<Person>();
    }
    
    public void add(Person person){
        perList.add(person);
    }
    
    public void add(List<Person> persons){
        for(Person person: persons){
            perList.add(person);
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = perList.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                iterator.remove();
            }
        }
    }
    
    public void print(){
        Iterator<Person> iterator = perList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = perList.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
}
