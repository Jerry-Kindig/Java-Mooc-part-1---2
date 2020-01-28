
public class Accounts {

    public static void main(String[] args) {
        Account mattAcc = new Account("Matt's account", 1000);
        Account myAcc = new Account("My account", 0);
        
        mattAcc.withdrawal(100.0);
        myAcc.deposit(100.0);
        
        System.out.println(mattAcc);
        System.out.println(myAcc);
      
    }

}
