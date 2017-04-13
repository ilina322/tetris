package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ui.JFrameScreen.OnUserAction;

public class Manager {

	private boolean isRunning = true;
	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	OnUserAction listener = new OnUserAction() {

		@Override
		public void onRightArrow() {
			System.out.println("right arrow clicked");
			movement.moveRight(board);

		}

		@Override
		public void onLeftArrow() {
			System.out.println("left arrow clicked");
			movement.moveLeft(board);

		}
	};
	UiController printer = new UiController(listener);
	PieceMovement movement = new PieceMovement();
	ScoreManager score = new ScoreManager();

	public ElementMovement generateElement() {

		//move to board
		Random rand = new Random();
		int type = rand.nextInt(7);
		List<ElementMovement> elementArray = new ArrayList<>();

		elementArray.add(new ElementT());
		elementArray.add(new ElementI());
		elementArray.add(new ElementL());
		elementArray.add(new ElementJ());
		elementArray.add(new ElementO());
		elementArray.add(new ElementS());
		elementArray.add(new ElementZ());

		return elementArray.get(type);

	}

	public void runGame() {

		generator.createBoard(board);
		while (true) {
			ElementMovement element = generateElement();
			element.configure(board);
			while (element.isMoving()) {
				printer.printBoard(board);
				movement.moveDown(board);
				if(movement.checkShouldStop(board)){
					element.stopElement();
				}
				score.raiseScore(board);
			}
		}
	}
}