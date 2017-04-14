package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

	private static final int BOARD_WIDTH = 20;
	private static final int BOARD_HEIGHT = 20;

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

	public boolean isBoardFull() {
		int count = 0;
		for1: for (int y = BOARD_HEIGHT - 1; y >= 0; y--) {
			for2: for (int x = BOARD_WIDTH - 1; x >= 0; x--) {
				if (board[x][y] != null) {
					count++;
					break for2;
				}
			}
		}
		if (count == BOARD_HEIGHT - 1) {
			return true;
		}
		return false;
	}

	public void setPieceAt(int x, int y, Piece piece) {
		if (isOnBoard(x, y)) {
			board[x][y] = piece;
		}
	}

	public boolean isOnBoard(int x, int y) {
		if (x >= 0 && y >= 0 && x < BOARD_WIDTH && y < BOARD_HEIGHT) {
			return true;
		}
		return false;
	}

	public Piece getPieceAt(int x, int y) {
		return board[x][y];
	}

	public Piece[][] getAll() {
		return board;
	}

	public int length() {
		return board.length;
	}

	public int rowLength() {
		return board[0].length;
	}
}
