package The_Big_Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class GUI_Acount {
	public String idnaja;
	public String namenaja;
	public String balancenaja;
	JFrame frmBigbank;

	/**
	 * Launch the application.
	 * 
	 * @return
	 */

	public void ggg(String i, String n, String b) throws IOException {
		idnaja = i;
		namenaja = n;
		balancenaja = b;
	}

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Acount window = new GUI_Acount();
					window.frmBigbank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @return
	 */

	public GUI_Acount() throws IOException {
		Scanner fileIn = new Scanner(new FileReader("Mid.txt"));
		String kn = " ";
		while (fileIn.hasNext()) {
			kn = fileIn.nextLine();
			System.out.println(kn);
		}
		fileIn.close();
		String keepname = "Acount" + kn;
		Scanner fileIn2 = new Scanner(new FileReader(keepname + ".txt"));
		idnaja = fileIn2.next();
		namenaja = fileIn2.nextLine();
		while (fileIn2.hasNext()) {
			balancenaja = fileIn2.next();
		}

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() throws IOException {
		frmBigbank = new JFrame();
		frmBigbank.setTitle("BigBank");
		frmBigbank.setBounds(100, 100, 626, 336);
		frmBigbank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBigbank.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Acount");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Acount a = new GUI_Acount();
					frmBigbank.setVisible(false);
					a.frmBigbank.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(22, 25, 97, 25);
		frmBigbank.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Deposit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Deposit d = new GUI_Deposit();
					d.frmDeposit.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(248, 25, 97, 25);
		frmBigbank.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Withdraw");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Withdraw w = new GUI_Withdraw();
					w.frame.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_2.setBounds(368, 25, 97, 25);
		frmBigbank.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Payment");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Payment p = new GUI_Payment();
					p.frame.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(487, 25, 97, 25);
		frmBigbank.getContentPane().add(btnNewButton_3);

		JLabel lblName = new JLabel("ID");
		lblName.setBounds(22, 63, 91, 26);
		frmBigbank.getContentPane().add(lblName);

		JButton btnBalance = new JButton("Balance");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_Balance ba = new GUI_Balance();
					ba.frame.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnBalance.setBounds(133, 25, 97, 25);
		frmBigbank.getContentPane().add(btnBalance);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(22, 102, 56, 16);
		frmBigbank.getContentPane().add(lblName_1);

		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(22, 142, 56, 16);
		frmBigbank.getContentPane().add(lblBalance);

		JLabel lblNewLabel = new JLabel(idnaja);
		lblNewLabel.setBounds(90, 68, 303, 16);
		frmBigbank.getContentPane().add(lblNewLabel);

		JLabel lblNamenaja = new JLabel(namenaja);
		lblNamenaja.setBounds(90, 102, 255, 16);
		frmBigbank.getContentPane().add(lblNamenaja);

		JLabel lblM = new JLabel(balancenaja);
		lblM.setBounds(90, 142, 56, 16);
		frmBigbank.getContentPane().add(lblM);
	}

}
