package tetris;

public class ElementO extends Element{
	
	@Override
	public void configure(Board board) {
		createElementPart(board, 4, 0);
		createElementPart(board, 5, 0);
		createElementPart(board, 4, 1);
		createElementPart(board, 5, 1);
	}

	@Override
	public void rotate(Board board) {
		// TODO Auto-generated method stub
		
	}
}
