import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name => ");
		String name = sc.nextLine();
		System.out.print("Enter Score => ");
		double score = sc.nextDouble();
		char garde;
		if (score >= 85) garde = 'A';
		else if (score >= 70 && score < 85) garde = 'B';
			else if (score >= 60 && score < 70) garde = 'C';
				else if (score >= 50 && score < 60) garde = 'D';
					else garde = 'F';
		System.out.println(name+" "+score+" "+garde);
	}
}
