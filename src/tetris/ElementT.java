package tetris;

public class ElementT extends Element {

	
	@Override
	public void configure(Board board) {
		createElementPart(board, 3, 0);
		createElementPart(board, 4, 0);
		createElementPart(board, 4, 1);
		createElementPart(board, 5, 0);
	}

	@Override
	public void rotate(Board board) {
		
	}

	
}
