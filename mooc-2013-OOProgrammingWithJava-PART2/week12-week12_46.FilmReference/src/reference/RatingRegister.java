/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author jerry pc
 */
public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> reviewerRatings;
    
    public RatingRegister(){
        filmRatings = new HashMap<Film, List<Rating>>();
        reviewerRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!filmRatings.containsKey(film)){
            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film){
        return filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return filmRatings;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!reviewerRatings.containsKey(person)){
            reviewerRatings.put(person, new HashMap<Film, Rating>());
        }
        if(!reviewerRatings.get(person).containsKey(film)){
            reviewerRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film){
        if(reviewerRatings.get(person).containsKey(film)){
            return reviewerRatings.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!reviewers().contains(person)){
            reviewerRatings.put(person, new HashMap<Film, Rating>());
        }
        return reviewerRatings.get(person);
    }
    
    public List<Person> reviewers(){
        return new ArrayList<Person>(reviewerRatings.keySet());
    }
}
