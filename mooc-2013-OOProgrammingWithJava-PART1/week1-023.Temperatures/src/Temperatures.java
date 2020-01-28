
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("Type a temperature: ");
            double number = Double.parseDouble(reader.nextLine());
            if(number > -29 && number < 41){
                Graph.addNumber(number);
            }
        }
    }
}
