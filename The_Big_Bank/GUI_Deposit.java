package The_Big_Bank;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Deposit {

	JFrame frmDeposit;
	private JTextField textField;
	public int b;
	public String keepname;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Deposit window = new GUI_Deposit();
					window.frmDeposit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public GUI_Deposit() throws IOException {
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

	private void initialize() throws IOException {
		frmDeposit = new JFrame();
		frmDeposit.setTitle("Deposit");
		frmDeposit.setBounds(100, 100, 450, 233);
		frmDeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeposit.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Your Deposit");
		lblNewLabel.setBounds(62, 46, 102, 16);
		frmDeposit.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(176, 43, 148, 22);
		frmDeposit.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String depo = textField.getText();
				int depos = Integer.parseInt(depo);
				b += depos;
				PrintWriter fileOut;
				try {
					fileOut = new PrintWriter(new BufferedWriter(new FileWriter(keepname + ".txt", true)));
					fileOut.print("deposit" + " " + depos + " ");
					fileOut.print("balance" + " " + b + "\n");
					fileOut.close();
					frmDeposit.setVisible(false);

					GUI_Acount acc = new GUI_Acount();
					acc.frmBigbank.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(269, 101, 97, 25);
		frmDeposit.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeposit.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(59, 101, 97, 25);
		frmDeposit.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("Bath");
		lblNewLabel_1.setBounds(331, 46, 56, 16);
		frmDeposit.getContentPane().add(lblNewLabel_1);
	}

}
