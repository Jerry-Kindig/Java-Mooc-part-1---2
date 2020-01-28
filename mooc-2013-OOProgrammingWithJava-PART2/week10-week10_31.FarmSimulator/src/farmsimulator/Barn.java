/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Collection;
/**
 *
 * @author jerry pc
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkBot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
        this.milkBot = null;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkBot = milkingRobot;
        milkingRobot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        try {
            this.milkBot.milk(cow);
        } catch (Exception e){
            throw new IllegalStateException();
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        for(Cow cow: cows){
            this.takeCareOf(cow);
        }
    }
    
    @Override
    public String toString(){
        return "Barn: " + Math.ceil(this.getBulkTank().getVolume()) + "/" + Math.ceil(this.getBulkTank().getCapacity()); 
    }
}
