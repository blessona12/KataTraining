package com.test.KataTraining.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

     @Test
     void cannotPlayOnOccupiedCell()
     {
         TicTacToeGame game= new TicTacToeGame();
         game.playAt(0,0);
         IllegalStateException exception =
                 assertThrows(IllegalStateException.class,
                         () -> game.playAt(0, 0));
         assertEquals("cell is already occupied",exception.getMessage());
     }

     @Test
    void playerXwinsHorizontal()
     {
         TicTacToeGame game = new TicTacToeGame();
         game.playAt(0,0); // X
         game.playAt(1,0); // O
         game.playAt(0,1); // X
         game.playAt(1,1); // O
         game.playAt(0,2); // X wins
         assertEquals(gameStatus.X_WINS,game.getStatus());
     }

    @Test
    void cannotPlayAfterGameIsWon() {
        TicTacToeGame game = new TicTacToeGame();

        game.playAt(0, 0); // X
        game.playAt(1, 0); // O
        game.playAt(0, 1); // X
        game.playAt(1, 1); // O
        game.playAt(0, 2); // X wins

        assertThrows(IllegalStateException.class,
                () -> game.playAt(2, 2));
    }

}
