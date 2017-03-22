package tetris;

public class Board {

	public static final int BOARD_WIDTH = 10;
	private static final int BOARD_HEIGHT = 18;
	private Piece[][] board;

	public Board() { // default constructor
		this.board = new Piece[BOARD_WIDTH][BOARD_HEIGHT];
	}
	
	public void createBoard(){
		for (int y = 0; y < BOARD_HEIGHT; y++) {
			for (int x = 0; x < BOARD_WIDTH; x++) {
				board[x][y] = null;
			}
		}
	}
	
	public void printBoard(){
		for (int y = 0; y < BOARD_HEIGHT; y++) {
			for (int x = 0; x < BOARD_WIDTH; x++) {
				if(board[x][y] == null){
					System.out.print(0);
				}else{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
	
	public void putPieceOnBoard(){
		int pieceCurrX = 4;
		int pieceCurrY = 0;
		Piece piece = new Piece(pieceCurrX, pieceCurrY, "orange");
		board[pieceCurrX][pieceCurrY] = piece;
	}
}
