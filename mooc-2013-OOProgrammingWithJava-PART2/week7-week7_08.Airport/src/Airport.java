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

public class Airport {
    
    private ArrayList<String> flightList;
    private ArrayList<Plane> planeList;
    
    public Airport(){
        flightList = new ArrayList<String>();
        planeList = new ArrayList<Plane>();
    }
    
    public void addPlane(String name, int capacity){
        planeList.add(new Plane(name, capacity));
    }
    
    public void addFlight(String name, String toFrom){
        String flightString = "";
        for(Plane plane: planeList){
            if(plane.getName().equals(name)){
                flightList.add(plane + " (" + toFrom + ")");
            }
        }
    }
    
    public void printPlane(String name){
        for(Plane plane: planeList){
            if(plane.getName().equals(name)){
                System.out.println(plane);
                break;
            }
        }
        System.out.println("Unknown Flight");
    }
    
    public void printPlanes(){
        for(Plane plane: planeList){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for(String flight: flightList){
            System.out.println(flight);
        }
    }
    
}
