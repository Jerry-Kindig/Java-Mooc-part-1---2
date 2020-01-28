/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author jerry pc
 */
public class Film {
    private String name;
    
    public Film(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    @Override
    public boolean equals(Object film){
        if(film == null){
            return false;
        } else if (this.getClass() != film.getClass()){
            return false;
        }
        Film filmm = (Film) film;
        if(this.getName() == null || filmm.getName() == null){
            return false;
        }
        return this.getName().equals(filmm.getName());
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        return hash * name.hashCode();
    }   
}
