
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int c = 0;
        int sum = 0;
        while(c <= number){
            sum += (int)Math.pow(2, c);
            c++;
        }
        System.out.println("The result is " + sum);
    }
}
