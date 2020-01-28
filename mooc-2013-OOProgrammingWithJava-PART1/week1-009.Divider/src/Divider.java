
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("\nType another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        double number3 = (double) number / number2;
        System.out.println("\nDivision: " + number + " / " + number2 + " = " + number3);
        // Implement your program here. Remember to ask the input from user.
    }
}
