
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int f = Integer.parseInt(reader.nextLine());
        System.out.print("\nLast: ");
        int l = Integer.parseInt(reader.nextLine());
        if(f <= l){
            while(f <= l){
                System.out.println(f);
                f++;
            }
        }
        // write your code here

    }
}
