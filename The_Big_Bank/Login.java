package The_Big_Bank;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Login {
	public int Login(String u, String p) throws IOException {
		Scanner sc = new Scanner(System.in);
		String user = "nothing";
		String pass;
		String name;
		// System.out.println("USER NAME");
		String username = u;
		// System.out.println("PASSWORD");
		String password = p;

		Scanner fileIn = new Scanner(new FileReader("USER.txt"));

		while (fileIn.hasNext()) {
			user = fileIn.next();
			pass = fileIn.next();
			name = fileIn.nextLine();
			if (username.compareTo(user) == 0) {
				if (password.compareTo(pass) == 0) {
					System.out.println("Login Success");
					PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter("Mid.txt", true)));
					fileOut.print(name + "\n");
					fileOut.close();
					GUI_Acount a = new GUI_Acount();
					return 1;
					// break;
				} else {
					System.out.println("Wrong Username or password");
					return 2;
				}
			}
		}
		if (username.compareTo(user) != 0) {
			System.out.println("Wrong Username or password");
			return 2;
		}
		return 2;
	}

	/*
	 * public static void main(String[] args) throws IOException { User x = new
	 * User(); x.login("big","1234"); }
	 */
}
