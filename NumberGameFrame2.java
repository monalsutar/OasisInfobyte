package NumberGameNew;

import java.awt.EventQueue;
import java.util.Random;
import java.util.random.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class NumberGameFrame2 extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label1;
	private JLabel lblNewLabel_3;
	private JLabel status;
	private JButton guess;
	String entered_text;
	int entered_number;
	static int number,number2;
	int score = 0 , attempt = 4;
	private JButton exit;
	private JButton btnNewButton_1;
	private boolean restart = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGameFrame2 frame = new NumberGameFrame2();
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
	public NumberGameFrame2() {
		
		Message m =new Message();
		setTitle("Number Guessing Game");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label3 = new JLabel("Guess the Number : ");
		label3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label3.setBounds(88, 315, 240, 37);
		contentPane.add(label3);
		
		textField = new JTextField();
		textField.setBounds(338, 315, 380, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		label1 = new JLabel("Attempts Remaining : 5");
		
		label1.setForeground(new Color(0, 128, 64));
		label1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		label1.setBounds(35, 17, 318, 45);
		contentPane.add(label1);
		
		JLabel label5 = new JLabel("Welcome to the Game");
		label5.setForeground(new Color(148, 0, 211));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Maiandra GD", Font.BOLD, 35));
		label5.setBounds(177,157,421,64);
		contentPane.add(label5);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(270, 329, 5, -86);
		contentPane.add(lblNewLabel_3);
		
		status = new JLabel("");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setFont(new Font("Cambria Math", Font.PLAIN, 26));
		status.setBounds(88, 396, 636, 37);
		contentPane.add(status);
		
		guess = new JButton("GUESS");
		guess.setForeground(new Color(64, 0, 128));
		
		guess.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
						
				if(attempt >= 0) 
				{
				
					label1.setText("Attempts Remaining : " + attempt);
					
					entered_text = textField.getText().trim();
					entered_number = Integer.parseInt(entered_text);
					
					
					if(entered_number == number)
					{
						status.setText("Congratulations ! Number Guessed Correct. Guess again.");
						score += 1;
						
						
						
						attempt -= 1;
						
						//random_number_generator();
						textField.setText(null);
						
						m.setVisible(true);
						dispose();
						setVisible(false);
						//System.exit(0);
						
						//return;
					}
					else
					{
						status.setText(null);
						if(entered_number > number)
						{
							status.setText(entered_number + " is too High");
						}
						
						if(entered_number < number)
						{
							status.setText(entered_number + " is too low");
						}
						
						//status.setText("Nice try ! Try Again...");
						textField.setText(null);
						attempt -= 1;
						
						
					}
					
					
					if(attempt == -1)
					{
						int option = JOptionPane.showOptionDialog(null,
						            "Game Over\nYour Score: " + score + "\nYou lost",
						            "Game Over",
						            JOptionPane.YES_NO_OPTION,
						            JOptionPane.INFORMATION_MESSAGE,
						            null,
						            new Object[]{"Play again", "Exit"},
						            "Restart");
	
						
						    if (option == JOptionPane.YES_OPTION) 
						    {
						        
//						    	game();
//						        setVisible(false);
//						        //dispose();
//						        System.exit(0);
						    	

								score = 0;
								attempt = 4;
								entered_text = null;
								status.setText(null);
								textField.setText(null);
								label1.setText("Attempts Remaining : 5");
								//attempt = 4;
								
								NumberGameFrame2 ng = new NumberGameFrame2();
								ng.random_number_generator();
						        
						    } 
						    else 
						    {
						        // Exit the application
						        System.exit(0);
						    }
						
					}
					
					
					
					
				}
			}
		});
		guess.setBackground(new Color(255, 0, 128));
		guess.setFont(new Font("Times New Roman", Font.BOLD, 25));
		guess.setBounds(569, 481, 149, 39);
		contentPane.add(guess);
		
		exit = new JButton("END");
		exit.setForeground(new Color(255, 131, 6));
		exit.setBackground(new Color(0, 128, 64));
		exit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				System.exit(0);
				final_score();
				dispose();
				m.dispose();
			}
		});
		exit.setBounds(120, 480, 149, 40);
		guess.setBackground(new Color(148, 0, 211));
		guess.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(exit);
		
		
		
		
		btnNewButton_1 = new JButton("RESTART");
		btnNewButton_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1.setBounds(336, 480, 167, 40);
		
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				score = 0;
				attempt = 4;
				entered_text = null;
				status.setText(null);
				textField.setText(null);
				label1.setText("Attempts Remaining : 5");
				
				NumberGameFrame2 ng = new NumberGameFrame2();
				ng.random_number_generator();
				
			}
		});
		contentPane.add(btnNewButton_1);
		setSize(800,600);
		
	}
	
	
	public int final_score()
	{
		return score;
	}
	
	
	public void random_number_generator()
	{
		Random random = new Random();
		/*double random_num = Math.random();*/	
		int random_number = random.nextInt();
		int start_range = 1 , end_range = 100;
		number = random.nextInt(end_range - start_range + 1) + start_range;
		
		System.out.println(number);
		//return number;
	}
	
	public void game()
	{
		random_number_generator();
		
//		entered_text = textField.getText();
//		entered_number = Integer.parseInt(entered_text);
//		
		 try {
	            if (!entered_text.isEmpty()) {
	            	
	            	attempt -= 1;
	                int inputValue = Integer.parseInt(entered_text);
	                // Rest of your game logic using inputValue
	                
	                if(entered_number == number)
	        		{
	        			status.setText("Congratulations ! Number Guessed Correct.");
	        			score += 1;
	        			
	        			
	        			Message m =new Message();
	        			m.setVisible(true);
	        			
	        			
	        		}
	        		else
	        		{
	        			status.setText(null);
	        			if(entered_number > number)
	        			{
	        				status.setText(entered_number + " is too High");
	        			}
	        			
	        			if(entered_number < number)
	        			{
	        				status.setText(entered_number + " is too low");
	        			}
	        			
	        			textField.setText(null);
	        			attempt -= 1;
	        			
	        			
	        		}
	                
	                
	            } else {
	                // Handle the case where the input string is empty
	                System.out.println("Input is empty. Please enter a valid number.");
	            }
	        } catch (NumberFormatException e) {
	            // Handle the case where the input is not a valid integer
	            System.out.println("Invalid input. Please enter a valid number.");
	        }
		
		
		
			
		
	}
	
	public void resetGame() {
	    score = 0;
	    attempt = 5;
	    entered_text = null;
	    status.setText(null);
	    textField.setText(null);
	    label1.setText("Attempts Remaining : " + attempt);

	    random_number_generator();
	}

}
