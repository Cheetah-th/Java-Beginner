package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Blank {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Blank window = new GUI_Blank();
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

	public GUI_Blank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDontBlankThe = new JLabel("Don't Blank the box");
		lblDontBlankThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDontBlankThe.setBounds(61, 23, 226, 38);
		frame.getContentPane().add(lblDontBlankThe);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnOk.setBounds(101, 74, 127, 49);
		frame.getContentPane().add(btnOk);
	}
}
