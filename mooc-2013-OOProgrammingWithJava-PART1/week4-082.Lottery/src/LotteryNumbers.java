import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int i;
    private int x;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        random = new Random();
        i = 0;
        while(i < 7){
            x = random.nextInt(39) + 1;
            if(!this.containsNumber(x)){
                numbers.add(x);
                i++;
            }
        }
        
    }

    public boolean containsNumber(int number) {
        for(int num: numbers){
            if(num == number){
                return true;
            } 
        }
        return false;
    }
}
