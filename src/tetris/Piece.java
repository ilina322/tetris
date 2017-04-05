package tetris;

public class Piece {

	private boolean hasPieceMetBottomOrPiece = false;
	private boolean isPieceStill = false;
	
	public Piece(boolean isPieceStill) {
		this.isPieceStill = isPieceStill;
	}

	public boolean isHasPieceMetBottomOrPiece() {
		return hasPieceMetBottomOrPiece;
	}

	public void setHasPieceMetBottomOrPiece(boolean hasPieceMetBottomOrPiece) {
		this.hasPieceMetBottomOrPiece = hasPieceMetBottomOrPiece;
	}

	public Piece() {
		
	}	

	public boolean isPieceStill() {
		return isPieceStill;
	}

	public void setPieceStill(boolean isPieceStill) {
		this.isPieceStill = isPieceStill;
	}
}
