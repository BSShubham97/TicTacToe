package com.bridgelabz;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame= new TicTacToeGame();
        ticTacToeGame.createNewBoard();
        ticTacToeGame.userOption();
        ticTacToeGame.displayBoard();
        ticTacToeGame.checkPostionEmpty();
        ticTacToeGame.displayBoard();
        ticTacToeGame.checkPostionEmpty();
    }
}
