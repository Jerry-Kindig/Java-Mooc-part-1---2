
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        return new Money(added.euros + this.euros, added.cents + this.cents);
    }
    
    public boolean less(Money compared){
        return (this.euros < compared.euros || (this.euros == compared.euros() && this.cents < compared.cents));
    }
    
    public Money minus(Money decremented){
        int euro = this.euros - decremented.euros;
        int cent = this.cents - decremented.cents;
        if(cent < 0){
            euro--;
            cent = 100 + cent;
        }
        if(euro < 0){
            euro = 0;
            cent = 0;
        }
        return new Money(euro, cent);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
