package main;

import java.util.Random;
import java.util.Scanner;

import models.Game;
import models.Player;

public class Main extends Game{
	Scanner scan = new Scanner(System.in);
	
	public void startGame() {
		
	
		
	}
	public void huhu() {
		
	}
	
	
	public  static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		System.out.print("Masukkan pemain pertama : ");
		String name1 = scan.nextLine();
		System.out.print("Masukkan karakter yang dipilih : ");
		String symbol1= scan.nextLine();
		System.out.print("Masukkan pemain kedua : ");
		String name2 = scan.nextLine();
		System.out.print("Masukkan karakter yang dipilih : ");
		String symbol2= scan.nextLine();
		 Player player1 =  new Player(name1, symbol1);
		Player  player2 = new Player(name2,symbol2);
		game.setPlayer1(player1);
		game.setPlayer2(player2);
		System.out.println("The game is already start by" +  player1.getName() + "with" + player2.getName());
		String input;
		do {
		System.out.println("S to start the game");
		input = scan.nextLine();
		
		if(input.equalsIgnoreCase("S")) {
			game.printBoard();
			game.theGame();
			
					System.out.println("Do you want to continue ?");
					input= scan.nextLine();
					
		}
		if(input.equalsIgnoreCase("E")) {
			System.out.println("Thank you for playing this game with me. Exiting...");
			break;
		}
		} while (input.equalsIgnoreCase("c"));
	
		
		
	
		
	}

	@Override
	public boolean WinChecker(int row, int col, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	


	
}
