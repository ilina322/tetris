package tetris;

import ui.BoardScreen;
import ui.ConsoleScreen;
import ui.JFrameScreen;
import ui.JFrameScreen.OnUserAction;

public class UiController {

	private static final long DELAY_IN_MILLIS = 1000;
	JFrameScreen screen;

	
	public UiController(OnUserAction listener) {	
		screen = new JFrameScreen(listener);
	}

	public void printBoard(Board board) {
		delay();
		screen.showBoard(board);
	}
	
	private static void delay() {
		try {
			Thread.sleep(DELAY_IN_MILLIS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
