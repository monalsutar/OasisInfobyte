package NumberGameNew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class finalRound extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalRound frame = new finalRound();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public finalRound() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFinalRound = new JLabel("Final Round");
		lblFinalRound.setBounds(154, 41, 209, 43);
		lblFinalRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalRound.setForeground(new Color(0, 64, 128));
		lblFinalRound.setFont(new Font("Maiandra GD", Font.BOLD, 35));
		contentPane.add(lblFinalRound);
		
		JLabel lblGuessNumber = new JLabel("Guess 1 Number");
		lblGuessNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessNumber.setForeground(new Color(0, 128, 128));
		lblGuessNumber.setFont(new Font("Maiandra GD", Font.BOLD, 28));
		lblGuessNumber.setBounds(53, 94, 421, 45);
		contentPane.add(lblGuessNumber);
		
		JLabel label3 = new JLabel("Guess the Number : ");
		label3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label3.setBounds(34, 189, 240, 37);
		contentPane.add(label3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(271, 189, 249, 37);
		contentPane.add(textField);
		
		JButton guess = new JButton("GUESS");
		guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				String temp = textField.getText().toString();
//				int number = Integer.parseInt(temp);
//				
//				if(number == num)
//				{
//					Message m = new Message();
//					setVisible(false);
//					m.setVisible(true);
//					
//				}
//				
			}
		});
		guess.setForeground(new Color(64, 0, 128));
		guess.setFont(new Font("Times New Roman", Font.BOLD, 25));
		guess.setBackground(new Color(255, 0, 128));
		guess.setBounds(325, 253, 149, 39);
		contentPane.add(guess);
		
		JLabel lblFinalRound_1 = new JLabel("Final Round");
		lblFinalRound_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalRound_1.setForeground(new Color(0, 64, 128));
		lblFinalRound_1.setFont(new Font("Freestyle Script", Font.PLAIN, 64));
		lblFinalRound_1.setBounds(34, 335, 486, 76);
		contentPane.add(lblFinalRound_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(64, 0, 128));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnExit.setBackground(new Color(255, 0, 128));
		btnExit.setBounds(89, 253, 149, 39);
		contentPane.add(btnExit);
		setSize(600,600);
	}
}
