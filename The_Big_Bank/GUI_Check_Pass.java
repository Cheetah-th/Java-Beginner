package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Check_Pass {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Check_Pass window = new GUI_Check_Pass();
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

	public GUI_Check_Pass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblPleaseUseThe = new JLabel("Please use the same password");
		lblPleaseUseThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPleaseUseThe.setBounds(67, 23, 299, 35);
		frame.getContentPane().add(lblPleaseUseThe);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnOk.setBounds(145, 71, 131, 44);
		frame.getContentPane().add(btnOk);
	}

}
