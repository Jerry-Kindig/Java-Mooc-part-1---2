
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int i = Integer.parseInt(reader.nextLine());
        int point = 1;
        int sum = 0;
        while(point <= i){
            sum += point;
            point++;
        }
        System.out.println("Sum is " + sum);
    }
}
