import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        NumberStatistics numStat = new NumberStatistics();
        NumberStatistics numStatEven = new NumberStatistics();
        NumberStatistics numStatOdd = new NumberStatistics();
        int i;
        
        System.out.println("Type numbers: ");
        
        while(true){
            i = Integer.parseInt(reader.nextLine());
            if(i == -1){
                break;
            } else if(i % 2 == 0){
                numStatEven.addNumber(i);
            } else {
                numStatOdd.addNumber(i);
            }
            numStat.addNumber(i);
        }
        
        System.out.println("sum: " + numStat.sum());
        System.out.println("sum of even: " + numStatEven.sum());
        System.out.println("sum of odd: " + numStatOdd.sum());
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
