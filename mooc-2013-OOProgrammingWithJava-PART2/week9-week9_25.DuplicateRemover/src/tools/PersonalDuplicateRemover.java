/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author jerry pc
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> wordSet;
    private int dups;
    
    public PersonalDuplicateRemover(){
        this.wordSet = new HashSet<String>();
        this.dups = 0;
    }

    @Override
    public void add(String characterString) {
        if(!wordSet.contains(characterString)){
            wordSet.add(characterString);
        } else {
            this.dups++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dups;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return wordSet;
    }

    @Override
    public void empty() {
        this.dups = 0;
        wordSet.clear();
    }
    
}
