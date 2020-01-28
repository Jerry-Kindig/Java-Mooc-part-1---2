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
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> transMap;
    
    public Dictionary(){
        this.transMap = new HashMap<String, String>();
    }
    
    public String translate(String word){
        return transMap.get(word);
    }
    
    public void add(String word, String translation){
        transMap.put(word, translation);
    }
    
    public int amountOfWords(){
        return transMap.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> arrList = new ArrayList<String>();
        for(String key: transMap.keySet()){
            arrList.add(key + " = " + transMap.get(key));
        }
        return arrList;
    }    
}
