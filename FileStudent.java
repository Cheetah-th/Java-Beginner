import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileStudent {

	public static void main(String[] args) throws IOException {
		Scanner fileIn = new Scanner(new FileReader("Student.txt"));
		PrintWriter xx = new PrintWriter("Report.txt");
		int count = 0;
		double sum = 0;
		while (fileIn.hasNext()) {
			int id = fileIn.nextInt();
			String name = fileIn.next() + " " + fileIn.next();
			double score = fileIn.nextDouble();
			count++;
			sum = sum + score;
			System.out.printf("%8d %15s %6.2f%n", id, formText(name, 15), score);
			xx.printf("%8d %15s %6.2f%n", id, formText(name, 15), score);
		}
		System.out.println("Number of Student = " + count);
		xx.println("Number of Student = " + count);
		System.out.println("Average = " + sum / count);
		xx.println("Average = " + sum / count);
		xx.close();
	}

	public static String formText(String x, int len) {
		int p = x.length();
		for (int i = p + 1; i <= len; i++) {
			x = x + " ";
		}
		return x;
	}
}
