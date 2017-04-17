package tetris;

public class ElementL extends Element{

	@Override
	public void configure(Board board) {
		createElementPart(board, 4, 0);
		createRotationCenter(board, 4, 1);
		createElementPart(board, 4, 2);
		createElementPart(board, 5, 2);
	}

	@Override
	public void rotate(Board board) {
		
	}

}
