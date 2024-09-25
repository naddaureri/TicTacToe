package models;

import java.util.Random;
import java.util.Scanner;

import main.TicTacToe;

public abstract class Game  {
	Scanner scan = new Scanner(System.in);
	public Player player1;
	public Player player2;
	public Player winner;
	
	
//	public abstract void startGame();
//	public abstract void printScore();
	
	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public void gameState(Player player) {
		
	
	
		
		
		
	}
	
	public  void getWinner() {
		
	}
	
	public abstract boolean WinChecker(int row, int col, String value) ;
	public void theGame() {
		theGame2();
	}
	public void theGame2() {
		Random rand = new Random();
		int random = rand.nextInt(2);
		while( true ) {
			if(random==0) {
				gameState(player1);
				random=1;
			}else {
				gameState(player2);
				random=0;
			}
			if(player1.getWin() == 1 || player2.getWin() == 1) {
				player1.setWin(0);
				player2.setWin(0);
				System.out.println( player1.getName() + "point now is " + player1.getPoint() + "and" + player2.getName() + "point now is " + 
						player2.getPoint());
				break;
			}
			
		}
		
	}


	
	
	

}
