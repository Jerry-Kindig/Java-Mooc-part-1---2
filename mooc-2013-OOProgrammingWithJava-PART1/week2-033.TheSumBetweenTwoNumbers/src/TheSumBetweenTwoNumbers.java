
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int f = Integer.parseInt(reader.nextLine());
        System.out.print("\nSecond: ");
        int s = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while(f <= s){
            sum += f;
            f++;
        }
        System.out.println("The sum is " + sum);
    }
}
