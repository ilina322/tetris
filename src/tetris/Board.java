package tetris;

public class Board {

	// 1st class - puts elements
	// 2nd class - moves them
	// 3rd class - prints

	private static final int BOARD_WIDTH = 10;
	private static final int BOARD_HEIGHT = 18;
	private static Piece[][] board;

	public static int getBoardWidth() {
		return BOARD_WIDTH;
	}

	public static int getBoardHeight() {
		return BOARD_HEIGHT;
	}
	
	public void putPieceOnBoard() {
		int pieceCurrX = 4;
		int pieceCurrY = 0;
		Piece piece = new Piece(pieceCurrX, pieceCurrY);
		board[pieceCurrX][pieceCurrY] = piece;
	}

	public Board() { // default constructor
		this.board = new Piece[BOARD_WIDTH][BOARD_HEIGHT];
	}

	public void setPieceAt(int x, int y, Piece piece) {
		board[x][y] = piece;
	}
	
	public Piece getPieceAt(int x, int y) {
		return board[x][y];
	}
	
	public Piece[][] getAll(){
		return board;
	}

	public int length() {
		return board.length;
	}

	public int rowLength() {
		return board[0].length;
	}
}
