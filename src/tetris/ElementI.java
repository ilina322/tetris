package tetris;

public class ElementI extends Element {

	@Override
	public void configure(Board board) {
		createElementPart(board, 4, 0);
		createElementPart(board, 4, 1);
		createRotationCenter(board, 4, 2);
		createElementPart(board, 4, 3);
	}

	@Override
	public void rotate(Board board) {
		
	}

}
