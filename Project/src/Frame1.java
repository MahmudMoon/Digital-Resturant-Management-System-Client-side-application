import java.awt.*;

import javax.swing.*;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.*;
import java.io.*;


public class Frame1 {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=431,-21
	 */
	private final JLabel label_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static public JComboBox comboBox_Burger = null;
	static public JButton btnTotalCos = null;
	static public JComboBox comboBox_pizza = null;
	static public JComboBox comboBox_hot_dog = null;
	static public JLabel lblcost = null;
	JButton btnTotalCost = null;
	static public JComboBox comboBox_vanilla = null;
	static public JComboBox comboBox_Fancy_roll = null;
	static public JComboBox comboBox_Chocklate_cake = null;
	static public JComboBox comboBox_Coffee = null;
	static public JComboBox comboBox_Chicken = null;
	static public JComboBox comboBox_french = null;
	static public JComboBox comboBox_spring = null;
	static public JComboBox comboBox_Noodle = null;
	static public JComboBox comboBox_Vegetable = null;
	public static JRadioButton rdbtnOnlinePayment ;
	int cost ;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	int num10;
	int num11;
	int num12;
	private JTextField textFieldCost;
	String SS;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAccountNumber;

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(300, 300, 1050, 909);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox_Burger = new JComboBox();
		comboBox_Burger.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Burger.setBounds(175, 58, 56, 30);
		frame.getContentPane().add(comboBox_Burger);

		JLabel lblNewLabel = new JLabel("          Food Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(277, 0, 475, 47);
		frame.getContentPane().add(lblNewLabel);

		JLabel Burger = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("burger.png.jpg")).getImage();
		Burger.setIcon(new ImageIcon(img));
		Burger.setBounds(13, 29, 152, 149);
		frame.getContentPane().add(Burger);

		JLabel lblBurger = new JLabel("       Burger");
		lblBurger.setVerticalAlignment(SwingConstants.TOP);
		lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBurger.setBounds(23, 165, 140, 25);
		frame.getContentPane().add(lblBurger);

		JLabel lblPrice_Burger = new JLabel("    Price : 60.00");
		lblPrice_Burger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_Burger.setBounds(23, 189, 140, 30);
		frame.getContentPane().add(lblPrice_Burger);

