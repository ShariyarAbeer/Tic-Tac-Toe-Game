import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TicTacToe {
	int player=1;
	
	String p1,p2,p3,p4,p5,p6,p7,p8,p9;
	
	

	private JFrame frame;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b0 = new JButton("");
		b0.setBounds(10, 11, 60, 56);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (player == 1){
					b0.setText("X");
					player = 2;
				}else{
					b0.setText("O");
					player=1;
				}
				b0.setEnabled(false);
				p1=b0.getText();
			}
		});
		frame.getContentPane().setLayout(null);
		b0.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b0);
		
		JButton b1 = new JButton("");
		b1.setBounds(74, 11, 60, 56);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b1.setText("X");
					player = 2;
				}else{
					b1.setText("O");
					player=1;
				}
				b1.setEnabled(false);
				p2=b1.getText();
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setBounds(138, 11, 60, 56);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b2.setText("X");
					player = 2;
				}else{
					b2.setText("O");
					player=1;
				}
				b2.setEnabled(false);
				p3=b2.getText();
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setBounds(10, 71, 60, 56);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b3.setText("X");
					player = 2;
				}else{
					b3.setText("O");
					player=1;
				}
				b3.setEnabled(false);
				p4=b3.getText();
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("");
		b4.setBounds(74, 71, 60, 56);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b4.setText("X");
					player = 2;
				}else{
					b4.setText("O");
					player=1;
				}
				b4.setEnabled(false);
				p5=b4.getText();
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("");
		b5.setBounds(138, 71, 60, 56);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b5.setText("X");
					player = 2;
				}else{
					b5.setText("O");
					player=1;
				}
				b5.setEnabled(false);
				p6=b5.getText();
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("");
		b6.setBounds(10, 131, 60, 56);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b6.setText("X");
					player = 2;
				}else{
					b6.setText("O");
					player=1;
				}
				b6.setEnabled(false);
				p7=b6.getText();
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("");
		b7.setBounds(74, 131, 60, 56);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b7.setText("X");
					player = 2;
				}else{
					b7.setText("O");
					player=1;
				}
				b7.setEnabled(false);
				p8=b7.getText();
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("");
		b8.setBounds(138, 131, 60, 56);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player == 1){
					b8.setText("X");
					player = 2;
				}else{
					b8.setText("O");
					player=1;
				}
				b8.setEnabled(false);
				p9=b8.getText();
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("New Game");
		b9.setFont(new Font("Tahoma", Font.BOLD, 16));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b0.setText(null);
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				t2.setText(null);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b0.setEnabled(true);
				
				
				
			}
		});
		b9.setBounds(10, 198, 188, 40);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("Result");
		b10.setFont(new Font("Tahoma", Font.BOLD, 16));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(p1==p2){
				if(p2==p3){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p4==p5){
				if(p5==p6){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p7==p8){
				if(p8==p9){
					t2.setText("Player one Win");
				
				}
			}else{
				t2.setText("Game Over");
			}
			if(p1==p4){
				if(p4==p7){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p2==p5){
				if(p5==p8){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p3==p6){
				if(p6==p9){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p1==p5){
				if(p5==p9){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			if(p3==p5){
				if(p5==p7){
					t2.setText("Player one Win");
				}
			}else{
				t2.setText("Game Over");
			}
			
			
			}
				
		});
		b10.setBounds(223, 223, 188, 56);
		frame.getContentPane().add(b10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 20));
		t2.setBounds(223, 11, 188, 116);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		
	}
}
