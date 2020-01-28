/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author jerry pc
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wg;
    private int pieceLength;
    
    public DrawingBoard(WormGame wg, int length){
        this.wg = wg;
        pieceLength = length;
    }
    
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Worm worm = wg.getWorm();
        graphics.setColor(Color.BLACK);
        for(Piece piece: worm.getPieces()){
            graphics.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, pieceLength, pieceLength, true);
        }
        graphics.setColor(Color.RED);
        graphics.fillOval(wg.getApple().getX() * pieceLength, wg.getApple().getY() * pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
}
    