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
import java.io.File;

public class Printer {
    private File file;
    
    public Printer(String filename) throws Exception{
        this.file = new File(filename);
    }
    
    public void printLinesWhichContain(String word)throws Exception{
        Scanner reader = new Scanner(this.file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
    }
}
