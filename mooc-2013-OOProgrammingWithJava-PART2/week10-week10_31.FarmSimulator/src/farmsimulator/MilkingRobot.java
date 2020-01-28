/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author jerry pc
 */
public class MilkingRobot {
    private BulkTank curTank;
    
    public MilkingRobot(){
        this.curTank = null;
    }
    
    public BulkTank getBulkTank(){
        return this.curTank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.curTank = tank;
    }
    
    public void milk(Milkable milkable){
        try{
            this.curTank.addToTank(milkable.milk());
        } catch (Exception e){
            throw new IllegalStateException();
        }
    }
}
