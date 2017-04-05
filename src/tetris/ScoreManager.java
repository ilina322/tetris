package tetris;

public class ScoreManager {

	private int score = 0;
	private int piecesOnRow = 0;

	public void raiseScore(Board board) {
		for (int x = 0; x < board.length(); x++) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				if (board.getPieceAt(x, y) instanceof Piece) {
					piecesOnRow++;
				}
			}
			if (piecesOnRow == board.getBoardWidth()) {
				score++;
				deleteRow(board);
			}
		}
	}

	private void deleteRow(Board board) {
		for (int x = 1; x < board.length(); x++) {
			for (int y = board.rowLength() - 1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece instanceof Piece && piece.isPieceStill()) {
					board.setPieceAt(x, y, null);
					board.setPieceAt(x, y + 1, piece);
				}
			}
		}
	}

	public int getScore() {
		return score;
	}
}
