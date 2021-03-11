import java.util.Scanner;

class Student_Obj2 {
	private int id;
	private String name;
	private double gpa;
	private double eng;
	private double math;
	private double science;
	private double calPoint;

	Student_Obj2(int a, String b, double c, double d, double e, double f) {
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

public class StudentObj2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student_Obj2[] a = new Student_Obj2[100];
		int i = 1;
		while (true) {
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			if (id == -1) {	
				break;
			}
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
			
			a[i] = new Student_Obj2(id, name, gpa, eng, math, science);
			
			a[i].GetID();
			a[i].GetName();
			a[i].GetGPA();
			a[i].GetEng();
			a[i].GetMath();
			a[i].GetScience();
			a[i].GetCalPoint();
			i++;
		}
		for(int j = 1; j <= i - 1; j++) {
			System.out.println("-----------------------");
			System.out.println("ID : " + a[j].GetID());
			System.out.println("Name : " + a[j].GetName());
			System.out.println("GPA : " + a[j].GetGPA());
			System.out.println("O-NET Eng : " + a[j].GetEng());
			System.out.println("O-NET Math : " + a[j].GetMath());
			System.out.println("O-NET Science : " + a[j].GetScience());
			System.out.println("Point : " + a[j].GetCalPoint());
			System.out.println("-----------------------\n");
		}
		System.out.println("----------End----------");
		
	}

}
