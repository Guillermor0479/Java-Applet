package gameBoardTutorial;

import java.util.ArrayList;

public class GameBoard {
	private char[][] board = new char[8][8];
	private ArrayList<Piece> pieces;
	
	
	public GameBoard() {
		super();
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				this.board[i][j] = '0' ;
				
			}
		}
		this.pieces = new ArrayList<Piece>();
	}
	
	public String boardToString() {
		String output = "";
		output += " y/x :  0  1  2  3  4  5  6  7 \n";
		for (int row=0;row<8;row++) {
			output += " "+ row + "  : ";
		for (int col=0;col<8;col++) {
			output += " " + board[row][col] + " ";
			
		}
		
		output += "\n";
		}
		return output;
	}
	
}
