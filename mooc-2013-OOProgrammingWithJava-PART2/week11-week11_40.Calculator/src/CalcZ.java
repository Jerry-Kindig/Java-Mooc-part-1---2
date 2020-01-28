
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
public class CalcZ implements ActionListener{
    
    private JTextField input;
    private JTextField sum;
    private JButton z;
    
    public CalcZ(JTextField input, JTextField sum, JButton z){
        this.input = input;
        this.sum = sum;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.input.setText("");
        this.sum.setText("0");
        this.z.setEnabled(false);
    }
    
}
