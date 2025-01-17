
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        amountOfNumbers = 0;
        sum = 0;
    }
    public void addNumber(int number){
        this.amountOfNumbers++;
        this.sum += number;
    }
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(this.amountOfNumbers == 0){
            return 0;
        } else {
            return (double) this.sum / this.amountOfNumbers;
        }
    }
}
