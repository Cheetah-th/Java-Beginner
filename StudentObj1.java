import java.util.Scanner;

class Student_Obj1 {
	private int id;
	private String name;
	private double gpa;
	private double eng;
	private double math;
	private double science;
	private double calPoint;

	Student_Obj1(int a, String b, double c, double d, double e, double f) {
		id = a;
		name = b;
		gpa = c;
		eng = d;
		math = e;
		science = f;

	}

	public int GetID() {
		return id;
	}

	public String GetName() {
		return name;
	}

	public double GetGPA() {
		return gpa;
	}

	public double GetEng() {
		return eng;
	}

	public double GetMath() {
		return math;
	}

	public double GetScience() {
		return science;
	}

	public double GetCalPoint() {
		double calPoint = (2.5 * gpa) + (0.2 * eng) + (0.4 * math) + (0.3 * science);
		return calPoint;
	}

}

public class StudentObj1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Number of Stundent : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			System.out.print("Enter Name : ");
			String name = sc.next();
			System.out.print("Enter GPA : ");
			double gpa = sc.nextDouble();
			System.out.print("Enter Eng Score : ");
			double eng = sc.nextDouble();
			System.out.print("Enter Math Score : ");
			double math = sc.nextDouble();
			System.out.print("Enter Science Score : ");
			double science = sc.nextDouble();

			Student_Obj1 x = new Student_Obj1(id, name, gpa, eng, math, science);

			System.out.println("-----------------------");
			System.out.println("ID : " + x.GetID());
			System.out.println("Name : " + x.GetName());
			System.out.println("GPA : " + x.GetGPA());
			System.out.println("O-NET Eng : " + x.GetEng());
			System.out.println("O-NET Math : " + x.GetMath());
			System.out.println("O-NET Science : " + x.GetScience());
			System.out.println("Point : " + x.GetCalPoint());
			System.out.println("-----------------------");
		}

	}

}
