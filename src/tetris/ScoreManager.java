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
				deleteRow(board, y);
				moveRowDown(board, y - 1);
				System.out.println("score: " + score);
			}
			piecesOnRow = 0;
		}
	}

	
	private void moveRowDown(Board board, int y) {
		for (int x = board.rowLength() - 1; x >= 0; x--){
			Piece piece = board.getPieceAt(x, y);
			if (piece != null) {
				board.setPieceAt(x, y, null);
				board.setPieceAt(x, y + 1, piece);
			}
		}
	}

	private void deleteRow(Board board, int y) {
		for (int x = board.rowLength() - 1; x >= 0; x--) {
			board.setPieceAt(x, y, null);
		}
	}

	public int getScore() {
		return score;
	}
}