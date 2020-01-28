
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString){
        int length = characterString.length();
        String indent = "";
        int smileyLength = length + 6;
        if(length % 2 == 1){
            smileyLength++;
            indent = " ";
        }
        printSmileyRow(smileyLength);
        System.out.println(":) " + characterString + indent + " :)");
        printSmileyRow(smileyLength);
    }
    private static void printSmileyRow(int length){
        for(int i = 0; i < length; i+=2){
             System.out.print(":)");
        }
        System.out.println();
    }

}
