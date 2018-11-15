//4 7:29
package gameBoardTutorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller window = new Controller();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Controller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GameBoard board = new GameBoard ();
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblGameBoardTutorial = new JLabel("Game Board Tutorial ");
		lblGameBoardTutorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGameBoardTutorial = new GridBagConstraints();
		gbc_lblGameBoardTutorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblGameBoardTutorial.gridx = 2;
		gbc_lblGameBoardTutorial.gridy = 0; 
		frame.getContentPane().add(lblGameBoardTutorial, gbc_lblGameBoardTutorial);
		
		JButton btnSetupBoard = new JButton("Setup Board");
		btnSetupBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textArea.setText("Hi I am Working");
				textArea.setText(board.boardToString()); 
				 
			}
		});
		GridBagConstraints gbc_btnSetupBoard = new GridBagConstraints();
		gbc_btnSetupBoard.insets = new Insets(0, 0, 5, 0);
		gbc_btnSetupBoard.gridx = 5;
		gbc_btnSetupBoard.gridy = 0;
		frame.getContentPane().add(btnSetupBoard, gbc_btnSetupBoard);
		
		 textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 9;
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 1;
		frame.getContentPane().add(textArea, gbc_textArea);
		
		JButton btnShakeBoard = new JButton("Shake Board");
		btnShakeBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnShakeBoard = new GridBagConstraints();
		gbc_btnShakeBoard.insets = new Insets(0, 0, 5, 0);
		gbc_btnShakeBoard.gridx = 5;
		gbc_btnShakeBoard.gridy = 1;
		frame.getContentPane().add(btnShakeBoard, gbc_btnShakeBoard);
			
		JRadioButton rdbtnKnight = new JRadioButton("Knight");
		GridBagConstraints gbc_rdbtnKnight = new GridBagConstraints();
		gbc_rdbtnKnight.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnKnight.gridx = 4;
		gbc_rdbtnKnight.gridy = 3;
		frame.getContentPane().add(rdbtnKnight, gbc_rdbtnKnight);
		
		JRadioButton rdbtnNewRook = new JRadioButton("Rook");
		GridBagConstraints gbc_rdbtnNewRook = new GridBagConstraints();
		gbc_rdbtnNewRook.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRook.gridx = 4;
		gbc_rdbtnNewRook.gridy = 4;
		frame.getContentPane().add(rdbtnNewRook, gbc_rdbtnNewRook);
		
		JLabel lblNewLabel = new JLabel("X Location");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 5;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinnerXLoc = new JSpinner();
		GridBagConstraints gbc_spinnerXLoc = new GridBagConstraints();
		gbc_spinnerXLoc.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerXLoc.gridx = 5;
		gbc_spinnerXLoc.gridy = 5;
		frame.getContentPane().add(spinnerXLoc, gbc_spinnerXLoc);
		
		JLabel lblNewLabel_1 = new JLabel("Y Location");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 6;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JSpinner spinnerYLoc = new JSpinner();
		GridBagConstraints gbc_spinnerYLoc = new GridBagConstraints();
		gbc_spinnerYLoc.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerYLoc.gridx = 5;
		gbc_spinnerYLoc.gridy = 6;
		frame.getContentPane().add(spinnerYLoc, gbc_spinnerYLoc);
		
		JButton btnPlacePiece = new JButton("Place Piece");
		GridBagConstraints gbc_btnPlacePiece = new GridBagConstraints();
		gbc_btnPlacePiece.insets = new Insets(0, 0, 5, 0);
		gbc_btnPlacePiece.gridx = 5;
		gbc_btnPlacePiece.gridy = 7;
		frame.getContentPane().add(btnPlacePiece, gbc_btnPlacePiece);
	}

}
