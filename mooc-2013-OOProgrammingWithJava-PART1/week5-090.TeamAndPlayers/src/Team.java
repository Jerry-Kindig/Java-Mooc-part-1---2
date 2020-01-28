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

public class Team {
    private String name;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.members.size() >= this.maxSize){
            return;
        }
        this.members.add(player);
    }
    public void printPlayers(){
        for(Player player: this.members){
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    public int size(){
        return this.members.size();
    }
    public int goals(){
        int goals = 0;
        for(Player player: this.members){
            goals += player.goals();
        }
        return goals;
    }
}
