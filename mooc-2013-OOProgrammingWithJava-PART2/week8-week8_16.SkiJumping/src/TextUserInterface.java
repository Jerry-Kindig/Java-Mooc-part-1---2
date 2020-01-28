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
    
    public TextUserInterface(Scanner reader){
        this.reader = reader;
    }
    
    public void start(){
        Contestants skiiers = new Contestants();
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            }
            skiiers.add(name);
        }
        System.out.println("\nThe tournament begins!");
        int i = 0;
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if(!command.equals("jump")){
                break;
            }
            i++;
            System.out.println("\nRound " + i);
            System.out.println("\nJumping order:");
            System.out.println(skiiers.jumpOrder());
            System.out.println("\nResults of round " + i);
            System.out.println(skiiers.newRound());
        }
        System.out.println("\nThanks!");
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        System.out.println(skiiers.results());
    }
}
