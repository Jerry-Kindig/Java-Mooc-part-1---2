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

public class Phonebook {
    
    private ArrayList<Person> phoneBook;
    
    public Phonebook(){
        this.phoneBook = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        phoneBook.add(newPerson);
    }
    
    public void printAll(){
        for(Person person: phoneBook){
            System.out.println(person);
        }
    }
    
    public String searchNumber(String number){
        for(Person person: this.phoneBook){
            if(person.getName().contains(number)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
