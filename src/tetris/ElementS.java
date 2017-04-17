package tetris;

public class ElementS extends Element{
	
	@Override
	public void configure(Board board) {
		createElementPart(board, 4, 0);
		createElementPart(board, 5, 0);
		createElementPart(board, 3, 1);
		createRotationCenter(board, 4, 1);
	}

	@Override
	public void rotate(Board board) {
		
	}
}
