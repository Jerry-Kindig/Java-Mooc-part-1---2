import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    public static int[] copy(int[] array){
        return array.clone();
    }
    
    public static int[] reverseCopy(int[] array){
        int len = array.length - 1;
        int[] newArray = new int[len + 1];
        for(int i = 0; i <= len; i++){
            newArray[len - i] = array[i];
        }
        return newArray;   
    }
}
