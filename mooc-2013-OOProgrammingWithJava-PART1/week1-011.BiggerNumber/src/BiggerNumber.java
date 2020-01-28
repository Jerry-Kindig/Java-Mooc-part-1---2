
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("\ntype another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("\nThe bigger of the two numbers given was: " + Math.max(number, number2));
        // Implement your program here. Remember to ask the input from user
    }
}