		JLabel Pizza = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("pizza1.jpg")).getImage();
		Pizza.setIcon(new ImageIcon(img1));
		Pizza.setBounds(277, 47, 150, 120);
		frame.getContentPane().add(Pizza);

		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(337, 123, 1, 1);
		frame.getContentPane().add(verticalGlue);

		JLabel lblPizza = new JLabel("           Pizza");
		lblPizza.setBackground(new Color(240, 240, 240));
		lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPizza.setBounds(290, 165, 150, 20);
		frame.getContentPane().add(lblPizza);

		JLabel lblPrice_Pizza = new JLabel("       Price  : 75");
		lblPrice_Pizza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_Pizza.setBounds(290, 189, 137, 23);
		frame.getContentPane().add(lblPrice_Pizza);

		comboBox_pizza = new JComboBox();
		comboBox_pizza.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_pizza.setBounds(442, 58, 56, 30);
		frame.getContentPane().add(comboBox_pizza);

		JLabel HotDog = new JLabel("l");
		Image img2 = new ImageIcon(this.getClass().getResource("hot_dog.jpg")).getImage();
		HotDog.setIcon(new ImageIcon(img2));
		HotDog.setBounds(545, 47, 140, 120);
		frame.getContentPane().add(HotDog);

		comboBox_hot_dog = new JComboBox();
		comboBox_hot_dog.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_hot_dog.setBounds(695, 58, 57, 30);
		frame.getContentPane().add(comboBox_hot_dog);

		JLabel lblHotDog = new JLabel("       Hot Dog");
		lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotDog.setBounds(546, 165, 140, 20);
		frame.getContentPane().add(lblHotDog);

		JLabel lblPrice = new JLabel("      Price  : 70 ");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(546, 189, 140, 20);
		frame.getContentPane().add(lblPrice);

		JLabel lbl_coffee = new JLabel("l");
		Image img7 = new ImageIcon(this.getClass().getResource("coffee.jpg")).getImage();
		lbl_coffee.setIcon(new ImageIcon(img7));
		lbl_coffee.setBounds(803, 47, 140, 120);
		frame.getContentPane().add(lbl_coffee);

		comboBox_Coffee = new JComboBox();
		comboBox_Coffee.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Coffee.setBounds(953, 58, 57, 30);
		frame.getContentPane().add(comboBox_Coffee);

		JLabel lblCoffee = new JLabel("       Coffee");
		lblCoffee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCoffee.setBounds(803, 165, 140, 20);
		frame.getContentPane().add(lblCoffee);

		JLabel lblPrice_4 = new JLabel("      Price  : 40 ");
		lblPrice_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_4.setBounds(803, 189, 140, 20);
		frame.getContentPane().add(lblPrice_4);

		JLabel lbl_CHecken_soup = new JLabel("");
		Image img8 = new ImageIcon(this.getClass().getResource("chicken-soup.jpg")).getImage();
		lbl_CHecken_soup.setIcon(new ImageIcon(img8));
		lbl_CHecken_soup.setBounds(803, 219, 140, 143);
		frame.getContentPane().add(lbl_CHecken_soup);

		comboBox_Chicken = new JComboBox();
		comboBox_Chicken.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Chicken.setBounds(953, 243, 56, 30);
		frame.getContentPane().add(comboBox_Chicken);

		comboBox_french = new JComboBox();
		comboBox_french.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_french.setBounds(175, 442, 56, 30);
		frame.getContentPane().add(comboBox_french);

		comboBox_spring = new JComboBox();
		comboBox_spring.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_spring.setBounds(442, 442, 56, 30);
		frame.getContentPane().add(comboBox_spring);

		comboBox_Noodle = new JComboBox();
		comboBox_Noodle.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Noodle.setBounds(695, 447, 56, 30);
		frame.getContentPane().add(comboBox_Noodle);

		comboBox_Vegetable = new JComboBox();
		comboBox_Vegetable.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Vegetable.setBounds(953, 442, 56, 30);
		frame.getContentPane().add(comboBox_Vegetable);

		final JRadioButton rdbtnOnlinePayment = new JRadioButton("Online Payment");
		buttonGroup.add(rdbtnOnlinePayment);
		rdbtnOnlinePayment.setForeground(Color.BLUE);
		rdbtnOnlinePayment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnOnlinePayment.setBounds(358, 657, 152, 23);
		frame.getContentPane().add(rdbtnOnlinePayment);

		final JRadioButton rdbtnOffLinePayment = new JRadioButton("Off Line Payment");
		buttonGroup.add(rdbtnOffLinePayment);
		rdbtnOffLinePayment.setForeground(Color.RED);
		rdbtnOffLinePayment.setSelected(true);
		rdbtnOffLinePayment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnOffLinePayment.setBounds(358, 695, 152, 27);
		frame.getContentPane().add(rdbtnOffLinePayment);


		txtAccountNumber = new JTextField();
		txtAccountNumber.setForeground(Color.DARK_GRAY);
		txtAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAccountNumber.setBounds(516, 653, 189, 30);
		frame.getContentPane().add(txtAccountNumber);
		txtAccountNumber.setColumns(10);

		JButton btnTotalCost = new JButton(" Total Cost ");
		btnTotalCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1 = comboBox_Burger.getSelectedIndex();


				num2 = comboBox_pizza.getSelectedIndex();


				 num3 = comboBox_hot_dog.getSelectedIndex();
				 num4 = comboBox_vanilla.getSelectedIndex();
				 num5 =  comboBox_Fancy_roll.getSelectedIndex();
				num6 = comboBox_Chocklate_cake.getSelectedIndex();
				num7 = comboBox_Coffee.getSelectedIndex();
				num8 = comboBox_Chicken.getSelectedIndex();
				num9 = comboBox_french.getSelectedIndex();
				num10 = comboBox_spring.getSelectedIndex();
				num11 = comboBox_Noodle.getSelectedIndex();
				num12 = comboBox_Vegetable.getSelectedIndex();

				 cost = num1*60 + num2*75 + num3*70 +num4 * 50+ num5*45 + num6 * 85 + num7*40 + num8 * 50 + num9* 45 + num10*50 + num11*45 + num12*55;

				 String AA = Integer.toString(cost);
				 //JOptionPane.showMessageDialog(null, Integer.toString(cost));
				 String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
				 s1 = Integer.toString(num1);
				 s2 = Integer.toString(num2);
				 s3 = Integer.toString(num3);
				 s4 = Integer.toString(num4);
				 s5 = Integer.toString(num5);
				 s6 = Integer.toString(num6);
				 s7 = Integer.toString(num7);
				 s8 = Integer.toString(num8);
				 s9 = Integer.toString(num9);
				 s10 = Integer.toString(num10);
				 s11 = Integer.toString(num11);
				 s12 = Integer.toString(num12);

				 SS = s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12;

				 textFieldCost.setText(AA);

			}


		});
		btnTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnTotalCost.setBounds(10, 657, 221, 47);
		frame.getContentPane().add(btnTotalCost);

		JLabel lblvanilla = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("vanila.jpg")).getImage();
		lblvanilla.setIcon(new ImageIcon(img3));
		lblvanilla.setBounds(13, 219, 152, 149);
		frame.getContentPane().add(lblvanilla);

		comboBox_vanilla = new JComboBox();
		comboBox_vanilla.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_vanilla.setBounds(175, 243, 56, 30);
		frame.getContentPane().add(comboBox_vanilla);

		JLabel lblVanilla = new JLabel("        Vanilla");
		lblVanilla.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVanilla.setBackground(SystemColor.menu);
		lblVanilla.setBounds(13, 355, 152, 30);
		frame.getContentPane().add(lblVanilla);

		JLabel lblPrice_1 = new JLabel("     Price : 50.00");
		lblPrice_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_1.setBounds(13, 383, 140, 30);
		frame.getContentPane().add(lblPrice_1);

		JLabel lblfancy_roll = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("fancy_roll.jpg")).getImage();
		lblfancy_roll.setIcon(new ImageIcon(img4));
		lblfancy_roll.setBounds(277, 219, 152, 149);
		frame.getContentPane().add(lblfancy_roll);

		 comboBox_Fancy_roll = new JComboBox();
		comboBox_Fancy_roll.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Fancy_roll.setBounds(442, 243, 56, 30);
		frame.getContentPane().add(comboBox_Fancy_roll);

		JLabel lblFancyRoll = new JLabel("        Fancy Roll");
		lblFancyRoll.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFancyRoll.setBackground(SystemColor.menu);
		lblFancyRoll.setBounds(277, 360, 150, 20);
		frame.getContentPane().add(lblFancyRoll);

		JLabel lblPrice_2 = new JLabel("       Price  : 45.00");
		lblPrice_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_2.setBounds(277, 382, 137, 23);
		frame.getContentPane().add(lblPrice_2);

		JLabel lbl_chocklate_cake = new JLabel("l");
		Image img5 = new ImageIcon(this.getClass().getResource("Chocolate-Cake.jpg")).getImage();
		lbl_chocklate_cake.setIcon(new ImageIcon(img5));
		lbl_chocklate_cake.setBounds(546, 225, 140, 143);
		frame.getContentPane().add(lbl_chocklate_cake);

		JLabel lblChoco = new JLabel("  Chocolate Cake");
		lblChoco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChoco.setBounds(545, 355, 140, 20);
		frame.getContentPane().add(lblChoco);

		JLabel lblPrice_3 = new JLabel("     Price  : 85.00");
		lblPrice_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_3.setBounds(527, 379, 137, 23);
		frame.getContentPane().add(lblPrice_3);

		comboBox_Chocklate_cake = new JComboBox();
		comboBox_Chocklate_cake.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_Chocklate_cake.setBounds(696, 248, 56, 30);
		frame.getContentPane().add(comboBox_Chocklate_cake);

		textFieldCost = new JTextField();
		textFieldCost.setFont(new Font("Tahoma", Font.PLAIN, 36));
		textFieldCost.setBounds(241, 657, 111, 47);
		frame.getContentPane().add(textFieldCost);
		textFieldCost.setColumns(10);

		JLabel lblChickensoupjpg = new JLabel("    chicken-soup");
		lblChickensoupjpg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChickensoupjpg.setBounds(803, 360, 140, 20);
		frame.getContentPane().add(lblChickensoupjpg);

		JLabel lblPrice_5 = new JLabel("      Price  : 50");
		lblPrice_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_5.setBounds(803, 383, 140, 20);
		frame.getContentPane().add(lblPrice_5);

		JLabel lbl_french_fries = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("french-fries.jpg")).getImage();
		lbl_french_fries.setIcon(new ImageIcon(img9));
		lbl_french_fries.setBounds(13, 419, 152, 149);
		frame.getContentPane().add(lbl_french_fries);

		JLabel lblFrenchfries = new JLabel("      French-Fries");
		lblFrenchfries.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFrenchfries.setBackground(SystemColor.menu);
		lblFrenchfries.setBounds(15, 560, 150, 20);
		frame.getContentPane().add(lblFrenchfries);

		JLabel label_2 = new JLabel("       Price  : 45.00");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 579, 137, 23);
		frame.getContentPane().add(label_2);

		JLabel lbl_spring_rolls = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("spring_rolls.jpg")).getImage();
		lbl_spring_rolls.setIcon(new ImageIcon(img10));
		lbl_spring_rolls.setBounds(275, 419, 152, 149);
		frame.getContentPane().add(lbl_spring_rolls);

		JLabel lblSpringrolls = new JLabel("        Spring_rolls");
		lblSpringrolls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpringrolls.setBackground(SystemColor.menu);
		lblSpringrolls.setBounds(277, 560, 150, 20);
		frame.getContentPane().add(lblSpringrolls);

		JLabel lblPrice_6 = new JLabel("       Price  : 50.00");
		lblPrice_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_6.setBounds(277, 579, 137, 23);
		frame.getContentPane().add(lblPrice_6);

		JLabel label = new JLabel("l");
		Image img11 = new ImageIcon(this.getClass().getResource("chinese.jpg")).getImage();
		label.setIcon(new ImageIcon(img11));
		label.setBounds(545, 425, 140, 143);
		frame.getContentPane().add(label);


		JLabel lblNoodle = new JLabel("        Noodle");
		lblNoodle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNoodle.setBackground(SystemColor.menu);
		lblNoodle.setBounds(545, 560, 150, 20);
		frame.getContentPane().add(lblNoodle);

		JLabel lblPrice_7 = new JLabel("       Price  : 45.00");
		lblPrice_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_7.setBounds(527, 579, 137, 23);
		frame.getContentPane().add(lblPrice_7);

		JLabel label_3 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("vegetables_soup.jpg")).getImage();
		label_3.setIcon(new ImageIcon(img12));
		label_3.setBounds(803, 419, 140, 143);
		frame.getContentPane().add(label_3);

		JLabel lblVegetablessoup = new JLabel("    Vegetables_soup");
		lblVegetablessoup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVegetablessoup.setBounds(792, 560, 140, 20);
		frame.getContentPane().add(lblVegetablessoup);

		JLabel lblPrice_8 = new JLabel("      Price  : 55");
		lblPrice_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice_8.setBounds(803, 582, 140, 20);
		frame.getContentPane().add(lblPrice_8);


		JButton btnNewButton_Order = new JButton("Conform Order");
		btnNewButton_Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cost==0)
				{
					JOptionPane.showMessageDialog(null, "Your Order Can't Be Conformed, Select Items");
				}else
				{

				JOptionPane.showMessageDialog(null, "Your Order Has been Conformed");

				String S1 ;;
				if(rdbtnOnlinePayment.isSelected())
				{
					S1 = "Online";
				}else
					S1 = "Offline";




				if(S1=="Online")
				{

					String STR = txtAccountNumber.getText();
					SS = SS + STR;
				}

				if(S1=="Online")
				{
				frame.dispose();
				Second S = new Second();
				S.setVisible(true);
				}
				try{
					InetAddress II = InetAddress.getLocalHost();
					//Shakil IP = 192.168.43.51
					Socket s = new Socket(II,9999);
					DataOutputStream dout = new DataOutputStream(s.getOutputStream());
					//JOptionPane.showMessageDialog(null,str);
					dout.writeUTF(SS);
					dout.flush();
					dout.close();
					s.close();
				}catch(Exception e)
				{
					System.out.println("Wrong Entry");
				}
			}
			}
		});
		btnNewButton_Order.setBackground(Color.DARK_GRAY);
		btnNewButton_Order.setForeground(Color.GRAY);
		btnNewButton_Order.setFont(btnNewButton_Order.getFont().deriveFont(btnNewButton_Order.getFont().getSize() + 9f));
		btnNewButton_Order.setBounds(726, 668, 213, 36);
		frame.getContentPane().add(btnNewButton_Order);

		Label label_4 = new Label("    Account Number");
		label_4.setBounds(537, 689, 148, 30);
		frame.getContentPane().add(label_4);





	}
}



