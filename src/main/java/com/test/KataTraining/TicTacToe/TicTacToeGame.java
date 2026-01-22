package com.test.KataTraining.TicTacToe;

public class TicTacToeGame {

    private Player currentPlayer = Player.X;
    private gameStatus currentStatus = gameStatus.IN_PROGRESS;
    private Player[][] board = new Player[3][3];

    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }

    public gameStatus getStatus()
    {
        return currentStatus;
    }

    public void play(int row, int coloumn)
    {
        board[row][coloumn] = currentPlayer;
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
    }

    public Player getCell(int row, int column)
    {
        return board[row][column];
    }

    public void playAt(int row,int col)
    {
        if(board[row][col] != null)
        {
            throw new IllegalStateException("cell is already occupied");
        }

        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;

    }

}
