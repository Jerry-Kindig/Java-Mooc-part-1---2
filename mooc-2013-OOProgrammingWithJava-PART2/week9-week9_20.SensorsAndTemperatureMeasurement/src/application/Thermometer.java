/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author jerry pc
 */
public class Thermometer implements Sensor{
    private boolean onOff;
    
    public Thermometer(){
        this.onOff = false;
    }

    @Override
    public boolean isOn() {
        return this.onOff;
    }

    @Override
    public void on() {
        this.onOff = true;
    }

    @Override
    public void off() {
        this.onOff = false;
    }

    @Override
    public int measure() {
        Random r = new Random();
        if(this.onOff == true){
            return r.nextInt(60) - 30;
        } else {
            throw new IllegalStateException("bad");
        }
    }
    
}
