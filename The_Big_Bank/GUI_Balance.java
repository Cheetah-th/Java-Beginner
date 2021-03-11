package The_Big_Bank;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.TextArea;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Balance {
	public int b;
	public String keepname;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Balance window = new GUI_Balance();
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
	
	public GUI_Balance() throws IOException {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String x = "sus";

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
		String id = fileIn2.next();
		String name = fileIn2.nextLine();
		String kkk;
		String bal;

		TextArea textArea = new TextArea();
		textArea.setBounds(0, 50, 432, 516);
		frame.getContentPane().add(textArea);
		textArea.setText(id);

		JButton btnNewButton = new JButton("End");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(144, 13, 97, 25);
		frame.getContentPane().add(btnNewButton);
		textArea.append(name + "\n");
		while (fileIn2.hasNext()) {
			kkk = fileIn2.next();
			bal = fileIn2.next();
			textArea.append(kkk + " ");
			textArea.append(bal + "\n");
		}

		// textArea.setText(id);
		// textArea.append(name);

	}
}
