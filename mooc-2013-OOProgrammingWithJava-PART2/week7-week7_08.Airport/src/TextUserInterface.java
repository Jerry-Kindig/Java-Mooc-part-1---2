/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Airport airport;
    
    public TextUserInterface(Scanner reader, Airport airport){
        this.reader = reader;
        this.airport = airport;
    }
    
    public void start(){
        this.airportPanel();
        this.flightService();
    }
    
    public void airportPanel(){
        System.out.println("Airport panel\n--------------------\n");
        String selection = "";
        String flightPath = "";
        while(true){
            System.out.print("Choose operation: "
            + "\n[1] Add airplane"
            + "\n[2] Add flight"
            + "\n[x] Exit"
            + "\n>");
            selection = this.reader.nextLine();
            if(selection.equals("1")){
                System.out.print("Give plane ID: ");
                selection = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                this.airport.addPlane(selection, Integer.parseInt(this.reader.nextLine()));
            } else if(selection.equals("2")){
                System.out.print("Give plane ID: ");
                selection = reader.nextLine();
                System.out.print("Give departure airport code: ");
                flightPath = reader.nextLine();
                System.out.print("Give destination airport code: ");
                flightPath = flightPath + "-" + this.reader.nextLine();
                this.airport.addFlight(selection, flightPath);
            } else if(selection.equals("x")){
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("");
    }
    
    public void flightService(){
        System.out.println("\nFlight service\n--------------------\n");
        String selection = "";
        while(true){
            System.out.print("Choose operation: "
            + "\n[1] Print planes"
            + "\n[2] Print flights"
            + "\n[3] Print plane info"
            + "\n[x] Quit"
            + "\n>");
            selection = this.reader.nextLine();
            if(selection.equals("1")){
                this.airport.printPlanes();
            } else if(selection.equals("2")){
                this.airport.printFlights();
            } else if(selection.equals("3")){
                System.out.print("Give plane ID: ");
                selection = reader.nextLine();
                this.airport.printPlane(selection);
            } else if(selection.equals("x")){
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
