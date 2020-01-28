/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Skiier implements Comparable<Skiier>{
    
    private String name;
    private int score;
    private Random rand;
    private ArrayList<Integer> lengths;
    
    public Skiier(String name){
        this.name = name;
        this.score = 0;
        this.rand = new Random();
        this.lengths = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.score;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.score + " points)";
    }
    
    @Override
    public int compareTo(Skiier other){
        return other.score - this.score;
    }
    
    public String newRound(){
        int roundScore = 0;
        int length = 0;
        roundScore += rand.nextInt(60) + 61;
        length = roundScore;
        this.lengths.add(length);
        int[] judges = new int[5];
        for(int i = 0; i < 5; i++){
            judges[i] = rand.nextInt(10) + 11;
        }
        Arrays.sort(judges);
        roundScore += judges[1] + judges[2] + judges[3];
        this.score += roundScore;
        return "  " + this.name 
                + "\n    length: " + length
                + "\n    judge votes: " + Arrays.toString(judges);
    }
    
    public String jumpLengths(){
        String jump = "            jump lengths: ";
        int comma = this.lengths.size() - 1;
        for(int i: this.lengths){
            jump += i + " m";
            if(comma > 0){
                jump += ", ";
                comma--;
            }
        }
        return jump;
    }
}
