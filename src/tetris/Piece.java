package tetris;

public class Piece {
	
	private int currX;
	private int currY;
	private boolean isPieceStill = false;
	
	public Piece(int currX, int currY) {
		this.currX = currX;
		this.currY = currY;
	}	

	
	
	public boolean isPieceStill() {
		return isPieceStill;
	}

	public void setPieceStill(boolean isPieceStill) {
		this.isPieceStill = isPieceStill;
	}

	public void setCurrX(int currX) {
		this.currX = currX;
	}

	public void setCurrY(int currY) {
		this.currY = currY;
	}

	public int getCurrY() {
		return currY;
	}

	public int getCurrX() {
		return currX;
	}
	
	

}
