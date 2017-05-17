import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Third extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Third frame = new Third();
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
	public Third() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DBBL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBBL dbbl = new DBBL();
				dbbl.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		btnNewButton.setBounds(38, 30, 360, 73);
		contentPane.add(btnNewButton);
		
		JButton btnBkash = new JButton("BKash");
		btnBkash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bkash bkash = new Bkash();
				bkash.setVisible(true);
			}
		});
		btnBkash.setForeground(Color.WHITE);
		btnBkash.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		btnBkash.setBackground(Color.BLACK);
		btnBkash.setBounds(38, 129, 360, 73);
		contentPane.add(btnBkash);
	}

}
