package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random random;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        random = new Random();
        
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        newApple();
        while (worm.runsInto(apple)) {
            newApple();
        }

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(!continues){
            return;
        }
        worm.move();
        if(worm.runsInto(apple)){
            worm.grow();
            newApple();
        }
        if(worm.runsIntoItself()){
            continues = false;
        }
        if(worm.getHead().getX() == 0 || worm.getHead().getX() == width){
            continues = false;
        }
        if(worm.getHead().getY() == 0 || worm.getHead().getY() == height){
            continues = false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());
    }
    
    public void newApple(){
        this.apple = new Apple(random.nextInt(width), random.nextInt(height));
    }
    
    public Worm getWorm(){
        return worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }

}
