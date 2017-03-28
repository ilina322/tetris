package tetris;

public class ElementS implements ElementMovement{
	Piece piece1 = new Piece();
	Piece piece2 = new Piece();
	Piece piece3 = new Piece();
	Piece piece4 = new Piece();
	
	
	
	@Override
	public void configure(Board board) {
		board.setPieceAt(4, 0, piece1);
		board.setPieceAt(5, 0, piece1);
		board.setPieceAt(3, 1, piece1);
		board.setPieceAt(4, 1, piece1);
		
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
}
