/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author jerry pc
 */
public class Vampire {
    private final int height;
    private final int length;
    private int xPos;
    private int yPos;
    private final boolean vampireMoves;
    private final Random random;
    
    public Vampire(boolean vampireMoves, int length, int height){
        this.vampireMoves = vampireMoves;
        this.length = length;
        this.height = height;
        this.random = new Random();
        this.xPos = 0;
        this.yPos = 0;
        this.initPos();
    }
    
    private void initPos(){
        while(this.xPos == 0){
            this.xPos = random.nextInt(length);
        }
        while(this.yPos == 0){
            this.yPos = random.nextInt(height);
        }
    }
    
    public int getVampX(){
        return this.xPos;
    }
    
    public int getVampY(){
        return this.yPos;
    }
    
    public void moveVamp(){
        if(this.vampireMoves){
            int move = random.nextInt(4);
            if(move == 0){
                if(this.yPos > 0){
                    this.yPos--;
                }
            }
            if(move == 1){
                if(this.xPos > 0){
                    this.xPos--;
                }
            }
            if(move == 2){
                if(this.yPos + 1 < this.height){
                    this.yPos++;
                }
            }
            if(move == 3){
                if(this.xPos + 1 < this.length){
                    this.xPos++;
                }
            }
        }
    }
}
