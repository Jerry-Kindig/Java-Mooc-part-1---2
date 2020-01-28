/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
public class Player {
    private int goalNum;
    private String name;
    
    public Player(String name, int goalNum){
        this.goalNum = goalNum;
        this.name = name;
    }
    public Player(String name){
        this(name, 0);
    }
    public int goals(){
        return this.goalNum;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Player: " + this.name + ", goals " + this.goalNum;
    }
}
