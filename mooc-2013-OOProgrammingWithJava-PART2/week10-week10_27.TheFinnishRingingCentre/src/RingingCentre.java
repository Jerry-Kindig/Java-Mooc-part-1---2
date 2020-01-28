/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    private Map<Bird, List<String>> birdIndex;
    
    public RingingCentre(){
        this.birdIndex = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        List places;
        if(!this.birdIndex.containsKey(bird)){
            this.birdIndex.put(bird, new ArrayList<String>());
        }
        places = this.birdIndex.get(bird);
        places.add(place);
        this.birdIndex.put(bird, places);
    }
    
    public void observations(Bird bird){
        if(!this.birdIndex.containsKey(bird)){
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird + " observations: " + this.birdIndex.get(bird).size());
            for(String location: this.birdIndex.get(bird)){
                System.out.print(location + "\n");
            }
        }
    }
}
