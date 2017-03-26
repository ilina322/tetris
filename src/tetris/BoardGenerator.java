package tetris;

public class BoardGenerator {

	public void createBoard(Board board){
		for (int y = 0; y < Board.getBoardHeight(); y++) {
			for (int x = 0; x < Board.getBoardWidth(); x++) {
				board.setPieceAt(x,y, null);
			}
		}
	}
}
