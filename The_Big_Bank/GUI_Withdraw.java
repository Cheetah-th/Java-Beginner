package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class GUI_Withdraw {

	JFrame frame;
	private JTextField textField;

	public int b;
	public String keepname;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Withdraw window = new GUI_Withdraw();
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

	public GUI_Withdraw() throws IOException {
		Scanner fileIn = new Scanner(new FileReader("Mid.txt"));
		String kn = " ";
		while (fileIn.hasNext()) {
			kn = fileIn.nextLine();
			System.out.println(kn);
		}
		fileIn.close();
		keepname = "Acount" + kn;
		String balance = null;
		Scanner fileIn2 = new Scanner(new FileReader(keepname + ".txt"));
		while (fileIn2.hasNext()) {
			balance = fileIn2.next();
		}
		b = Integer.parseInt(balance);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Your Withdraw");
		lblNewLabel.setBounds(60, 56, 112, 16);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(184, 53, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblBath = new JLabel("Bath");
		lblBath.setBounds(312, 56, 56, 16);
		frame.getContentPane().add(lblBath);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String wit = textField.getText();
				int with = Integer.parseInt(wit);
				if (b < with) {
					GUI_NoMoney g = new GUI_NoMoney();
					g.frame.setVisible(true);
				} else {
					b -= with;
					PrintWriter fileOut;
					try {
						fileOut = new PrintWriter(new BufferedWriter(new FileWriter(keepname + ".txt", true)));
						fileOut.print("withdraw" + " " + with + " ");
						fileOut.print("balance" + " " + b + "\n");

						fileOut.close();
						frame.setVisible(false);
						GUI_Acount ac = new GUI_Acount();
						ac.frmBigbank.setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		btnNewButton.setBounds(269, 101, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(75, 103, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}

}
