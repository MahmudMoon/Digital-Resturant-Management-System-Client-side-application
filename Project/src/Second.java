import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Second extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
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
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 258);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Online Bill Payment");
		label.setForeground(Color.WHITE);
		label.setBackground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(36, 21, 240, 35);
		contentPane.add(label);
		
		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Third trd = new Third();
				trd.setVisible(true);
		
			}
		});
		btnYes.setForeground(Color.BLUE);
		btnYes.setBackground(Color.LIGHT_GRAY);
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnYes.setBounds(32, 79, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNewButton = new JButton("NO");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(187, 81, 89, 23);
		contentPane.add(btnNewButton);
	}
}
