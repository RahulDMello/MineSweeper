/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.JButton;

/**
 *
 * @author Rahul
 */
public class Tile extends JButton{
    int pos[] = new int[2];
    int tileNumber; // -1 = mine 0 = blank >0 = number
    boolean flagged;
    
    public Tile(int posX, int posY){
        super();
        this.pos[0] = posX;
        this.pos[1] = posY;
        flagged = false;
    }
    
    public int[] getPos(){
        return pos;
    }
    
    public int pos64based(){
        return (pos[0]*8)+pos[1]+1;
    }
    
    public void setTileNumber(int num){
        tileNumber = num;
    }
    
    public int getTileNumber(){
        return tileNumber;
    }
    
    public void setFlag(boolean check){
        flagged = check;
    }
    
    public boolean isFlagged(){
        return flagged;
    }
    
}
