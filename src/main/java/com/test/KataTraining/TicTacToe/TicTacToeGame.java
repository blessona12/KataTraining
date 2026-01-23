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

    public void playAt(int row, int col) {
        if (currentStatus != gameStatus.IN_PROGRESS) {
            throw new IllegalStateException("Game is already finished");
        }

        if (board[row][col] != null) {
            throw new IllegalStateException("Cell is already occupied");
        }

        board[row][col] = currentPlayer;
        checkWin(row,col);

        if (currentStatus == gameStatus.IN_PROGRESS) {
            checkDraw();
        }

        if (currentStatus == gameStatus.IN_PROGRESS) {
            switchPlayer();
        }

    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
    }

    private void checkWin(int row,int col) {
        if(isHorizontalWin(row) || isVerticalwin(col) || isDiagonalWin() || isAntiDiagonalWin())
        {
            currentStatus = (currentPlayer == Player.X) ? gameStatus.X_WINS : gameStatus.O_WINS;
        }
    }

    private boolean isAntiDiagonalWin() {
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] ==currentPlayer;
    }

    private boolean isDiagonalWin() {
        return board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer;
    }

    private boolean isHorizontalWin(int row)
    {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board [row][2] == currentPlayer;
    }

    private boolean isVerticalwin(int col)
    {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    private void checkDraw()
    {
        for(Player[] row:board) {
            for (Player cell : row) {
                if(cell == null) return;
            }
        }
        currentStatus = gameStatus.DRAW;
    }

}
