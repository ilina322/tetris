package tetris;

import ui.BoardScreen;
import ui.ConsoleScreen;
import ui.JFrameScreen;

public class UiController {

	private static final long DELAY_IN_MILLIS = 1000;

	BoardScreen screen;
	//JFrameScreen screen;
	public UiController() {
		screen = new ConsoleScreen();
		//screen = new JFrameScreen();
	}

	public void printBoard(Board board) {	
		screen.showBoard(board);
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
