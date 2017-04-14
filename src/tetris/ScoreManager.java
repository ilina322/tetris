package tetris;

public class ScoreManager {

	private int score = 0;
	private int piecesOnRow = 0;

	public void raiseScore(Board board) {
		for (int y = board.length() - 1; y >= 0; y--) {
			for (int x = board.rowLength() - 1; x >= 0; x--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece instanceof Piece && piece.isPieceStill()) {
					piecesOnRow++;
				}
			}
			if (piecesOnRow == board.rowLength()) {
				score++;
				moveRowsDown(board, y);
				System.out.println("score: " + score);
			}
			piecesOnRow = 0;
		}
	}

	private void moveRowsDown(Board board, int rowNumber) {
		for (int y = rowNumber; y >= 0; y--) {
			for (int x = board.rowLength() - 1; x >= 0; x--) {
				Piece piece = board.getPieceAt(x, y);
				if (piece != null) {
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