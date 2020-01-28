/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author jerry pc
 */
public class Player {
    private final int boardLen;
    private final int boardHei;
    private int xPos;
    private int yPos;
    
    public Player(int boardLen, int boardHei){
        this.xPos = 0;
        this.yPos = 0;
        this.boardLen = boardLen;
        this.boardHei = boardHei;
    }
    
    public int getPlayerX(){
        return this.xPos;
    }
    
    public int getPlayerY(){
        return this.yPos;
    }

    public void move(char command){
        if(command == 'w'){
            if(this.yPos > 0){
                this.yPos--;
            }
        } else if(command == 'a'){
            if(this.xPos > 0){
                this.xPos--;
            }
        } else if(command == 's'){
            if(this.yPos + 1 < this.boardHei){
                this.yPos++;
            }
        } else if(command == 'd'){
            if(this.xPos + 1 < this.boardLen){
                this.xPos++;
            }
        }
    }
}