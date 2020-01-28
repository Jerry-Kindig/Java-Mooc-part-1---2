import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        TextUserInterface ui = new TextUserInterface(reader, airport);
        ui.start();
        // Write your main program here. Implementing your own classes will be useful.
    }
}
