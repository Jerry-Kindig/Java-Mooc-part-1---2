/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.*;
import reference.domain.*;

/**
 *
 * @author jerry pc
 */
public class Reference {
    private RatingRegister ratingReg;
    
    public Reference(RatingRegister ratingReg){
        this.ratingReg = ratingReg;
    }
    
    public Film recommendFilm(Person person){
        if(!ratingReg.reviewers().contains(person)){
            List<Film> films = new ArrayList<Film>(ratingReg.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(ratingReg.filmRatings()));
            return films.get(0);
        }
        if(ratingReg.getPersonalRatings(person).isEmpty() ){
            List<Film> films = new ArrayList<Film>(ratingReg.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(ratingReg.filmRatings()));
            return films.get(0);
        }
        Map<Person, Integer> reviewerSim = reviewerSim(person);
        Person reviewer = reviewerBySimSorted(reviewerSim);
        return getRecommendedFilm(person, reviewer);
    }
    
    private Map<Person, Integer> reviewerSim(Person person){
        Map<Person, Integer> reviewerSim = new HashMap<Person, Integer>();
        for(Person reviewer: ratingReg.reviewers()){
            if(reviewer != person){
                int similarty = 0;
                Map<Film, Rating> reviewerRating = ratingReg.getPersonalRatings(reviewer);
                Map<Film, Rating> personRating = ratingReg.getPersonalRatings(person);
                for(Film film: personRating.keySet()){
                    if(reviewerRating.containsKey(film)){
                        similarty += reviewerRating.get(film).getValue() * personRating.get(film).getValue();
                    }
                }
                reviewerSim.put(reviewer, similarty);
            }
        }
        return reviewerSim;
    }
    
    private Person reviewerBySimSorted(Map<Person, Integer> reviewerSim){
        Person highestScorer;
        List<Person> unsorted = new ArrayList<Person>();
        for(Person reviewer: reviewerSim.keySet()){
            unsorted.add(reviewer);
        }
        highestScorer = unsorted.get(0);
        for(Person reviewer: unsorted){
            if(reviewerSim.get(reviewer) > reviewerSim.get(highestScorer)){
                highestScorer = reviewer;
            }
        }
        return highestScorer;
    }
    
    private Film getRecommendedFilm(Person viewer, Person reviewer){
        Map<Film, Rating> rankedFilms = ratingReg.getPersonalRatings(reviewer);
        List<Film> unWatched = new ArrayList<Film>();
        for(Film film: rankedFilms.keySet()){
            if(!ratingReg.getPersonalRatings(viewer).containsKey(film)){
                unWatched.add(film);
            }
        }
        if(unWatched.isEmpty()){
            return null;
        } else {
            Film topFilm = unWatched.get(0);
            for(Film film: unWatched){
                if(rankedFilms.get(film).getValue() > rankedFilms.get(topFilm).getValue()){
                    topFilm = film;
                }
            }
            return topFilm;
        }
    }
}
