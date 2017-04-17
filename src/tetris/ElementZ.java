package tetris;

public class ElementZ extends Element{

	
	@Override
	public void configure(Board board) {
		createElementPart(board, 3, 0);
		createElementPart(board, 4, 0);
		createRotationCenter(board, 4, 1);
		createElementPart(board, 5, 1);
	}

	@Override
	public void rotate(Board board) {
		
	}

}
