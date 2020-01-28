/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerry pc
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private final List<Cow> cowsInBarn;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cowsInBarn = new ArrayList<Cow>();
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        this.cowsInBarn.add(cow);
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cowsInBarn);
    }

    @Override
    public void liveHour() {
        for(Cow cow: this.cowsInBarn){
            cow.liveHour();
        }
    }
    
    @Override
    public String toString(){
        String title = "Farm owner: " + this.owner
                + "\nBarn bulk tank: " + this.barn.getBulkTank().toString()
                + "\nAnimals: ";
       for(Cow cow: this.cowsInBarn){
           title += "\n     " + cow;
       }
       return title;         
    }
    
}
