/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jerry pc
 */
public class ActionEventListener implements ActionListener{
    
    private JTextField origin;
    private JLabel destination;
    private Scanner reader;
    
    public ActionEventListener(JTextField top, JLabel bottom){
        this.origin = top;
        this.destination = bottom;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
    
}
