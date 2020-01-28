
package dungeon;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jerry pc
 */
public class Dungeon {
    private final int length;
    private final int height;
    private final int vampires;
    private int moves;
    private final boolean vampireMoves;
    private final List<Vampire> vampList;
    private List<Vampire> removeList;
    private int[][] curBoard;
    private final Scanner reader;
    private final Player player;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampireMoves){
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampireMoves = vampireMoves;
        this.vampList = new ArrayList<Vampire>();
        this.removeList = new ArrayList<Vampire>();
        this.reader = new Scanner(System.in);
        this.player = new Player(this.length, this.height);
    }
    
    public void run(){
        for(int x = 0; x < this.vampires; x++){
            this.vampList.add(new Vampire(this.vampireMoves, this.length, this.height));
        }
        this.createBoard();
        System.out.println(this);
        while(true){
            this.drawBoard();
            if(this.vampList.isEmpty()){
                System.out.println("YOU WIN!");
                break;
            }
            if(this.moves == 0){
                System.out.println("YOU LOSE!");
                break;
            }
        }
    }
    
    public void createBoard(){
        this.curBoard = new int[this.length][this.height];
        for(int i = 0; i < this.length; i++){
            for(int j = 0; j < this.height; j++){
                curBoard[i][j] = 1;
            }
        }
        for(Vampire vamp: this.vampList){
            curBoard[vamp.getVampX()][vamp.getVampY()] = 3;
        }
        curBoard[this.player.getPlayerX()][this.player.getPlayerY()] = 2;
    }    
    
    public void drawBoard(){
        this.moves--;
        this.curBoard[this.player.getPlayerX()][this.player.getPlayerY()] = 1;
        int i = this.playerMove();
        this.curBoard[this.player.getPlayerX()][this.player.getPlayerY()] = 2;
        for(Vampire vamp: this.vampList){
            for(int x = 0; x < i; x++){
                int vNum = this.vampList.size();
                this.curBoard[vamp.getVampX()][vamp.getVampY()] = 1;
                vamp.moveVamp();
                this.checkOverlap();
                if(this.vampList.size() == vNum){
                    this.curBoard[vamp.getVampX()][vamp.getVampY()] = 3;
                }
            }
        }
        System.out.println(this);
    }
    
    public void checkOverlap(){
        for(Vampire vamp: this.vampList){
            if(this.player.getPlayerX() == vamp.getVampX() && this.player.getPlayerY() == vamp.getVampY()){
                this.removeList.add(vamp);
            }
        }
        for(Vampire vamp: this.removeList){
            if(this.vampList.contains(vamp)){
                this.vampList.remove(vamp);
            }
        }
    }
    
    public int playerMove(){
        String command = this.reader.nextLine();
        for(int i = 0; i < command.length(); i++){
            this.player.move(command.charAt(i));
            this.checkOverlap();
        }
        return command.length();
    }
    
    public void printInit(){
        System.out.println(this.moves + "\n");
        System.out.println("@ 0 0");
        this.moves--;
        this.curBoard[0][0] = 2;
        for(Vampire vamp: vampList){
            System.out.println("v " + vamp.getVampX() + " " + vamp.getVampY());
        }
        System.out.println("\n" + this);
    }
    
    @Override
    public String toString(){
        System.out.println(this.moves + "\n");
        System.out.println("@ " + this.player.getPlayerX() + " " + this.player.getPlayerY());
        for(Vampire vamp: vampList){
            System.out.println("v " + vamp.getVampX() + " " + vamp.getVampY());
        }
        System.out.println("");
        String boardstr = "";
        for(int j = 0; j < this.height; j++){
            for(int i = 0; i < this.length; i++){
                if(curBoard[i][j] == 1){
                    boardstr += ".";
                } else if (curBoard[i][j] == 2){
                    boardstr += "@";
                } else {
                    boardstr += "v";
                }
            }
            boardstr += "\n";
        }
        return boardstr;
    }
}