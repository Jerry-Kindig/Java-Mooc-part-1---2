/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author jerry pc
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.containerHistory.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double vol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerHistory.add(this.getVolume());
        return vol - this.getVolume();
    }
    
    public String history(){
        return this.containerHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.containerHistory.maxValue());
        System.out.println("Smallest product amount: " + this.containerHistory.minValue());
        System.out.println("Average: " + this.containerHistory.average());
        System.out.println("Greatest change: " + this.containerHistory.greatestFluctuation());
        System.out.println("Variance: " + this.containerHistory.variance());
    } 
}
