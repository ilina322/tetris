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
	private JButton[][] buttons = new JButton[5][6];

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
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				JButton btnNewButton_1 = new JButton("New button");
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_1.gridx = i;
				gbc_btnNewButton_1.gridy = j;
				contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
				buttons[i][j] = btnNewButton_1;
			}
		}
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
