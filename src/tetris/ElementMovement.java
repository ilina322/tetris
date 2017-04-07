package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ElementMovement {

	protected List<Piece> pieceList;

	public ElementMovement() {
		this.pieceList = new ArrayList<Piece>();
	}

	public abstract void configure(Board board);

	public abstract void rotate();

	public void createElement(Board board, int x, int y) {
		Piece piece = new Piece();
		board.setPieceAt(x, y, piece);
		pieceList.add(piece);
	}

	public ElementMovement generateElement() {

		Random rand = new Random();
		int type = rand.nextInt(7);
		List<ElementMovement> elementArray = new ArrayList<>();

		elementArray.add(new ElementT());
		elementArray.add(new ElementI());
		elementArray.add(new ElementL());
		elementArray.add(new ElementJ());
		elementArray.add(new ElementO());
		elementArray.add(new ElementS());
		elementArray.add(new ElementZ());

		return elementArray.get(type);

	}
	

	public void stopElement() {
		if (!isMoving()) {
			for (Piece piece : pieceList) {
				piece.setPieceStill(true);
				System.out.println("still");
			}
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
