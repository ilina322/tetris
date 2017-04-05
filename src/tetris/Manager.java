package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Manager {

	private boolean isRunning = true;
	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	UiController printer = new UiController();
	PieceMovement movement = new PieceMovement();
	ScoreManager score = new ScoreManager();
	

	public ElementMovement generateElement() {

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
		setKeyboardListener();
		
		generator.createBoard(board);
		while (true) {
			ElementMovement element = generateElement();
			element.configure(board);
			while (element.isMoving()) {
				movement.moveDown(board);
				element.stopElement();
				score.raiseScore(board);
				printer.printBoard(board);
				System.out.println();
			}
		}
	}
	
	public void setKeyboardListener() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (isRunning) {
					char command = scanner.nextLine().charAt(0);
					handleKeyPressed(command);
					changeDirection(command);
				}
				scanner.close();
			}
			
			

		}).start();
	}
	private void changeDirection(char command) {
		switch (command) {
		case 'a':
			movement.moveLeft(board);
			break;
		case 'd':
			movement.moveRight(board);
			break;
		case 's': System.out.println("Score: " + score.getScore());
			
		}

	}
	
	private static void handleKeyPressed(char keyCode) {
		System.out.println("Key pressed:" + keyCode);
	}
	
}
