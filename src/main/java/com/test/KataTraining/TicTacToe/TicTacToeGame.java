package com.test.KataTraining.TicTacToe;

public class TicTacToeGame {

    private Player currentPlayer = Player.X;
    private gameStatus currentStatus = gameStatus.IN_PROGRESS;

    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }

    public gameStatus getStatus()
    {
        return currentStatus;
    }
}
