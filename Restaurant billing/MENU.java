package myproject;
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;

public class menu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jName;
	private JTextField jQty1;
	private JTextField jQty2;
	private JTextField jQty3;
	private JTextField jPrice1;
	private JTextField jPrice2;
	private JTextField jPrice3;
	private JTextField jSubtotal1;
	private JTextField jSubtotal2;
	private JTextField jSubtotal3;
	private JTextField jTotal1;
	private JTextField jTax1;
	private JTextField jNetprice1;
	private JTextArea jTextarea2;
	private JTextField jQty4;
	private JTextField jPrice4;
	private JTextField jSubtotal4;
	private JTextField jQty5;
	private JTextField jPrice5;
	private JTextField jSubtotal5;
	private JLabel lblNewLabel_1;
	private JButton btnExit;
	private JFrame frame;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	double manchowsoup = 120;
	double babycornmanchurian = 135;
	double vegbiryani = 100;
	double paneerroll = 150;
	double oreomilkshake = 90;

	/**
	 * Create the frame.
	 */
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 51, 0), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerName = new JLabel("CUSTOMER NAME:");
		lblCustomerName.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblCustomerName.setBounds(106, 56, 138, 14);
		contentPane.add(lblCustomerName);

		jName = new JTextField();
		jName.setBounds(290, 54, 183, 20);
		contentPane.add(jName);
		jName.setColumns(10);

		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblMenu.setBounds(61, 99, 67, 14);
		contentPane.add(lblMenu);

		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblQuantity.setBounds(241, 99, 86, 14);
		contentPane.add(lblQuantity);

		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblPrice.setBounds(370, 99, 76, 14);
		contentPane.add(lblPrice);

		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblSubtotal.setBounds(512, 99, 86, 14);
		contentPane.add(lblSubtotal);

		JLabel lblManchowsoup = new JLabel("MANCHOW SOUP");
		lblManchowsoup.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblManchowsoup.setBounds(50, 158, 125, 14);
		contentPane.add(lblManchowsoup);

		JLabel lblManchurian = new JLabel("BABY CORN MANCHURIAN");
		lblManchurian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblManchurian.setBounds(50, 226, 163, 14);
		contentPane.add(lblManchurian);

		JLabel lblBiryani = new JLabel("VEG BIRYANI");
		lblBiryani.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiryani.setBounds(50, 288, 125, 14);
		contentPane.add(lblBiryani);

		jQty1 = new JTextField();
		jQty1.setHorizontalAlignment(SwingConstants.CENTER);
		jQty1.setBounds(254, 156, 53, 20);
		contentPane.add(jQty1);
		jQty1.setColumns(10);

		jQty2 = new JTextField();
		jQty2.setHorizontalAlignment(SwingConstants.CENTER);
		jQty2.setBounds(254, 224, 53, 20);
		contentPane.add(jQty2);
		jQty2.setColumns(10);

		jQty3 = new JTextField();
		jQty3.setHorizontalAlignment(SwingConstants.CENTER);
		jQty3.setBounds(254, 286, 53, 20);
		contentPane.add(jQty3);
		jQty3.setColumns(10);

		jPrice1 = new JTextField();
		jPrice1.setBounds(370, 156, 86, 20);
		contentPane.add(jPrice1);
		jPrice1.setColumns(10);

		jPrice2 = new JTextField();
		jPrice2.setBounds(370, 224, 87, 20);
		contentPane.add(jPrice2);
		jPrice2.setColumns(10);

		jPrice3 = new JTextField();
		jPrice3.setBounds(370, 286, 87, 20);
		contentPane.add(jPrice3);
		jPrice3.setColumns(10);

		jSubtotal1 = new JTextField();
		jSubtotal1.setBounds(512, 156, 76, 20);
		contentPane.add(jSubtotal1);
		jSubtotal1.setColumns(10);

		jSubtotal2 = new JTextField();
		jSubtotal2.setBounds(512, 224, 76, 20);
		contentPane.add(jSubtotal2);
		jSubtotal2.setColumns(10);

		jSubtotal3 = new JTextField();
		jSubtotal3.setBounds(512, 286, 76, 20);
		contentPane.add(jSubtotal3);
		jSubtotal3.setColumns(10);

		JLabel lblOrderTotal = new JLabel("TOTAL");
		lblOrderTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderTotal.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblOrderTotal.setBounds(30, 547, 89, 14);
		contentPane.add(lblOrderTotal);

		JLabel lblTaxPaid = new JLabel("TAX");
		lblTaxPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxPaid.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblTaxPaid.setBounds(251, 547, 76, 14);
		contentPane.add(lblTaxPaid);

		JLabel lblNewLabel = new JLabel("NET AMOUNT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblNewLabel.setBounds(467, 547, 116, 14);
		contentPane.add(lblNewLabel);

		jTotal1 = new JTextField();
		jTotal1.setBounds(127, 546, 86, 20);
		contentPane.add(jTotal1);
		jTotal1.setColumns(10);

		jTax1 = new JTextField();
		jTax1.setBounds(340, 546, 86, 20);
		contentPane.add(jTax1);
		jTax1.setColumns(10);

		jNetprice1 = new JTextField();
		jNetprice1.setBounds(593, 546, 86, 20);
		contentPane.add(jNetprice1);
		jNetprice1.setColumns(10);

		JButton btnSum = new JButton("ORDER NOW");
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Qty1 = Double.parseDouble(jQty1.getText());
				double Qty2 = Double.parseDouble(jQty2.getText());
				double Qty3 = Double.parseDouble(jQty3.getText());
				double Qty4 = Double.parseDouble(jQty4.getText());
				double Qty5 = Double.parseDouble(jQty5.getText());

				double subTotal, addUp, p1, p2, p3, p4, p5, ptax;

				String soup = String.format("Rs.%.2f", manchowsoup);
				jPrice1.setText(soup);
				String manchurian = String.format("Rs.%.2f", babycornmanchurian);
				jPrice2.setText(manchurian);
				String biryani = String.format("Rs.%.2f", vegbiryani);
				jPrice3.setText(biryani);
				String roll = String.format("Rs.%.2f", paneerroll);
				jPrice4.setText(roll);
				String milkshake = String.format("Rs.%.2f", oreomilkshake);
				jPrice5.setText(milkshake);

				p1 = Qty1 * manchowsoup;
				p2 = Qty2 * babycornmanchurian;
				p3 = Qty3 * vegbiryani;
				p4 = Qty4 * paneerroll;
				p5 = Qty5 * oreomilkshake;

				String sub1 = String.format("Rs.%.2f", p1);
				jSubtotal1.setText(sub1);
				String sub2 = String.format("Rs.%.2f", p2);
				jSubtotal2.setText(sub2);
				String sub3 = String.format("Rs.%.2f", p3);
				jSubtotal3.setText(sub3);
				String sub4 = String.format("Rs.%.2f", p4);
				jSubtotal4.setText(sub4);
				String sub5 = String.format("Rs.%.2f", p5);
				jSubtotal5.setText(sub5);

				subTotal = p1 + p2 + p3 + p4 + p5;
				ptax = (subTotal * 18) / 100;
				addUp = subTotal + ptax;

				String subTotalAll = String.format("Rs.%.2f", subTotal);
				jTotal1.setText(subTotalAll);

				String subtax = String.format("Rs.%.2f", ptax);
				jTax1.setText(subtax);

				String TotalAll = String.format("Rs.%.2f", addUp);
				jNetprice1.setText(TotalAll);

			}
		});
		btnSum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnSum.setBounds(161, 468, 138, 23);
		contentPane.add(btnSum);

		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				jName.setText(null);
				jQty1.setText(null);
				jQty2.setText(null);
				jQty3.setText(null);
				jQty4.setText(null);
				jQty5.setText(null);
				jPrice1.setText(null);
				jPrice2.setText(null);
				jPrice3.setText(null);
				jPrice4.setText(null);
				jPrice5.setText(null);
				jSubtotal1.setText(null);
				jSubtotal2.setText(null);
				jSubtotal3.setText(null);
				jSubtotal4.setText(null);
				jSubtotal5.setText(null);
				jTotal1.setText(null);
				jTax1.setText(null);
				jNetprice1.setText(null);
				jTextarea2.setText(null);
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(426, 468, 89, 23);
		contentPane.add(btnReset);

		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd:mm:yyyy");
				Tdate.format(timer.getTime());

				String name = String.format(jName.getText());
				String Qty1 = String.format(jQty1.getText());
				String Qty2 = String.format(jQty2.getText());
				String Qty3 = String.format(jQty3.getText());
				String Qty4 = String.format(jQty4.getText());
				String Qty5 = String.format(jQty5.getText());
				String Total = String.format(jTotal1.getText());
				String Tax = String.format(jTax1.getText());
				String Netprice = String.format(jNetprice1.getText());

				jTextarea2.append("\n\n\t   MUNCH BOX" + "\n\n Customer Name :\t\t" + name
						+ "\n================================================" + "\n  Manchow Soup\t\t" + Qty1
						+ "\n  Baby Corn Manchurian\t\t" + Qty2 + "\n  Veg Biryani\t\t\t" + Qty3
						+ "\n  Paneer Roll\t\t\t" + Qty4 + "\n  Oreo Milkshake\t\t" + Qty5
						+ "\n==================================================" + "\n  Total :\t\t\t" + Total
						+ "\n  Tax :\t\t\t" + Tax + "\n  Net Amount :\t\t\t" + Netprice
						+ "\n==================================================" + "\n Date\t\t\t"
						+ Tdate.format(timer.getTime()) + "\n Time\t\t\t" + tTime.format(timer.getTime())
						+ "\n\n\tTHANK YOU VISIT AGAIN");

				try {
					FileWriter writer = new FileWriter("C:\\java\\ibill.txt");
					try (BufferedWriter w = new BufferedWriter(writer)) {
					jTextarea2.write(w);
					}
					jTextarea2.requestFocus();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});
		btnReceipt.setBounds(705, 62, 89, 23);
		contentPane.add(btnReceipt);

		JLabel lblPaneerRoll = new JLabel("PANEER ROLL");
		lblPaneerRoll.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPaneerRoll.setBounds(50, 350, 126, 14);
		contentPane.add(lblPaneerRoll);

		JLabel lblOreoMilkshake = new JLabel("OREO MILKSHAKE");
		lblOreoMilkshake.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOreoMilkshake.setBounds(50, 412, 141, 14);
		contentPane.add(lblOreoMilkshake);

		jQty4 = new JTextField();
		jQty4.setHorizontalAlignment(SwingConstants.CENTER);
		jQty4.setBounds(254, 348, 53, 20);
		contentPane.add(jQty4);
		jQty4.setColumns(10);

		jPrice4 = new JTextField();
		jPrice4.setBounds(370, 348, 86, 20);
		contentPane.add(jPrice4);
		jPrice4.setColumns(10);

		jSubtotal4 = new JTextField();
		jSubtotal4.setBounds(512, 348, 76, 20);
		contentPane.add(jSubtotal4);
		jSubtotal4.setColumns(10);

		jQty5 = new JTextField();
		jQty5.setHorizontalAlignment(SwingConstants.CENTER);
		jQty5.setBounds(254, 410, 53, 20);
		contentPane.add(jQty5);
		jQty5.setColumns(10);

		jPrice5 = new JTextField();
		jPrice5.setBounds(370, 410, 86, 20);
		contentPane.add(jPrice5);
		jPrice5.setColumns(10);

		jSubtotal5 = new JTextField();
		jSubtotal5.setBounds(512, 410, 76, 20);
		contentPane.add(jSubtotal5);
		jSubtotal5.setColumns(10);

		lblNewLabel_1 = new JLabel("WELCOME TO MUNCH BOX");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(374, 11, 311, 23);
		contentPane.add(lblNewLabel_1);

		jTextarea2 = new JTextArea();
		jTextarea2.setForeground(Color.BLACK);
		jTextarea2.setBackground(SystemColor.info);
		jTextarea2.setBounds(705, 96, 341, 424);
		contentPane.add(jTextarea2);

		btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Munch Box",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(977, 545, 89, 23);
		contentPane.add(btnExit);
	}
}
