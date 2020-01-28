
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        System.out.println("How many?");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        int count = 0;
        while(count < number){
            printText();
            count++;
        }
        // use the while structure to call the printText method several times
        
    }
}
