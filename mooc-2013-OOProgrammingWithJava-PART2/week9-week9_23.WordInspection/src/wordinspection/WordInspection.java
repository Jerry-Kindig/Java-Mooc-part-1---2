/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jerry pc
 */
public class WordInspection {
    
    private final File file;
    private ArrayList<String> wordList;
    
    public WordInspection(File file) throws Exception{
        this.file = file;
        this.wordList = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while(reader.hasNextLine()){
            this.wordList.add(reader.nextLine());
        }
    }
    
    public int wordCount() throws Exception{
        int i = 0;
        for(String word: this.wordList){
            i++;
        }
        return i;
    }
    
    public List<String> wordsContainingZ(){
        ArrayList<String> zWords = new ArrayList<String>();
        for(String word: this.wordList){
            if(word.contains("z") || word.contains("Z")){
                zWords.add(word);
            }
        }
        return zWords;
    }
    
    public List<String> wordsEndingInL(){
        ArrayList<String> lWords = new ArrayList<String>();
        for(String word: this.wordList){
            if((word.charAt(word.length() - 1) + "").equals("l")){
                lWords.add(word);
            }
        }
        return lWords;
    }
    
    public List<String> palindromes(){
        ArrayList<String> pWords = new ArrayList<String>();
        for(String word: this.wordList){
            boolean palin = true;
            for(int i = 0; i < word.length() / 2; i++){
                if(!((word.charAt(word.length() - i - 1) + "").equals(word.charAt(i) + ""))){
                    palin = false;
                }
            }
            if(palin){
                pWords.add(word);
            }
        }
        return pWords;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        ArrayList<String> vWords = new ArrayList<String>();
        for(String word: wordList){
            if(word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")){
                vWords.add(word);
            }
        }
        return vWords;
    }
}
