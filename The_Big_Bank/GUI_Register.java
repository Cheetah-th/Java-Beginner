package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI_Register {

	JFrame GUIRegister;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Register window = new GUI_Register();
					window.GUIRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public GUI_Register() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() throws IOException {
		GUIRegister = new JFrame();
		GUIRegister.setTitle("Register");
		GUIRegister.setBounds(100, 100, 450, 300);
		GUIRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUIRegister.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(80, 69, 97, 16);
		GUIRegister.getContentPane().add(lblNewLabel);

		textField2 = new JTextField();
		textField2.setBounds(215, 66, 116, 22);
		GUIRegister.getContentPane().add(textField2);
		textField2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(80, 98, 113, 16);
		GUIRegister.getContentPane().add(lblNewLabel_1);

		textField3 = new JTextField();
		textField3.setBounds(215, 95, 116, 22);
		GUIRegister.getContentPane().add(textField3);
		textField3.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Comfirm Password");
		lblNewLabel_2.setBounds(80, 127, 113, 16);
		GUIRegister.getContentPane().add(lblNewLabel_2);

		textField4 = new JTextField();
		textField4.setBounds(215, 124, 116, 22);
		GUIRegister.getContentPane().add(textField4);
		textField4.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(80, 40, 56, 16);
		GUIRegister.getContentPane().add(lblNewLabel_3);

		textField1 = new JTextField();
		textField1.setBounds(215, 37, 116, 22);
		GUIRegister.getContentPane().add(textField1);
		textField1.setColumns(10);

		JButton btnNewButton = new JButton("Create Acount");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namein = textField1.getText();
				String userc = textField2.getText();
				String passc = textField3.getText();
				String passrc = textField4.getText();
				if (namein.compareTo("a") == 0 || userc.compareTo("a") == 0 || passc.compareTo("a") == 0
						|| passrc.compareTo("a") == 0) {
					// GUI_Blank b = new GUI_Blank();
					// b.frame.setVisible(true);
				}
				try {
					Register r = new Register(namein, userc, passc, passrc);

					GUIRegister.setVisible(false);
					GUI_Login l = new GUI_Login();
					l.GUILogin.setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(255, 189, 116, 41);
		GUIRegister.getContentPane().add(btnNewButton);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIRegister.setVisible(false);
				GUI_Login l = new GUI_Login();
				l.GUILogin.setVisible(true);
			}
		});
		btnCancle.setBounds(80, 189, 97, 41);
		GUIRegister.getContentPane().add(btnCancle);
	}
}
