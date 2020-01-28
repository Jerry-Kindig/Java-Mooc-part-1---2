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

public class Container {
    
    private int weightLimit;
    private ArrayList<Suitcase> caseList;
    
    public Container(int weightLimit){
        this.weightLimit = weightLimit;
        this.caseList = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.caseWeight() + suitcase.totalWeight() <= weightLimit){
            this.caseList.add(suitcase);
        }
    }
    
    public int caseWeight(){
        int weight = 0;
        if(!caseList.isEmpty()){
            for(Suitcase suitcase: this.caseList){
                weight += suitcase.totalWeight();
            }
        }    
        return weight;
    }
    
    public void printThings(){
        for(Suitcase suitcase: this.caseList){
            suitcase.printThings();
        }
    }
    
    public String toString(){
        return this.caseList.size() + " suitcases (" + this.caseWeight() + " kg)";
    }
}
