package tetris;

public class ElementZ extends ElementMovement{

	
	@Override
	public void configure(Board board) {
		createElement(board, 3, 0);
		createElement(board, 4, 0);
		createElement(board, 4, 1);
		createElement(board, 5, 1);
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

}
