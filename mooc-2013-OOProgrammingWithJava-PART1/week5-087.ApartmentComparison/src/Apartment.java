
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment other){
        return this.squareMeters > other.squareMeters;
    }
    
    public int priceDifference(Apartment other){
        int c = (this.pricePerSquareMeter * this.squareMeters) - (other.pricePerSquareMeter * other.squareMeters);
        if(c < 0){
            c *= -1;
        }
        return c;
    }
    
    public boolean moreExpensiveThan(Apartment other){
        return (this.pricePerSquareMeter * this.squareMeters) > (other.pricePerSquareMeter * other.squareMeters);
    }
    
}
