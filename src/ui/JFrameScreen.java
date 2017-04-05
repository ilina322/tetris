package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tetris.Board;
import tetris.Piece;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class JFrameScreen extends JFrame implements BoardScreen{

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
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		createButton(0, 0);
		createButton(1, 0);
		createButton(2, 0);
		createButton(3, 0);
		createButton(4, 0);
		createButton(0, 1);
		createButton(1, 1);
		createButton(2, 1);
		createButton(3, 1);
		createButton(4, 1);
		createButton(0, 2);
		createButton(1, 2);
		createButton(2, 2);
		createButton(3, 2);
		createButton(4, 2);
	}
	
	public JButton createButton(int x, int y){
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = x; 
		gbc_btnNewButton.gridy = y; 
		contentPane.add(btnNewButton, gbc_btnNewButton);
		buttons[x][y] = btnNewButton;
		
		return btnNewButton;
	}
	


	@Override
	public void showBoard(Board board) {
		for (int x = board.getBoardWidth() - 1; x >= 0; x--) {
			for (int y = board.getBoardHeight() - 1; y >= 0; y--) {
				JButton button = buttons[x][y];
				Piece piece = board.getPieceAt(x, y);
				button.setBackground(piece != null ? Color.BLACK : Color.BLUE);
			}
			
		}
		
	}

}
