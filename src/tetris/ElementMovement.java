package tetris;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementMovement {

	protected List<Piece> pieceList;

	public ElementMovement() {
		this.pieceList = new ArrayList<Piece>();
	}

	public abstract void configure(Board board);

	public abstract void rotate();

	public void createElement(Board board, int x, int y) {
		pieceList.removeAll(pieceList);
		Piece piece = new Piece();
		//piece.setPieceStill(false);
		board.setPieceAt(x, y, piece);
		pieceList.add(piece);
	}
	
	
	
	public boolean isMoving() {
		for (Piece piece : pieceList) {
			if (piece.isPieceStill()) {
				return false;
			}
		}
		return true;
	}

}
