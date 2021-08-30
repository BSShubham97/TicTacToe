package com.bridgelabz;

public class TicTacToeGame {
    public void createNewBoard() {
        char[] board = new char[10];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        System.out.println( board);
    }
}
