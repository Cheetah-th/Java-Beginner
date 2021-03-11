package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI_Login {

	JFrame GUILogin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login window = new GUI_Login();
					window.GUILogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public GUI_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		GUILogin = new JFrame();
		GUILogin.setTitle("BIGBANK");
		GUILogin.setBounds(100, 100, 451, 306);
		GUILogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUILogin.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(0, 0, 433, 0);
		GUILogin.getContentPane().add(lblLogin);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(179, 13, 55, 48);
		GUILogin.getContentPane().add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(156, 74, 116, 22);
		GUILogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(156, 114, 116, 22);
		GUILogin.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(48, 72, 89, 22);
		GUILogin.getContentPane().add(lblNewLabel_1);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBounds(48, 112, 89, 22);
		GUILogin.getContentPane().add(lblPassword);

		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userin = textField_1.getText();
				String passin = textField_2.getText();
				Login a = new Login();
				try {
					switch (a.Login(userin, passin)) {
					case 1:
						GUI_Success s = new GUI_Success();
						s.frame.setVisible(true);
						GUILogin.setVisible(false);

						GUI_Acount ac = new GUI_Acount();
						ac.frmBigbank.setVisible(true);
						break;
					case 2:
						GUI_WrongPass w = new GUI_WrongPass();
						w.frame.setVisible(true);
						break;
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(242, 160, 134, 48);
		GUILogin.getContentPane().add(btnNewButton);

		JButton btnRegister = new JButton("Sign up");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Register re = new GUI_Register();
					re.GUIRegister.setVisible(true);
					GUILogin.setVisible(false);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRegister.setBounds(48, 160, 134, 48);
		GUILogin.getContentPane().add(btnRegister);

	}
}
