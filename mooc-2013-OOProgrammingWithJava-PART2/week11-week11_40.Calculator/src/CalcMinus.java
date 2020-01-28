
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
public class CalcMinus implements ActionListener{
    
    private JTextField input;
    private JTextField sum;
    private JButton z;
    
    public CalcMinus(JTextField input, JTextField sum, JButton z){
        this.input = input;
        this.sum = sum;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int cur = Integer.parseInt(this.sum.getText());
            cur -= Integer.parseInt(this.input.getText());
            this.input.setText("");
            this.sum.setText("" + cur);
            if(Integer.parseInt(this.sum.getText()) != 0){
                this.z.setEnabled(true);
            } else {
                this.z.setEnabled(false);
            }
        }catch(NumberFormatException ee){
            this.input.setText("");
        }
    }
    
}
