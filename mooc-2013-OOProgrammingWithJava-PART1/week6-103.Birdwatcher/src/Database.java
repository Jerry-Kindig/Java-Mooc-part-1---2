/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
    private Scanner reader; 
    private ArrayList<Bird> database;
    
    public Database(Scanner reader){
        this.reader = reader;
        this.database = new ArrayList<Bird>();
    }
    
    public void add(){
        boolean truth = true;
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        Bird birdy = new Bird(name, latinName);
        for(Bird bird: database){
            if(bird.getName().equals(name) || bird.getLatinName().equals(latinName)){
                truth = false;
            }
        }
        if(truth){
            database.add(birdy);
        }
    }
    
    public void observation(){
        System.out.println("What was observed:? ");
        String birdName = this.reader.nextLine();
        for(Bird bird: database){
            if(birdName.equals(bird.getName())){
                bird.observe();
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void statistics(){
        for(Bird bird: database){
            this.printBird(bird);
        }
    }
    
    public void show(){
        System.out.print("What? ");
        String birdy = this.reader.nextLine();
        for(Bird bird: database){
            if(bird.getName().equals(birdy)){
                this.printBird(bird);
            }
        }
    }
    
    public void printBird(Bird bird){
        System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getTimesObserved());
    }
}
