package tetris;

public class BoardPrinter {

	private static final long DELAY_IN_MILLIS = 400;

	public void printBoard(Board board) {
		for (int y = 0; y < Board.getBoardHeight(); y++) {
			for (int x = 0; x < Board.getBoardWidth(); x++) {
				if (board.getPieceAt(x, y) instanceof Piece) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		delay();
	}
	
	private static void delay() {
		try {
			Thread.sleep(DELAY_IN_MILLIS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
