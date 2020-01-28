/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loanMap;
    
    public PromissoryNote(){
        loanMap = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        loanMap.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(loanMap.get(whose) != null){
            return loanMap.get(whose);
        } else {
            return 0;
        }
    }
}
