package tetris;

public class Manager {
	
	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	BoardPrinter printer = new BoardPrinter();
	PieceMovement movement = new PieceMovement();
	
	public void startGame(){
		generator.createBoard(board);
		board.putPieceOnBoard();
		while(true){
			movement.moveDown(board);
			printer.printBoard(board);
			System.out.println();
		}
//		movement.moveLeft(board);
//		movement.moveRight(board);
	}

}
