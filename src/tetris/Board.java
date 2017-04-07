package tetris;

public class Board {

	
	private static final int BOARD_WIDTH = 10;
	private static final int BOARD_HEIGHT = 10;

	private static Piece[][] board;

	public static int getBoardWidth() {
		return BOARD_WIDTH;
	}

	public static int getBoardHeight() {
		return BOARD_HEIGHT;
	}
	
	public void putPieceOnBoard() {
		int pieceCurrX = 4;
		int pieceCurrY = 5;
		Piece piece = new Piece(false);
		board[pieceCurrX][pieceCurrY] = piece;

	}

	public Board() { // default constructor
		this.board = new Piece[BOARD_WIDTH][BOARD_HEIGHT];
	}

	public void setPieceAt(int x, int y, Piece piece) {
		if(isOnBoard(x, y)){
		board[x][y] = piece;
		}
	}
	
	public boolean isOnBoard(int x, int y) {
		if(x >= 0 && y >= 0 && x < BOARD_WIDTH && y < BOARD_HEIGHT){
		return true;
		}
		return false;
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
