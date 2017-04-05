package tetris;

public class ElementS extends ElementMovement{
	
	@Override
	public void configure(Board board) {
		createElement(board, 4, 0);
		createElement(board, 5, 0);
		createElement(board, 3, 1);
		createElement(board, 4, 1);
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
}
