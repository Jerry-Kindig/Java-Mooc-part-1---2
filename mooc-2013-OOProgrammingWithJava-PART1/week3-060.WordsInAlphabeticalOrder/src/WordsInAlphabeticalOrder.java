
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> teachers = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty()){
                System.out.println("You typed the following words: ");
                Collections.sort(teachers);
                for(String teacher: teachers){
                    System.out.println(teacher);
                }
                break;
            }
            teachers.add(word);
        }
        // create here an ArrayList
    }
}
