package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;


public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize(){
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame(){
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                gameField[x][y] = new GameObject(y, x);
                setCellColor(x, y, Color.ORANGE);
            }
        }

    }

}
