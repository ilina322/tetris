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
	
	public void quickenGame(){
		if(score >= 20){
			UiController.setDelayInMillis(200);
			System.out.println("DelayInMillis = 200");
		} else if(score >= 15){
			UiController.setDelayInMillis(400);
			System.out.println("DelayInMillis = 400");
		} else if(score >= 10){
			UiController.setDelayInMillis(600);
			System.out.println("DelayInMillis = 600");
		} else if(score >= 5){
			UiController.setDelayInMillis(800);
			System.out.println("DelayInMillis = 800");
		}
	}
}