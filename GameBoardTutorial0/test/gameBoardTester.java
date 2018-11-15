import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameBoardTutorial.GameBoard;

class gameBoardTester {

	@Test
	void boardToStringTester() {
		String expString;
		expString = " y/x :  0  1  2  3  4  5  6  7 \n";
		expString += " 0  :  0  0  0  0  0  0  0  0 \n";
		expString += " 1  :  0  0  0  0  0  0  0  0 \n";
		expString += " 2  :  0  0  0  0  0  0  0  0 \n";
		expString += " 3  :  0  0  0  0  0  0  0  0 \n";
		expString += " 4  :  0  0  0  0  0  0  0  0 \n";
		expString += " 5  :  0  0  0  0  0  0  0  0 \n";
		expString += " 6  :  0  0  0  0  0  0  0  0 \n";
		expString += " 7  :  0  0  0  0  0  0  0  0 \n";
		
		System.out.println(expString);
		
		GameBoard board = new GameBoard();
		assertEquals(expString, board.boardToString());  
		
		
	}

}
