import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;


public class Bkash extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bkash frame = new Bkash();
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
	public Bkash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 596);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label_1 = new Label("1. Go to your bKash Mobile Menu by dialing *247#");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(54, 80, 523, 50);
		contentPane.add(label_1);
		
		Label label = new Label("2. Choose \u201CSend Money\u201D");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setBounds(54, 116, 414, 50);
		contentPane.add(label);
		
		Label label_2 = new Label("3. Enter the bKash Account Number \"01xxxxxxxxx\"");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_2.setForeground(Color.RED);
		label_2.setBounds(54, 161, 510, 50);
		contentPane.add(label_2);
		
		Label label_3 = new Label("4. Enter the amount of Your Total Bill");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_3.setForeground(Color.RED);
		label_3.setBounds(54, 208, 359, 50);
		contentPane.add(label_3);
		
		Label label_4 = new Label("5. Enter a reference about the transaction. ");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_4.setBounds(54, 252, 733, 50);
		contentPane.add(label_4);
		
		Label label_5 = new Label("6. Now enter your bKash Mobile Menu PIN to confirm the transaction");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_5.setBounds(54, 295, 733, 50);
		contentPane.add(label_5);
		
		Label label_6 = new Label("     For Bkash Users ");
		label_6.setBackground(Color.DARK_GRAY);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 36));
		label_6.setBounds(209, 10, 368, 50);
		contentPane.add(label_6);
	}

}
