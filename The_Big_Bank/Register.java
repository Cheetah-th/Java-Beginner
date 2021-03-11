package The_Big_Bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Register extends Login {

	public Register(String n, String u, String pa, String pa2) throws IOException {
		String usern = "not thing";
		String passn = "not thing";
		String username = "not thing";
		String password = "not thing";
		String repass;
		String name = "not thing";
		String namew = "not thing";
		int p = 0;
		int id = 0;
		while (true) {
			if (p == 1) {
				break;
			}
			// Scanner sc = new Scanner(System.in);
			// System.out.println("Your name");
			name = n;
			// System.out.println("Uername : ");
			username = u;
			// System.out.println("Password");
			password = pa;
			// System.out.println("Comfirm Password");
			repass = pa2;
			if (password.compareTo(repass) != 0) {
				System.out.println("password not the same try again");
				GUI_Check_Pass cp = new GUI_Check_Pass();
				cp.frame.setVisible(true);
			}
			Scanner fileIn = new Scanner(new FileReader("USER.txt"));
			while (fileIn.hasNext()) {
				usern = fileIn.next();
				passn = fileIn.next();
				namew = fileIn.nextLine();
				id++;
				if (username.compareTo(usern) == 0) {
					System.out.println("This user name was used please try another username");
					GUI_Check_user cu = new GUI_Check_user();
					cu.frame.setVisible(true);
					id = 0;
					p = 1;
				}
			}
			if (usern.compareTo(username) != 0) {
				id++;
				System.out.println(name);
				System.out.println(username);
				System.out.println(password);
				System.out.println(id);
				PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter("USER.txt", true)));
				fileOut.print(username + " " + password + " " + name + "\n");
				fileOut.close();

				String filename = "Acount " + name;
				String path = filename + ".txt";
				File file = new File(path);
				FileWriter writer;
				try {
					writer = new FileWriter(file, true);
					writer.write(id + " ");
					writer.write(name + "\n");
					writer.write("deposit 500 balance 500\n");
					writer.close();
					System.out.println("Write Suck");
					GUI_WriteS ws = new GUI_WriteS();
					ws.frame.setVisible(true);
					break;
				} catch (IOException e) {
					e.printStackTrace();
				}
				// break;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		// Register x = new Register("tar2 eiei","tar2","2222","2222");
	}
}
