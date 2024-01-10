package NumberGameNew;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.image.ImageObserver;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class Message extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Message frame = new Message();
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
	public Message() {
		setTitle("Final Result");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		
//		NumberGameFrame2 nf = new NumberGameFrame2();
//		int x = nf.final_score();
		
		JLabel lblNewLabel = new JLabel("Congratulations !!!");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Freestyle Script", Font.PLAIN, 57));
		lblNewLabel.setBounds(93, 112, 317, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You Sucessfully Guessed the Number.");
		lblNewLabel_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 33));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(33, 235, 422, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Play Again");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				NumberGameFrame2 n = new NumberGameFrame2();
				n.setVisible(true);
				
				//n.random_number_generator();
				n.game();
				n.dispose();
				
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 25));
		btnNewButton.setBounds(51, 348, 174, 65);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//setVisible(false);
				System.exit(0);
				dispose();
			}
		});
		btnExit.setForeground(new Color(0, 128, 192));
		btnExit.setFont(new Font("Rockwell Condensed", Font.BOLD, 25));
		btnExit.setBounds(266, 348, 144, 65);
		contentPane.add(btnExit);
		
		setSize(500,500);
	}
}
