
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 1;
        while(true){
            System.out.print("Guess a number: ");
            int i = Integer.parseInt(reader.nextLine());
            if(i == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (i < numberDrawn){
                System.out.println("The number is greater, guesses made: " + guess);
            } else {
                System.out.println("The number is lesser, guesses made: " + guess);
            }
            guess++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
