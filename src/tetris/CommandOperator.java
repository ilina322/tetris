package tetris;

import java.util.Scanner;

public class CommandOperator {

	static Board board = new Board();
	static PieceMovement movement = new PieceMovement();

	public static void setKeyboardListener() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true) {
					char command = scanner.nextLine().charAt(0);
					changeDirection(command);

				}
			}

		}).start();
	}

	public static void changeDirection(char command) {
		switch (command) {
		case 'a':
			movement.moveLeft(board);
			break;
		case 'd':
			movement.moveRight(board);
			break;
		}
	}

}
