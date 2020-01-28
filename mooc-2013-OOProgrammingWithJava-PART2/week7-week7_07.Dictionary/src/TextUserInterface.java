/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statement:"
                + "\nadd - adds a word pair to the dictionary"
                + "\ntranslate - asks a word and prints its translation"
                + "\nquit - quits the text user interface");
        while(true){
            System.out.print("\nStatement: ");
            String word = reader.nextLine();
            if(word.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(word.equals("add")){
                this.add();
            } else if(word.equals("translate")){
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    public void add(){
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String transWord = reader.nextLine();
        this.dictionary.add(word, transWord);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        if(this.dictionary.translate(word).isEmpty()){
            System.out.println("null");
        } else {
            System.out.print("Translation: " + this.dictionary.translate(word));
            System.out.println("");
        }    
    }
}
