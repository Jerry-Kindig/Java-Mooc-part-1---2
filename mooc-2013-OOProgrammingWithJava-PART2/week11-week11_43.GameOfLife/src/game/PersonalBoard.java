/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author jerry pc
 */
public class PersonalBoard extends GameOfLifeBoard{
    
    public PersonalBoard(int width, int height){
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();
        boolean[][] board = getBoard();
        for(int x = 0; x < getWidth(); x++){
            for(int y = 0; y < getHeight(); y++){
                double dub = random.nextDouble();
                board[x][y] = dub < d;
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if(i >= 0 && i < getWidth() && i1 >= 0 && i1 < getHeight()){
            return getBoard()[i][i1]; 
        }
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if(i >= 0 && i < getWidth() && i1 >= 0 && i1 < getHeight()){
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if(i >= 0 && i < getWidth() && i1 >= 0 && i1 < getHeight()){
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        boolean[][] board = getBoard();
        int l = 0;
        for(int e = -1; e < 2; e++){
            if(i1 + 1 < getHeight() && i + e >= 0 && i + e < getWidth()){
                if(board[i + e][i1 + 1] == true){
                    l++;
                }
            }
        }
        for(int e = -1; e < 2; e++){
            if(i1 - 1>= 0 && i + e >= 0 && i + e < getWidth()){
                if(board[i + e][i1 - 1] == true){
                    l++;
                }
            }
        }
        if(i - 1 >= 0){
            if(board[i - 1][i1] == true){
                l++;
            }
        }
        if(i + 1 < getWidth()){
            if(board[i + 1][i1] == true){
                l++;
            }
        }
        return l;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(getBoard()[i][i1] == true){
            if(i2 < 2 || i2 > 3){
                getBoard()[i][i1] = false;
            }
        } else {
            if(i2 == 3){
                getBoard()[i][i1] = true;
            }
        }
    }
    
}
