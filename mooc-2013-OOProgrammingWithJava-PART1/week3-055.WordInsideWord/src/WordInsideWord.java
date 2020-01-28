
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String one = reader.nextLine();
        System.out.print("Type the second word: ");
        String two = reader.nextLine();
        if(one.indexOf(two) != -1){
            System.out.println("The word '" + two + "' is found in the word '" + one + "'.");
        } else {
            System.out.println("The word '" + two + "' is not found in the word '" + one + "'.");
        }
    }
}
