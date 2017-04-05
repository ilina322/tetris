package tetris;

import java.util.ArrayList;
import java.util.List;

public class ElementL extends ElementMovement{

	@Override
	public void configure(Board board) {
		createElement(board, 4, 0);
		createElement(board, 4, 1);
		createElement(board, 4, 2);
		createElement(board, 5, 2);
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

}
