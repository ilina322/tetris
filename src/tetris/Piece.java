package tetris;

public class Piece {
	
	private int currX;
	private int currY;
	private String color;
	
	public Piece(int currX, int currY, String color) {
		this.currX = currX;
		this.currY = currY;
		this.color = color;
	}

	public void setCurrX(int currX) {
		this.currX = currX;
	}

	public void setCurrY(int currY) {
		this.currY = currY;
	}

	public int getCurrX() {
		return currX;
	}

	public int getCurrY() {
		return currY;
	}
	
	

}
