
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        System.out.print("Type the first number: ");
        int number = Integer.parseInt(reader.nextLine());
        sum += number;
        System.out.print("Type the second number: ");
        number = Integer.parseInt(reader.nextLine());
        sum += number;
        System.out.print("Type the third number: ");
        number = Integer.parseInt(reader.nextLine());
        System.out.println("");
        sum += number;
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
