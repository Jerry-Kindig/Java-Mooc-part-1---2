import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int i = Integer.parseInt(reader.nextLine());
        int point = 1;
        int sum = 1;
        while(point<=i){
            sum *= point;
            point++;
        }
        System.out.println("Factorial is " + sum);
    }
}
