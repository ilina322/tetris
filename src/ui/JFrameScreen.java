
package ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tetris.Board;
import tetris.Piece;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JFrameScreen extends JFrame implements BoardScreen, KeyListener {

	private JPanel contentPane;
	private JButton[][] buttons = new JButton[Board.getBoardWidth()][Board.getBoardHeight()];
	private OnUserAction listener;
	private KeyListener keyListener;

	/**
	 * Create the frame.
	 * @param listener 
	 */
	public JFrameScreen(OnUserAction listener) {
		
		this.listener = listener;
		addKeyListener(keyListener);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(new GridLayout(Board.getBoardWidth(), Board.getBoardHeight()));

		for (int x = 0; x < Board.getBoardWidth(); x++) {
			for (int y = 0; y < Board.getBoardHeight(); y++) {
				createButtons(x, y);
			}
		}
	}

	public void createButtons(int x, int y) {
		JButton btn = new JButton("");
		buttons[x][y] = btn;
		contentPane.add(btn);
		System.out.println("button added");
		
	}
	

	@Override
	public void showBoard(Board board) {
		for (int x = 0; x < Board.getBoardWidth(); x++) {
			for (int y = 0; y < Board.getBoardHeight(); y++) {
				JButton button = buttons[x][y];
				Piece piece = board.getPieceAt(y, x);
				button.setBackground(piece == null ? Color.WHITE : Color.ORANGE);
				System.out.println("button colored");
			}

		}

	}
	
	public interface OnUserAction {
		
		void onRightArrow();

		void onLeftArrow();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			listener.onLeftArrow();
			System.out.println(e.getKeyCode());
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			listener.onRightArrow();
			System.out.println(e.getKeyCode());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}