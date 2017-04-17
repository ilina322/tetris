package tetris;

import java.util.ArrayList;
import java.util.List;

public abstract class Element{

	protected List<Piece> pieceList;
	
	public Element() {
		this.pieceList = new ArrayList<Piece>();
	}

	public abstract void configure(Board board);

	public abstract void rotate(Board board);

	public void createElementPart(Board board, int x, int y) {
		Piece piece = new Piece();
		board.setPieceAt(x, y, piece);
		pieceList.add(piece);
	}
	
	public void createRotationCenter(Board board, int x, int y) {
		Piece piece = new Piece();
		piece.setRotationCentre(true);
		board.setPieceAt(x, y, piece);
		pieceList.add(piece);
	}

	public void stopElement() {
			for (Piece piece : pieceList) {
				System.out.println("still");
				piece.setPieceStill(true);
		}
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
