/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerry pc
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensList;
    private ArrayList<Integer> measList;
    
    public AverageSensor(){
        this.sensList = new ArrayList<Sensor>();
        this.measList = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        boolean on = true;
        for(Sensor sensor: this.sensList){
            if(sensor.isOn() == false){
                on = false;
            }
        }
        return on;
    }

    @Override
    public void on() {
        for(Sensor sensor: this.sensList){
            sensor.on();
        }
    }

    @Override
    public void off() {
        boolean oneOff = false;
        for(Sensor sensor: this.sensList){
            if(sensor.isOn() == false){
                oneOff = true;
                return;
            }
        }
        this.sensList.get(0).off();
    }

    @Override
    public int measure() {
        if(this.sensList.isEmpty() || this.isOn() == false){
            throw new IllegalStateException("badbad");
        }
        int average = 0;
        for(Sensor sensor: this.sensList){
            int i = sensor.measure();
            average += i;
        }
        average /= this.sensList.size();
        this.measList.add(average);
        return average;
    }
    
    public void addSensor(Sensor additional){
        this.sensList.add(additional);
    }
    
    public List<Integer> readings(){
        return this.measList;
    }
    
}
