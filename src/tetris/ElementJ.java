package tetris;

public class ElementJ extends ElementMovement{

	Piece piece1 = new Piece();
	Piece piece2 = new Piece();
	Piece piece3 = new Piece();
	Piece piece4 = new Piece();
	
	
	
	@Override
	public void configure(Board board) {
		createElement(board, 4, 0);
		createElement(board, 4, 1);
		createElement(board, 4, 2);
		createElement(board, 3, 2);
		
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}


}
