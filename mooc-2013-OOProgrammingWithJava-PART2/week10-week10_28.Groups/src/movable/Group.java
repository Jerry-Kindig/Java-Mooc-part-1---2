/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jerry pc
 */
public class Group implements Movable{
    private List<Movable> groupList;
    
    public Group(){
        this.groupList = new ArrayList<Movable>();
    }
    
    @Override
    public String toString(){
        String moves = "";
        for(Movable movable: this.groupList){
            moves = moves + movable + "\n";
        }
        return moves;
    }
    
    public void addToGroup(Movable movable){
        this.groupList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable: this.groupList){
            movable.move(dx, dy);
        }
    }
    
}
