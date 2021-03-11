package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI_NOMPAY {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_NOMPAY window = new GUI_NOMPAY();
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

	public GUI_NOMPAY() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblYouDontHave = new JLabel("You don't have enough to payment");
		lblYouDontHave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblYouDontHave.setBounds(52, 42, 342, 25);
		frame.getContentPane().add(lblYouDontHave);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnOk.setBounds(169, 80, 97, 25);
		frame.getContentPane().add(btnOk);
	}

}
