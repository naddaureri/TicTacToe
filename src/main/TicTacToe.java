package main;

import java.util.Random;
import java.util.Scanner;

import models.Game;
import models.Player;

public class TicTacToe  extends Game{
	Scanner scan = new Scanner(System.in);
	private  static int GRID_SIZE = 3;
	public String[][] board;
	
	public TicTacToe() {
		// TODO Auto-generated constructor stub
		board = new String[GRID_SIZE][GRID_SIZE];
	}

	public void printBoard2() {
		for(int i=0; i<GRID_SIZE;i++) {
			for(int j=0; j<GRID_SIZE; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void printBoard() {
		for(int i=0; i<GRID_SIZE;i++) {
			for(int j=0; j<GRID_SIZE; j++) {
				System.out.print(board[i][j] = "*");
			}
			System.out.println("");
		}
	}
	
	
	public boolean isValidMove(int row, int col, String value) {
		for(int i=0; i < GRID_SIZE; i++) {
			for(int j=0; j< GRID_SIZE; j++) {
				if(board[i][j]=="*") {
					return true ;
				}
			}
		}
		return false;
	}
	public boolean setValue(int row,int col, String value) {
		if(row >= 0 && row< GRID_SIZE && col >= 0 && col<GRID_SIZE) {
			
			if(isValidMove(row,col,value)) {
				board[row][col]=value;
				printBoard2();
				return true;
			} else {
				System.out.println("Invalid move, please try again");
			}
		}
		return false;
	}
	
	public boolean isInRow(int row, String value) {
		for(int i=0; i < GRID_SIZE;i++) {
			
				if(!board[row][i].equals(value)) {
					return false;
				}
			
		}
		return true;
	}
	
	
	public boolean isInCol(int col,String value) {
		for(int i=0; i < GRID_SIZE;i++) {
			
			if(!board[i][col].equals(value)) {
				return false;
			}
		
	}
	return true;
	}
	
	public boolean isInDiagonal(int row, int col, String value) {
		for(int i=0; i<GRID_SIZE; i++) {
			if(!board[i][i].equals(value)) {
				return false;
			}
		}
		return true;
	}
	
	public void gameState(Player player) {
	
	super.gameState(player);
	System.out.println("Player " + player.getName() + " is Playing ");
	System.out.println("Input row : ");
	int row = scan.nextInt();scan.nextLine();
	System.out.println("Input column ");
	int col = scan.nextInt();scan.nextLine();
	String symbol = player.getSymbol();
	setValue(row, col, symbol);
	if(WinChecker(row, col, symbol)) {
		int point = player.getPoint()+4;
		
		player.setPoint(point);
		player.setWin(1);
	}else {
		player.setTie(true);
	}
	
	
	
	}
	
	public void getWinner(Player player) {
		System.out.println("You got more point");
	}

	@Override
	public boolean WinChecker(int row, int col, String value) {
		
			if(isInRow(row, value) || isInCol(col, value) || isInDiagonal(row, col, value)) {
				return true;
			}
			return false;
		
	}
	
	

}
