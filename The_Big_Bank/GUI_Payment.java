package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class GUI_Payment {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public int b;
	public int b2;
	public String keepname;
	public String keepname1;
	public String payto = "";

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Payment window = new GUI_Payment();
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
	
	public GUI_Payment() throws IOException {
		Scanner fileIn = new Scanner(new FileReader("Mid.txt")); /// people1 pay
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Payment to");
		lblNewLabel.setBounds(63, 42, 97, 16);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(195, 39, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Your payment\r\n");
		lblNewLabel_1.setBounds(63, 86, 79, 16);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(195, 83, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payto = textField.getText();

				keepname1 = "Acount " + payto;
				System.out.println(keepname1);
				String balance2 = null;
				Scanner fileIn3;
				try {
					fileIn3 = new Scanner(new FileReader(keepname1 + ".txt"));
					while (fileIn3.hasNext()) {
						balance2 = fileIn3.next();
					}
					b2 = Integer.parseInt(balance2);
					fileIn3.close();
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				String payment = textField_1.getText();

				int payments = Integer.parseInt(payment);
				if (b < payments) {
					try {
						GUI_Payment pa = new GUI_Payment();
						pa.frame.setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					b -= payments;
					b2 += payments;
				}
				PrintWriter fileOut;
				PrintWriter fileOut2;
				try {
					fileOut = new PrintWriter(new BufferedWriter(new FileWriter(keepname + ".txt", true))); // people1
					fileOut.print("withdraw" + " " + payments + " ");
					fileOut.print("balance" + " " + b + "\n");
					fileOut.close();
					fileOut = new PrintWriter(new BufferedWriter(new FileWriter(keepname + ".txt", true)));

					fileOut2 = new PrintWriter(new BufferedWriter(new FileWriter(keepname1 + ".txt", true)));
					fileOut2.print("deposit" + " " + payments + " ");
					fileOut2.print("balance" + " " + b2 + "\n");
					fileOut2.close();

					frame.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(264, 163, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(63, 163, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}

}
