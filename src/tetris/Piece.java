package tetris;

public class Piece {

	private boolean isDeleteable = false;
	private boolean isPieceStill = false;
	
	public Piece(boolean isPieceStill) {
		this.isPieceStill = isPieceStill;
	}

	public Piece() {
		
	}	

	public boolean isPieceStill() {
		return isPieceStill;
	}

	public void setPieceStill(boolean isPieceStill) {
		this.isPieceStill = isPieceStill;
	}

	public boolean isDeleteable() {
		return isDeleteable;
	}

	public void setDeleteable(boolean isDeleteable) {
		this.isDeleteable = isDeleteable;
	}
}
