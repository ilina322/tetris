package tetris;

import ui.BoardScreen;
import ui.ConsoleScreen;
import ui.JFrameScreen;
import ui.JFrameScreen.OnUserAction;

public class UiController {

	private static long delayInMillis = 1000;
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
			Thread.sleep(delayInMillis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void setDelayInMillis(long delayInMillis) {
		UiController.delayInMillis = delayInMillis;
	}

	public static long getDelayInMillis() {
		return delayInMillis;
	}

	public void gameOver() {
		screen.showPopupMessage("Game Over");
		
	}

}
