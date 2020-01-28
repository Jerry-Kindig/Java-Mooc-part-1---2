import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int length = text.length();
        int count = 0;
        while(count < length / 2){
            if(text.charAt(count) != text.charAt((length -1) - count)){
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
