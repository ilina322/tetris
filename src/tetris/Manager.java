package tetris;

public class Manager {

	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	UiController printer = new UiController();
	PieceMovement movement = new PieceMovement();

	public void startGame() {
		generator.createBoard(board);
		board.putPieceOnBoard();
		while(true){
		printer.printBoard(board);
		movement.moveDown(board);
		System.out.println();
		}
	}

}
