package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    char[] board = new char[10];
    char userEntry, computerEntry;

    public void createNewBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        System.out.println(board);
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
                System.out.println("User entry will be: " + userEntry);
                System.out.println("Computer entry will be: " + computerEntry);
                break;
            case 2:
                userEntry = 'O';
                computerEntry = 'X';
                System.out.println("User entry will be: " + userEntry);
                System.out.println("Computer entry will be: " + computerEntry);
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
        System.out.println("|" + board[1] + "|" + board[2] + "|" + board[3] + "|" + "\n" + "-------" + "\n" +
                "|" + board[4] + "|" + board[5] + "|" + board[6] + "|" + "\n" + "-------" + "\n" +
                "|" + board[7] + "|" + board[8] + "|" + board[9] + "|");
        System.out.print("-------\n");
    }

    /**
     * Check empty
     */
    public void checkPostionEmpty() {
        System.out.print("Enter the postion(between 1 to 9): ");
        int position = input.nextInt();
        if (position > 0 && position < 10) {
            if (board[position] != ' ') {
                System.out.println("Postion Occupied !");
            } else {
                System.out.println("Position Free!");
                board[position] = userEntry;
                position = random.nextInt(8) + 1;
                board[position] = computerEntry;
            }
        }
    }
        /**
         *  UC-5 : To show empty empty spaces position
         */
        public void printEmptySpaces () {
            System.out.println("Empty Positions are: ");
            for (int i = 1; i < board.length; i++) {
                if (board[i] == ' ') {
                    System.out.print( i + "\t");
                }
            }
        }
    /**
     * Toss to check who plays first
     */
 public void toss(){
     int head=1, tail=0;
     boolean isPlayerFirst= false;
     System.out.print("Enter your call(1.Head / 0.Tail): ");
     int playerCall = input.nextInt();
     int tossFaceValue= random.nextInt(1);
     System.out.println("Toss gave:"+tossFaceValue);
     if(playerCall==tossFaceValue){
         System.out.println( "USER WINS the toss he plays first.");
         isPlayerFirst=true;
     }else{
         System.out.println("COMPUTER WINS the toss it plays first");
         isPlayerFirst=false;
     }
 }



    }

 