
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name = "";
        String studentNumber = "";
        
        while(true){
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        System.out.println("");
        for(Student student: list){
            System.out.println(student);
        }
        System.out.print("\nGive search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for(Student student: list){
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}