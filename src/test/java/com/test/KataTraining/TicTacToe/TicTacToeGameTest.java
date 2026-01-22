package com.test.KataTraining.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeGameTest {

    @Test
    void gameStartWithPlayerX()
    {
        TicTacToeGame game=new TicTacToeGame();
        assertEquals(Player.X,game.getCurrentPlayer());
    }

    @Test
    void gameStartInprogress()
    {
        TicTacToeGame game=new TicTacToeGame();
        assertEquals(gameStatus.IN_PROGRESS, game.getStatus());
    }

    @Test
    void playerCanMarkOnBoard()
    {
        TicTacToeGame game =new TicTacToeGame();
        game.play(0,0);
        assertEquals(Player.X,game.getCell(0,0));
     }

     @Test
    void switchTurnAfterMove()
     {
         TicTacToeGame game= new TicTacToeGame();
         game.play(0,0);
         assertEquals(Player.O,game.getCurrentPlayer());
     }

}
