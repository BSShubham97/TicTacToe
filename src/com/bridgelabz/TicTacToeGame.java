package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    Scanner input= new Scanner(System.in);
    char[] board = new char[10];
    char userEntry, computerEntry;

    public void createNewBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        System.out.println( board);
    }
    /**
     * Method to take user input X or O
     */
    public void userOption() {
        System.out.println("PLAYER choose option from 1. X or 2. O ");
        System.out.print("Enter option: ");
        int userOption = input.nextInt();
        switch (userOption) {
            case 1:
                userEntry = 'X';
                computerEntry = 'O';
                System.out.println("User entry will be: "+userEntry);
                System.out.println("Computer entry will be: "+computerEntry);
                break;
            case 2:
                userEntry = 'O';
                computerEntry = 'X';
                System.out.println("User entry will be: "+userEntry);
                System.out.println("Computer entry will be: "+computerEntry);
                break;
            default:
                System.out.println("Select proper option!!!");
                break;
        }
    }

    /**
     * To display board for valid empty entry places.
     */
    public void displayBoard() {
        System.out.println("_BOARD_");
        System.out.println("_______");
        System.out.println( "|" + board[1] + "|" + board[2] + "|" + board[3] + "|" + "\n" + "-------" + "\n" +
                            "|" + board[4] + "|" + board[5] + "|" + board[6] + "|" + "\n" + "-------" + "\n" +
                            "|" + board[7] + "|" + board[8] + "|" + board[9] + "|");
        System.out.print("-------");
    }
}


