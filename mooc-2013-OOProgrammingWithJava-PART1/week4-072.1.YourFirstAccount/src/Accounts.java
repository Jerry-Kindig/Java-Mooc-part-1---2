
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account jerryAcc = new Account("Jerry's account", 100.00);
        
        jerryAcc.deposit(20.0);
        
        System.out.println(jerryAcc);
    }

}
