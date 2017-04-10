package tetris;

public class PieceMovement {

	public Board moveDown(Board board) {
		for (int x = board.length() - 1; x >= 0; x--) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece instanceof Piece && !piece.isPieceStill()) {
					board.setPieceAt(x, y + 1, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}

	public Board moveLeft(Board board) {
		for (int x = 0; x < board.length(); x++) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece instanceof Piece && !piece.isPieceStill()) {
					board.setPieceAt(x - 1, y, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}

	public Board moveRight(Board board) {

		for (int x = board.length() - 1; x >= 0; x--) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece instanceof Piece && !piece.isPieceStill()) {
					board.setPieceAt(x + 1, y, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}

	private boolean isPieceBelowStill(int x, int y, Board board) {
		if (board.isOnBoard(x, y + 1) && board.getPieceAt(x, y + 1) != null && board.getPieceAt(x, y) != null) {
			if (board.getPieceAt(x, y + 1).isPieceStill()) {
				return true;
			}
		}
		return false;
	}

	private boolean isPieceAtBoardEnd(int x, int y, Board board) {
		if (board.isOnBoard(x, y) && board.getPieceAt(x, y) != null) {
			if (y == Board.getBoardHeight() - 1) {
				return true;
			}
		}
		return false;
	}

	private void stopPiece(int x, int y, Board board) {
		if (isPieceBelowStill(x, y, board) || isPieceAtBoardEnd(x, y, board)) {
			board.getPieceAt(x, y).setPieceStill(true);
		}
	}
	
	public boolean checkShouldStop(Board board){
		for (int x = board.length() - 1; x >= 0; x--) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if(piece != null){
					if(!piece.isPieceStill()){
						if (isPieceBelowStill(x, y, board) || isPieceAtBoardEnd(x, y, board)){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
