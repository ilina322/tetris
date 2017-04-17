package tetris;

public class Piece {

	private boolean isRotationCentre = false;
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

	public boolean isRotationCentre() {
		return isRotationCentre;
	}

	public void setRotationCentre(boolean isRotationCentre) {
		this.isRotationCentre = isRotationCentre;
	}
}
