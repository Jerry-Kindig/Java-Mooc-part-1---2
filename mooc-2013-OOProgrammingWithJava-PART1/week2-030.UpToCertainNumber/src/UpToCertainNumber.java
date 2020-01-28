
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int i = Integer.parseInt(reader.nextLine());
        int c = 1;
        while(c <= i){
            System.out.println(c);
            c++;
        }
             
        // Write your code here
        
    }
}
