package tetris;

public class ElementI extends ElementMovement{


	
	@Override
	public void configure(Board board) {
		createElement(board, 4, 0);
		createElement(board, 4, 1);
		createElement(board, 4, 2);
		createElement(board, 4, 3);
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
	
}
