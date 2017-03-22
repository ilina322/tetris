package tetris;

public class Manager {
	
	public void startGame(){
		Board board = new Board();
		board.createBoard();
		board.putPieceOnBoard();
		board.printBoard();
	}

}
