/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jerry pc
 */
public class CompoundFigure extends Figure{
    
    private List<Figure> figList;
    
    public CompoundFigure(){
        super(0, 0);
        figList = new ArrayList<Figure>();
    }
    
    public void add(Figure figure){
        figList.add(figure);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Figure fig: figList){
            fig.move(dx, dy);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure fig: figList){
            fig.draw(graphics);
        }
    }
    
}
