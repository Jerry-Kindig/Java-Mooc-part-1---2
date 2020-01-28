/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jerry pc
 */
public class DrawingBoard extends JPanel{
    private Figure obj;
    
    public DrawingBoard(Figure obj){
        super.setBackground(Color.WHITE);
        this.obj = obj;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.obj.draw(g);
    }
}
