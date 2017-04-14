package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ui.JFrameScreen.OnUserAction;

public class Manager {

	private boolean isRunning;
	private Board board;
	private BoardGenerator generator;
	private OnUserAction listener;
	private UiController printer;
	private PieceMovement movement;
	private ScoreManager score;



	public Manager() {
		this.isRunning = true;
		this.board = new Board();
		this.generator = new BoardGenerator();
		this.listener = new OnUserAction() {

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
		this.printer = new UiController(listener);
		this.movement = new PieceMovement();
		this.score = new ScoreManager();
	}

	public void runGame() {

		generator.createBoard(board);
		while (isRunning) {
			ElementMovement element = board.generateElement();
			element.configure(board);
			while (element.isMoving()) {
				printer.printBoard(board);
				movement.moveDown(board);
				if(movement.checkShouldStop(board)){
					element.stopElement();
				}
				score.raiseScore(board);
				score.quickenGame();
				boolean flag1 = board.isBoardFull();
				if(flag1){
					endGame();
				}
			}
		}
	}
	
	
	private void endGame(){
		isRunning = false;
		System.out.println("Game Over");
	}
}