
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String name = reader.nextLine();
        System.out.print("\nType your password: ");
        String name2 = reader.nextLine();
        if(name.equals("alex") && name2.equals("mightyducks")){
            System.out.println("You are now logged into the system!");
        } else if(name.equals("emily") && name2.equals("cat")){
            System.out.println("You are now logged into the system");
        } else {
            System.out.println("Your username or password is invalid");
        }
    }
}
