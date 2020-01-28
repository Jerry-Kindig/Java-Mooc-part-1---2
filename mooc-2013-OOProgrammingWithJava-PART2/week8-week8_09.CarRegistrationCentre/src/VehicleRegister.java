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
import java.util.HashSet;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> ownerMap;
    
    public VehicleRegister(){
        this.ownerMap = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(ownerMap.containsKey(plate)){
            return false;
        } else {
            ownerMap.put(plate, owner);
            return true;
        }
    }
    
    public String get(RegistrationPlate plate){
        if(ownerMap.containsKey(plate)){
            return ownerMap.get(plate);
        } else {
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if(ownerMap.containsKey(plate)){
            ownerMap.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate: ownerMap.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        for(String s : new HashSet<String>(ownerMap.values())){
            System.out.println(s);
        }
    }
}
