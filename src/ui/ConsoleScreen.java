package ui;

import tetris.Board;
import tetris.Piece;

public class ConsoleScreen implements BoardScreen{

	@Override
	public void showBoard(Board board) {	
		for (int y = 0; y < Board.getBoardHeight(); y++) {
			for (int x = 0; x < Board.getBoardWidth(); x++) {
				if (board.getPieceAt(x, y) instanceof Piece) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}	
	}	
}
