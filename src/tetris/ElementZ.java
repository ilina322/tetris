package tetris;

public class ElementZ implements ElementMovement{
	Piece piece1 = new Piece();
	Piece piece2 = new Piece();
	Piece piece3 = new Piece();
	Piece piece4 = new Piece();
	
	
	
	@Override
	public void configure(Board board) {
		board.setPieceAt(3, 0, piece1);
		board.setPieceAt(4, 0, piece1);
		board.setPieceAt(4, 1, piece1);
		board.setPieceAt(5, 1, piece1);
		
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
}
