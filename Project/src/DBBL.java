import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;


public class DBBL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBBL frame = new DBBL();
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
	public DBBL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("1.Dail *322# from Your DBBL ");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setForeground(Color.RED);
		label.setBounds(44, 83, 698, 58);
		contentPane.add(label);
		
		Label label_1 = new Label("2.Go to the Send Money option ");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setForeground(Color.RED);
		label_1.setBounds(44, 126, 698, 58);
		contentPane.add(label_1);
		
		Label label_2 = new Label("3.Press '2'");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_2.setForeground(Color.RED);
		label_2.setBounds(44, 163, 698, 58);
		contentPane.add(label_2);
		
		Label label_3 = new Label("4.Enter Number \"01xxxxxxxxx'\" ");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_3.setBounds(44, 202, 698, 58);
		contentPane.add(label_3);
		
		Label label_4 = new Label("6.Give Your \"PIN NUMBER\" ");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_4.setForeground(Color.RED);
		label_4.setBounds(44, 294, 698, 43);
		contentPane.add(label_4);
		
		Label label_5 = new Label("7.Press \"ENTER\"");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_5.setForeground(Color.RED);
		label_5.setBounds(44, 328, 698, 58);
		contentPane.add(label_5);
		
		Label label_6 = new Label("For DBBL Mobile Banking Users");
		label_6.setBackground(Color.DARK_GRAY);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 36));
		label_6.setBounds(104, 0, 539, 43);
		contentPane.add(label_6);
		
		Label label_7 = new Label("5.Enter the BILL AMOUNT");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_7.setBounds(44, 245, 698, 58);
		contentPane.add(label_7);
	}

}
