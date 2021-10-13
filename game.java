import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class demoo extends JFrame {

	private JPanel contentPane;
	private JTextField txtTheWinnerIs;
	private JTextField winner;
	private String startgame="X";
	
	private int xcount=0;
	private int ocount=0;
	private JTextField player1;
	private JTextField player2;
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	char playermark='x';
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demoo frame = new demoo();
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
	public void wingame() {
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(player1,"Player 1 wins");
			xcount+=1;
			player1.setText("1");
		}
		if(b1==1 && b4==1 && b7==1){
			JOptionPane.showMessageDialog(player1, "Player 1 wins");
			xcount+=1;
			player1.setText(String.valueOf(xcount));
			winner.setText("Player 1");
		}
		if(b4==1 && b5==1 && b6==1) {
			JOptionPane.showMessageDialog(player1, "Player 1 wins");
			xcount+=1;
			player1.setText(String.valueOf(xcount));
			winner.setText("Player 1");
		}
		if(b7==1 && b8==1 && b9==1) {
			JOptionPane.showMessageDialog(player1, "Player 1 wins");
			xcount+=1;
			player1.setText(String.valueOf(xcount));
			winner.setText("Player 1");
		}
		if(b1==1 && b5==1 && b9==1) {
			JOptionPane.showMessageDialog(player1, "Player 1 wins");
			xcount+=1;
			player1.setText(String.valueOf(xcount));
			winner.setText("Player 1");
		}
		if(b3==1 && b5==1 && b7==1) { 
			JOptionPane.showMessageDialog(player1, "Player 1 wins");
			xcount+=1;
			player1.setText(String.valueOf(xcount));
			winner.setText("Player 1");
		}
		if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(player2,"Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		if(b1==0 && b4==0 && b7==0){
			JOptionPane.showMessageDialog(player2, "Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		if(b4==0 && b5==0 && b6==0) {
			JOptionPane.showMessageDialog(player2, "Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		if(b7==0 && b8==0 && b9==0) {
			JOptionPane.showMessageDialog(player2, "Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		if(b1==0 && b5==0 && b9==0) {
			JOptionPane.showMessageDialog(player2, "Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		if(b3==0 && b5==0 && b7==0) { 
			JOptionPane.showMessageDialog(player2, "Player 2 wins");
			ocount+=1;
			player2.setText(String.valueOf(ocount));
			winner.setText("Player 2");
		}
		
	}
	
	public demoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label2 = new JLabel("          The Tic Tack Toe  Game");
		label2.setForeground(new Color(0, 0, 0));
		label2.setBackground(new Color(127, 255, 0));
		label2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		label2.setBounds(112, 35, 691, 85);
		contentPane.add(label2);
		
		JButton btn3 = new JButton("-------");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(playermark =='x') {
					playermark='0';
					btn3.setBackground(Color.cyan);
					btn3.setText("X");
				b3=1;
				}
				else {
					playermark='x';
					btn3.setBackground(Color.yellow);
						btn3.setText("0");
						b3=0;
				}
				btn3.setEnabled(false);
			wingame();	
			}
		});
		btn3.setBounds(504, 236, 105, 64);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("-----");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playermark =='x') {
					playermark='0';
					btn2.setBackground(Color.cyan);
					btn2.setText("X");
				b2=1;
				}
				else {
					playermark='x';
					btn2.setBackground(Color.yellow);
						btn2.setText("0");
				b2=0;
				}
				btn2.setEnabled(false);
				wingame();
			}
		});
		btn2.setBounds(340, 236, 105, 64);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("------");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playermark =='x') {
					playermark='0';
					btn1.setBackground(Color.cyan);
					btn1.setText("X");
					b1=1;
				}
				else {
					playermark='x';
					btn1.setBackground(Color.yellow);
					btn1.setText("0");
					b1=0;
				}
				btn1.setEnabled(false);
				wingame();
			}
		});
		btn1.setBounds(157, 236, 105, 64);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("----");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playermark =='x') {
					playermark='0';
					btn4.setBackground(Color.cyan);
					btn4.setText("X");
					b4=1;
				}
				else {
					playermark='x';
					btn4.setBackground(Color.yellow);
						btn4.setText("0");
				b4=0;
				}
				btn4.setEnabled(false);
				wingame();
			}
		});
		btn4.setBounds(157, 346, 105, 64);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("----");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(playermark =='x') {
					playermark='0';
					btn5.setBackground(Color.cyan);
					btn5.setText("X");
				b5=1;
				}
				else {
					playermark='x';
					btn5.setBackground(Color.yellow);
						btn5.setText("0");
						b5=0;
				}
				btn5.setEnabled(false);
				wingame();	
			}
		});
		btn5.setBounds(340, 346, 105, 64);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("-----");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(playermark =='x') {
					playermark='0';
					btn6.setBackground(Color.cyan);
					btn6.setText("X");
				b6=1;
				}
				else {
					playermark='x';
					btn6.setBackground(Color.yellow);
						btn6.setText("0");
				b6=0;
				}
				btn6.setEnabled(false);
				wingame();
				}
		});
		btn6.setBounds(504, 346, 105, 64);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("-----");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(playermark =='x') {
					playermark='0';
					btn7.setBackground(Color.cyan);
					btn7.setText("X");
					 b7=1;
				}
				else {
					playermark='x';
					btn7.setBackground(Color.yellow);
						btn7.setText("0");
				b7=0;
				}
				btn7.setEnabled(false);
				wingame();
				}
		});
		btn7.setBounds(157, 461, 105, 64);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("----");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(playermark =='x') {
					playermark='0';
					btn8.setBackground(Color.cyan);
					btn8.setText("X");
				b8=1;
				}
				else {
					playermark='x';
					btn8.setBackground(Color.yellow);
						btn8.setText("0");
				b8=0;
				}
				btn8.setEnabled(false);
				wingame();
				}
		});
		btn8.setBounds(340, 461, 105, 64);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("----");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playermark =='x') {
					playermark='0';
					btn9.setBackground(Color.cyan);
					btn9.setText("X");
				b9=1;
				}
				else {
					playermark='x';
					btn9.setBackground(Color.yellow);
						btn9.setText("0");
				b9=0;
				}
				btn9.setEnabled(false);
				wingame();
			}
		});
		btn9.setBounds(504, 461, 105, 64);
		contentPane.add(btn9);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(250, 128, 114));
		textArea.setBounds(32, 182, 624, 386);
		contentPane.add(textArea);
		
		txtTheWinnerIs = new JTextField();
		txtTheWinnerIs.setFont(new Font("Segoe Print", Font.ITALIC, 29));
		txtTheWinnerIs.setText("THE WINNER IS :");
		txtTheWinnerIs.setBounds(96, 578, 649, 54);
		contentPane.add(txtTheWinnerIs);
		txtTheWinnerIs.setColumns(10);
		
		winner = new JTextField();
		winner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		winner.setBounds(450, 578, 286, 54);
		contentPane.add(winner);
		winner.setColumns(10);
		
		JButton btnResetButton = new JButton("RESET ");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);

				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				
			btn1.setBackground(Color.white);
			btn2.setBackground(Color.white);
			btn3.setBackground(Color.white);
			btn4.setBackground(Color.white);
			btn5.setBackground(Color.white);
			btn6.setBackground(Color.white);
			btn7.setBackground(Color.white);
			btn8.setBackground(Color.white);
			btn9.setBackground(Color.white);
			
				btn1.setText("----");
				btn2.setText("----");
				btn3.setText("----");
				btn4.setText("----");
				btn5.setText("----");
				btn6.setText("----");
				btn7.setText("----");
				btn8.setText("----");
				btn9.setText("----");

				winner.setText(null);
			}
		});
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnResetButton.setBounds(183, 646, 194, 56);
		contentPane.add(btnResetButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//showconfirm dialog to show yes or no.
				if(JOptionPane.showConfirmDialog(btnExit,"ARE YOU SURE YOU WANT TO EXIT") ==0) {
			System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(415, 646, 194, 56);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("PLAYER 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 23));
		lblNewLabel.setBounds(666, 211, 227, 66);
		contentPane.add(lblNewLabel);
		
		player1 = new JTextField();
		player1.setFont(new Font("Tahoma", Font.BOLD, 19));
		player1.setBounds(777, 223, 116, 54);
		contentPane.add(player1);
		player1.setColumns(10);
		
		JLabel lblPlayer = new JLabel("PLAYER 2");
		lblPlayer.setFont(new Font("Tahoma", Font.ITALIC, 23));
		lblPlayer.setBounds(666, 310, 227, 66);
		contentPane.add(lblPlayer);
		
		player2 = new JTextField();
		player2.setFont(new Font("Tahoma", Font.BOLD, 18));
		player2.setColumns(10);
		player2.setBounds(777, 307, 116, 54);
		contentPane.add(player2);
	

	}
}
