package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager {

	Board board = new Board();
	BoardGenerator generator = new BoardGenerator();
	UiController printer = new UiController();
	PieceMovement movement = new PieceMovement();

	
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

	public void startGame() {

		
		generator.createBoard(board);
		while (true) {
			ElementMovement element = generateElement();
			element.configure(board);
			while (element.isMoving()) {
				movement.moveDown(board);
				printer.printBoard(board);
				System.out.println();
			}
		}
	}
}
