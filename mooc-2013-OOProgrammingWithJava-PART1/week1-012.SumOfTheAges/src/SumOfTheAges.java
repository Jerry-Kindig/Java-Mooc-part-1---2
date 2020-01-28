
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text1 = reader.nextLine();
        System.out.print("\nType your age: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.print("\nType your name: ");
        String text2 = reader.nextLine();
        System.out.print("\nType your age: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println(text1 + " and " + text2 + " are " + (number1 + number2) + " years old in total.");
        
        // Implement your program here
    }
}
