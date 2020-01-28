/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jerry pc
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double max = this.history.get(0);
        for(Double dub: this.history){
            if(dub > max){
                max = dub;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double min = this.history.get(0);
        for(Double dub: this.history){
            if(dub < min){
                min = dub;
            }
        }
        return min;
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        double total = 0;
        for(Double dub: this.history){
            total += dub;
        }
        return total / this.history.size();
    }
    
    public double greatestFluctuation(){
        if(this.history.size() <= 1){
            return 0;
        }
        Double previous = this.history.get(0);
        Double fluctuation = 0.0;
        for(Double dub: this.history){
            if(Math.abs(dub - previous) > fluctuation){
                fluctuation = (Math.abs(dub - previous));
            }
            previous = dub;
        }
        return fluctuation;
    }
    public double variance(){
        if(this.history.size() <= 1){
            return 0;
        }
        Double average = this.average();
        Double variance = 0.0;
        for(Double dub: this.history){
            variance += (average - dub)*(average - dub);
        }
        variance /= this.history.size() - 1;
        return variance;
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
}
