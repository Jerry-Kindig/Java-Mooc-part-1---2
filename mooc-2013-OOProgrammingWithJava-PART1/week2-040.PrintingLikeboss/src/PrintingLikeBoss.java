public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i<amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int star = 1;
        int white = size - 1;
        while(i<size){
            printWhitespaces(white);
            white--;
            printStars(star);
            star++;
            i++;
        }
        
    }

    public static void xmasTree(int height) {
        int i = 0;
        int star = 1;
        int white = height - 1;
        while(i<height){
            printWhitespaces(white);
            white--;
            printStars(star);
            star+=2;
            i++;
        }
        i = 0;
        while(i<2){
            printWhitespaces(height-2);
            printStars(3);
            i++;
        }
        
    }
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
