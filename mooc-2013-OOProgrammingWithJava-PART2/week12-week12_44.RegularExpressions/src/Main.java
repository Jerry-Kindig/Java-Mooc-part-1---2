
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String word = reader.nextLine();
        if(clockTime(word)){
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
    }
        // write test code here
    
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        return string.matches("[aeuioäö]*");
    }
    
    public static boolean clockTime(String string){
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}
