package tetris;

public class Manager {
	
	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	BoardPrinter printer = new BoardPrinter();
	PieceMovement movement = new PieceMovement();
	ElementT elementT = new ElementT();
	ElementI elementI = new ElementI();
	ElementL elementL = new ElementL();
	ElementJ elementJ = new ElementJ();
	ElementO elementO = new ElementO();
	ElementS elementS = new ElementS();
	ElementZ elementZ = new ElementZ();
	
	public void startGame(){
		generator.createBoard(board);
		elementL.configure(board);
		//board.putPieceOnBoard();
		while(true){
			printer.printBoard(board);
			movement.moveDown(board);
			System.out.println();
		}
//		movement.moveLeft(board);
//		movement.moveRight(board);
	}

}
