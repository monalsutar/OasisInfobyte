package NumberGameNew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberGame extends JFrame {

	private JPanel contentPane;
	public JFrame newFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGame frame = new NumberGame();
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
	public NumberGame() {
		setTitle("Welcome to the Game");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number Game");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 50));
		lblNewLabel.setBounds(190, 57, 254, 43);
		contentPane.add(lblNewLabel);
		
		JButton start = new JButton("Let's Start");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//secondFrame();
				//setVisible(false);
				NumberGameFrame2 newFrame = new NumberGameFrame2();
				newFrame.setVisible(true);
				//setVisible(false);
				dispose();
				
				newFrame.random_number_generator();
			}
		});
		start.setBackground(new Color(50, 205, 50));
		start.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		start.setBounds(214, 249, 193, 62);
		contentPane.add(start);
		setSize(700,600);
		
	}
	
}
