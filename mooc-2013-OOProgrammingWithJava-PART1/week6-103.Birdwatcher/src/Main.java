import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database(scanner);
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();
            if(command.equals("Add")){
                database.add();
            }
            if(command.equals("Observation")){
                database.observation();
            }
            if(command.equals("Statistics")){
                database.statistics();
            }
            if(command.equals("Show")){
                database.show();
            }
            if(command.equals("Quit")){
                break;
            }
        }
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
