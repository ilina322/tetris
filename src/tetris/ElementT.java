package tetris;

public class ElementT extends ElementMovement {

	
	@Override
	public void configure(Board board) {
		createElement(board, 3, 0);
		createElement(board, 4, 0);
		createElement(board, 4, 1);
		createElement(board, 5, 0);
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	
}
