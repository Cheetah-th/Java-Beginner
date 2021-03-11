package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Visibility;
import java.awt.event.ActionEvent;

public class GUI_WrongPass {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_WrongPass window = new GUI_WrongPass();
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

	public GUI_WrongPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWorng = new JLabel("Worng Username or Password Please Try again");
		lblWorng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWorng.setBounds(53, 23, 502, 30);
		frame.getContentPane().add(lblWorng);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnOk.setBounds(211, 78, 111, 36);
		frame.getContentPane().add(btnOk);
	}

}
