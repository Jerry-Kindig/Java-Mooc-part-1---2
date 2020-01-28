
public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if(this.balance - amount < 0){
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}
