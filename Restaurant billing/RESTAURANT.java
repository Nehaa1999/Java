package myproject;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Restaurant {

	private JFrame frame;
	private JLabel lblUsername;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JPasswordField txtPassword;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 102));
		frame.setBounds(100, 100, 752, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblUsername = new JLabel(" USERNAME :");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setBounds(512, 85, 129, 25);
		frame.getContentPane().add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setBounds(512, 133, 182, 25);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		lblPassword = new JLabel("PASSWORD :");
		lblPassword.setForeground(new Color(0, 51, 0));
		lblPassword.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setBounds(512, 207, 129, 14);
		frame.getContentPane().add(lblPassword);

		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = String.copyValueOf(txtPassword.getPassword());
				String username = txtUsername.getText();
				if (password.contains("info") && username.contains("admin")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					frame.dispose();
					menu m = new menu();
					m.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Invalid login credentials");
					txtPassword.setText(null);
					txtUsername.setText(null);

				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(562, 325, 89, 23);
		frame.getContentPane().add(btnLogin);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(512, 251, 182, 25);
		frame.getContentPane().add(txtPassword);

		lblNewLabel_2 = new JLabel("MUNCH BOX");
		lblNewLabel_2.setForeground(new Color(102, 0, 102));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 34));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(63, 44, 333, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SANJANA\\Desktop\\azure-restaurant-terrace.jpg"));
		lblNewLabel.setBounds(0, 0, 496, 382);
		frame.getContentPane().add(lblNewLabel);
	}
}
