package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(300, 150);
        board.initiateRandomCells(0.4);

        Simulator simulator = new Simulator(board);
        simulator.simulate();
    }
}
