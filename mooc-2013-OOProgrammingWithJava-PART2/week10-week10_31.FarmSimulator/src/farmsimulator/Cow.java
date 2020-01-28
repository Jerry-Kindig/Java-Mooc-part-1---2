/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Random;

/**
 *
 * @author jerry pc
 */
public class Cow implements Milkable, Alive{
    private String name;
    private double capacity;
    private double volume;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    
    public Cow(String name){
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.volume = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.volume;
    }
    
    @Override
    public String toString(){
        return this.name + " " + Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

    @Override
    public double milk() {
        double temp = this.volume;
        this.volume = 0;
        return temp;
    }

    @Override
    public void liveHour() {
        double amount = (double)(new Random().nextInt(14) + 7)/10;
        if(this.volume + amount >= this.capacity){
            this.volume = this.capacity;
        } else {
            this.volume += amount;
        }
    }
}
