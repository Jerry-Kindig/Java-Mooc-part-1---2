/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author jerry pc
 */
public class Worm {
    
    private int x;
    private int y;
    private Direction direction;
    private List<Piece> pieces;
    private boolean grow;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(x, y));
        grow = false;
    }
    
    public Direction getDirection(){
        return direction;
    }
    
    public void setDirection(Direction direction){
        this.direction = direction;
    }
    
    public int getLength(){
        return pieces.size();
    }
    
    public List<Piece> getPieces(){
        return pieces;
    }
    
    public void move(){
        int currentX = pieces.get(pieces.size() - 1).getX();
        int currentY = pieces.get(pieces.size() - 1).getY();
        
        if(getLength() > 2 && !grow){
            pieces.remove(0);
        }
        
        if(grow){
            grow = false;
        }
        
        if(direction == Direction.UP){
            pieces.add(new Piece(currentX, currentY - 1));
        }
        if(direction == Direction.DOWN){
            pieces.add(new Piece(currentX, currentY + 1));
        }
        if(direction == Direction.LEFT){
            pieces.add(new Piece(currentX - 1, currentY));
        }
        if(direction == Direction.RIGHT){
            pieces.add(new Piece(currentX + 1, currentY));
        }
    }
    
    public void grow(){
        grow = true;
    }
    
    public boolean runsInto(Piece piece){
        boolean ri = false;
        for(Piece wp: pieces){
            if(wp.getX() == piece.getX() && wp.getY() == piece.getY()){
                ri = true;
            }
        }
        return ri;
    }
    
    public boolean runsIntoItself(){
        Piece head = getHead();
        for(int i = 0; i < getLength() - 1; i++){
            if(pieces.get(i).getX() == head.getX() && pieces.get(i).getY() == head.getY()){
                return true;
            }
        }
        return false;
    }
    
    public Piece getHead(){
        return pieces.get(pieces.size() - 1);
    }
}
