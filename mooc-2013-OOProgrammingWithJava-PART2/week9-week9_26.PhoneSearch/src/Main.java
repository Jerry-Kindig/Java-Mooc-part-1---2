import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!

        welcomeMessage();

        Scanner reader = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        while (true) {

            String userInput; //stores the user input here

            System.out.print("\ncommand: ");

            userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            } else if (userInput.equalsIgnoreCase("1")) {
                addNumber(reader, contactBook);
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.print("whose number: ");
                String inputName = reader.nextLine();
                searchNumber(inputName, contactBook);
            } else if (userInput.equalsIgnoreCase("3")) {
                System.out.print("number: ");
                String inputNumber = reader.nextLine();
                searchName(inputNumber, contactBook);
            } else if (userInput.equalsIgnoreCase("4")) {
                addAddress(reader, contactBook);
            } else if (userInput.equalsIgnoreCase("5")) {
                System.out.print("whose information: ");
                String inputName = reader.nextLine();
                searchNumberAndAddress(inputName, contactBook);
            } else if (userInput.equalsIgnoreCase("6")) {
                System.out.print("whose information: ");
                String inputName = reader.nextLine();
                deleteNumberAndAddress(inputName, contactBook);
            } else if (userInput.equalsIgnoreCase("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String inputName = reader.nextLine();
                filteredListing(inputName, contactBook);
            }
        }
    }

    //this contains all the message that are displayed at the begining of the program
    private static void welcomeMessage() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    //this method adds name to the contact
    private static void addNumber(Scanner reader, ContactBook contactBook) {
        System.out.print("whose number: ");
        String inputName = reader.nextLine();
        Contact contact;
        for(Contact c: contactBook.getContacts()){
            if (c.getName().equalsIgnoreCase(inputName)){
                contactBook.addContact(c);
                System.out.print("number: ");
                String inputNumber = reader.nextLine();
                c.addNumber(inputNumber);
                return;
            }
        }
        contact = new Contact(inputName);
        contactBook.addContact(contact);
        System.out.print("number: ");
        String inputNumber = reader.nextLine();
        contact.addNumber(inputNumber);
    }

    //this method searches the phone number of the contact by its name
    private static void searchNumber(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                for (int i = 0; i < c.getNumber().size(); i++) {
                    System.out.println(" " + c.getNumber().get(i));
                }
                return;
            }
        }
        System.out.println("not found");
    }

//this method searches name of the contact by its phone number
    private static void searchName(String number, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if(!c.getNumber().isEmpty()){
                for(String num: c.getNumber()){
                    if (num.contains(number)) {
                        System.out.println(c.getName());
                        return;
                    }
                }
            }
        }
        System.out.println("not found");
    }

    //this method adds address to the contact
    private static void addAddress(Scanner reader, ContactBook contactBook) {
        System.out.println("whose address: ");
        String inputName = reader.nextLine();
        Contact contact;
        for(Contact c: contactBook.getContacts()){
            if (c.getName().equalsIgnoreCase(inputName)){
                contactBook.addContact(c);
                System.out.println("street: ");
                String inputStreet = reader.nextLine();
                System.out.println("city: ");
                String inputAddress = reader.nextLine();
                c.addAddress(inputStreet + " " + inputAddress);
                return;
            }
        }
        contact = new Contact(inputName);
        contactBook.addContact(contact);
        System.out.println("street: ");
        String inputStreet = reader.nextLine();
        System.out.println("city: ");
        String inputAddress = reader.nextLine();
        contact.addAddress(inputStreet + " " + inputAddress);
    }

    //this method searches for both the phone number and the address of the contact
    private static void searchNumberAndAddress(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                if(c.getAddress().isEmpty()){
                    System.out.println("  address unknown");
                }
                for (int i = 0; i < c.getAddress().size(); i++) {
                    System.out.println("  " + c.getAddress().get(i));
                }
                if(c.getNumber().isEmpty()){
                    System.out.println("  phone number not found");
                }
                for (int i = 0; i < c.getNumber().size(); i++) {
                    System.out.println("  " + c.getNumber().get(i));
                }
                return;
            }
            System.out.println("not found");
        }
    }

    private static void deleteNumberAndAddress(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.getNumber().clear();
                c.getAddress().clear();
                return;
            }
        }
        System.out.println("not found");
    }
    
    private static void filteredListing(String inputName, ContactBook cb){
        boolean contains = false;
        List<String> nameList = new ArrayList<String>();
        if(inputName.isEmpty()){
            for(Contact contact: cb.getContacts()){
                nameList.add(contact.getName());
            }
            Collections.sort(nameList);
            for(String str: nameList){
                for(Contact contact: cb.getContacts()){
                    if(contact.getName().contains(str)){
                        System.out.println("\n " + contact.getName());
                        if(contact.getAddress().isEmpty()){
                            System.out.println("  address unknown");
                        } else {
                            for(String address: contact.getAddress()){
                                System.out.println("  " + address);
                            }
                        }
                        if(contact.getNumber().isEmpty()){
                            System.out.println(" phone number not found");
                        } else {
                            for(String number: contact.getNumber()){
                                System.out.println("   " + number);
                            }
                        }
                    } 
                }
            }
            return;
        }
        Map<String, Contact> contactMap = new HashMap<String, Contact>();
        for(Contact contact: cb.getContacts()){
            if(contact.getName().contains(inputName) || addressContains(inputName, contact)){
                nameList.add(contact.getName());
                contactMap.put(contact.getName(), contact);
                contains = true;
            }
        }
        Collections.sort(nameList);
        for(String name: nameList){
            System.out.println("\n " + name);
            if(contactMap.get(name).getAddress().isEmpty()){
                System.out.println("  address unknown");
            } else {
                for(String address: contactMap.get(name).getAddress()){
                    System.out.println("  " + address);
                }
            }
            if(contactMap.get(name).getNumber().isEmpty()){
                System.out.println(" phone number not found");
            } else {
                for(String number: contactMap.get(name).getNumber()){
                    System.out.println("   " + number);
                }
            }
        }
        if(!contains){
            System.out.println(" keyword not found");
        }
    }
    
    private static boolean addressContains(String input, Contact contact){
        for(String address: contact.getAddress()){
            if(address.contains(input)){
                return true;
            }
        }
        return false;
    }
}