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
         game.playAt(0,0);
         game.playAt(1,0);
         game.playAt(0,1);
         game.playAt(1,1);
         game.playAt(0,2);
         assertEquals(gameStatus.X_WINS,game.getStatus());
     }

    @Test
    void cannotPlayAfterGameIsWon() {
        TicTacToeGame game = new TicTacToeGame();

        game.playAt(0, 0);
        game.playAt(1, 0);
        game.playAt(0, 1);
        game.playAt(1, 1);
        game.playAt(0, 2);

        assertThrows(IllegalStateException.class,
                () -> game.playAt(2, 2));
    }

    @Test
    void playerOVerticalWins()
    {
        TicTacToeGame game = new TicTacToeGame();
        game.playAt(0,0);
        game.playAt(0,1);
        game.playAt(1,0);
        game.playAt(1,1);
        game.playAt(2,2);
        game.playAt(2,1);

        assertEquals(gameStatus.O_WINS,game.getStatus());
    }

    @Test
    void playerHorizontalWins()
    {
        TicTacToeGame game= new TicTacToeGame();
        game.playAt(0,0);
        game.playAt(0,1);
        game.playAt(1,1);
        game.playAt(0,2);
        game.playAt(2,2);

        assertEquals(gameStatus.X_WINS,game.getStatus());
    }
    @Test
    void playerDiagonalWins()
    {
        TicTacToeGame game= new TicTacToeGame();
        game.playAt(0,0);
        game.playAt(0,1);
        game.playAt(1,1);
        game.playAt(2,1);
        game.playAt(2,2);
        assertEquals(gameStatus.X_WINS,game.getStatus());
    }

    @Test
    void playerAntiDiagonalWin()
    {
        TicTacToeGame game = new TicTacToeGame();
        game.playAt(0,0);
        game.playAt(0,2);
        game.playAt(1,0);
        game.playAt(1,1);
        game.playAt(2,2);
        game.playAt(2,0);

        assertEquals(gameStatus.O_WINS,game.getStatus());
    }

    @Test
    void gameDraw()
    {
        TicTacToeGame game= new TicTacToeGame();
        game.playAt(0,0);
        game.playAt(0,1);
        game.playAt(0,2);
        game.playAt(1,1);
        game.playAt(1,0);
        game.playAt(1,2);
        game.playAt(2,1);
        game.playAt(2,0);
        game.playAt(2,2);

        assertEquals(gameStatus.DRAW,game.getStatus());
    }


}
