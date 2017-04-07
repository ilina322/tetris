package ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tetris.Board;
import tetris.Piece;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class JFrameScreen extends JFrame implements BoardScreen {

	private JPanel contentPane;
	private JButton[][] buttons = new JButton[Board.getBoardWidth()][Board.getBoardHeight()];

	/**
	 * Create the frame.
	 */
	public JFrameScreen() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		GridBagLayout gbl_contentPane = new GridBagLayout();
		//TODO check if it works
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
		System.out.println("button");
		
	}
	

	@Override
	public void showBoard(Board board) {
		for (int x = 0; x < board.getBoardWidth(); x++) {
			for (int y = 0; y < board.getBoardHeight(); y++) {
				JButton button = buttons[x][y];
				Piece piece = board.getPieceAt(y, x);
				button.setBackground(piece == null ? Color.WHITE : Color.ORANGE);
				System.out.println("color");
			}

		}

	}

}
