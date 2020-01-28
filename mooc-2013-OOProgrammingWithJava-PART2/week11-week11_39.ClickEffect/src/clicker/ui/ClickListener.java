/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author jerry pc
 */
public class ClickListener implements ActionListener{
    private Calculator calc;
    private JLabel jLab;
    
    public ClickListener(Calculator calc, JLabel jLab){
        this.calc = calc;
        this.jLab = jLab;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        String count = Integer.toString(this.calc.giveValue());
        this.jLab.setText(count);
    }
    
}
