package tetris;

public class ElementJ extends Element{
	
	@Override
	public void configure(Board board) {
		createRotationCenter(board, 4, 0);
		createRotationCenter(board, 4, 1);
		createElementPart(board, 4, 2);
		createElementPart(board, 3, 2);
		
		
	}

	@Override
	public void rotate(Board board) {
	}


}
