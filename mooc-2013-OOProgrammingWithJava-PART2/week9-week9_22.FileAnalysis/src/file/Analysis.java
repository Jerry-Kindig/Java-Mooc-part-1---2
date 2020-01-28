/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jerry pc
 */
public class Analysis {
    private File file;
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws Exception{
        Scanner reader = new Scanner(this.file);
        int i = 0;
        while(reader.hasNextLine()){
            reader.nextLine();
            i++;
        }
        return i;
    }
    
    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int i = 0;
        while(reader.hasNextLine()){
            i++;
            String line = reader.nextLine();
            i += line.length();
        }
        return i;
    }
}
