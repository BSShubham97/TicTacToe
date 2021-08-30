package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    Scanner input= new Scanner(System.in);
    char userEntry, computerEntry;
    public void createNewBoard() {
        char[] board = new char[10];
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


}
